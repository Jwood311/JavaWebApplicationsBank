package banking;


import java.io.Serializable;
    
    

public class Account implements Serializable {
        
        private float balance;
        private User user;
    
        public enum type {
            Savings,
            Checking;
        }

        public Account(){
        }
        
        public Account(User theUser, float initBalance, enum accountType){
            user = theUser;
            balance = initBalance;
            this.enum.accountType;
            
        }
        
        public float credit(float creditAmount){
            balance += creditAmount;
            return balance;
        }
        
        public float debit (float debitAmount){
            balance -= debitAmount;
            return balance;
        }
        
        public float getBalance(){
            return balance;
        }
        public User getUser(){
            return User;
        }
        public enum getAccountType(){
            return type;
        }
        
        }
