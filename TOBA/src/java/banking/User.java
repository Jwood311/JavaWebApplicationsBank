package banking;
import java.io.Serializable;
/**
 *
 * @author Josh
 */
public class User implements Serializable{
    
    private String firstName;
    private String lastName;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String email;
    private String userName;
    private String password;
    
    public User(){
        
    }
    public User(String firstName, String lastName, String phone, String address, String city, String state,
            String zipCode, String email, String userName, String password){
           this.firstName = firstName;
            this.lastName = lastName;
            this.phone = phone;
            this.address = address;
            this.city = city;
            this.state = state;
            this.zipCode = zipCode;
            this.email = email;
            this.userName = userName;
            this.password = password;
    }
    
    //getters
    public String getFirstName(){
            return firstName;
    }
    public String getLastName(){
            return lastName;
    }
    public String getPhone(){
            return phone;
    }
    public String getAddress(){
            return address;
    }
    public String getCity(){
            return city;
    }
    public String getState(){
            return state;
    }
    public String getZipCode(){
            return zipCode;
    }
    public String getEmail(){
            return email;
    }
    public String getUserName(){
            return userName;
    }
    public String getPassword(){
            return password;
    }
    
    //setters
    public void setFirstName(String firstName){
           this.firstName = firstName;
    }
    public void setLastName(String lastName){
            this.lastName = lastName;
    }
    public void setPhone(String phone){
            this.phone = phone;
    }
    public void setAddress(String address){
            this.address = address;
    }
    public void setCity(String city){
            this.city = city;
    }
    public void setState(String state){
            this.state = state;
    }
    public void setZipCode(String zipCode){
            this.zipCode = zipCode;
    }
    public void setEmail(String email){
            this.email = email;
    }
    public void setUserName(String userName){
            this.userName = userName;
    }
    public void setPassword(String password){
            this.password = password;
    }
}
