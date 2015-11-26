package data;

import java.sql.*;
import banking.Account;


public class AccountDB {
    public static int insert(Account account){
    ConnectionPool pool = ConnectionPool.getInstance();
    Connection connection = pool.getConnection();
    PreparedStatement ps = null;
    
    String query
    = "INSERT INTO customer (user, balance, type) "
            + "VALUES (?, ?, ?)";
    try {
        ps = connection.prepareStatement(query);
        ps.setString(1, account.getUser());
        ps.setString(2, account.getBalance());
        ps.setString(3, account.getAccountType());
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
