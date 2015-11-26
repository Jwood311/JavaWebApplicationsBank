package data;

import java.sql.*;
import banking.User;


public class UserDB {
    public static int insert(User user){
    ConnectionPool pool = ConnectionPool.getInstance();
    Connection connection = pool.getConnection();
    PreparedStatement ps = null;
    
    String query
    = "INSERT INTO customer (first_name, last_name, phone_number, address, city, state, zip_code) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
    try {
        ps = connection.prepareStatement(query);
        ps.setString(1, user.getFirstName());
        ps.setString(2, user.getLastName());
        ps.setString(3, user.getPhone());
        ps.setString(4, user.getAddress());
        ps.setString(5, user.getCity());
        ps.setString(6, user.getState());
        ps.setString(7, user.getZipCode());
        return ps.executeUpdate();
    } catch ( SQLException e) {
        System.out.println(e);
        return 0;
    } finally {
        DBUtil.closePreparedStatement(ps);
        pool.freeConnection(connection);
    }    
}
    
    public static int update(User user){
    ConnectionPool pool = ConnectionPool.getInstance();
    Connection connection = pool.getConnection();
    PreparedStatement ps = null;
    
    String query
    = "UPDATE customer SET "
            + "first_name = ?, "
            + "last_name = ?, "
            + "phone_number = ?, "
            + "address = ?, "
            + "city = ?, "
            + "state = ?, "
            + "zip_code = ? ";
    try {
        ps = connection.prepareStatement(query);
        ps.setString(1, user.getFirstName());
        ps.setString(2, user.getLastName());
        ps.setString(3, user.getPhone());
        ps.setString(4, user.getAddress());
        ps.setString(5, user.getCity());
        ps.setString(6, user.getState());
        ps.setString(7, user.getZipCode());
        return ps.executeUpdate();
    } catch ( SQLException e) {
        System.out.println(e);
        return 0;
    } finally {
        DBUtil.closePreparedStatement(ps);
        pool.freeConnection(connection);
    }    
}
}
