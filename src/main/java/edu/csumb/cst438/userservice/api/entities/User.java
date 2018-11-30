package edu.csumb.cst438.userservice.api.entities;

import org.springframework.data.annotation.Id;

public class User {
    
    @Id
    private String id;


    private String username;
    private String password;
    private double credit;

    public User() {}

    public User(String username, String password, double d){
        // this.id = id;
        this.username = username;
        this.password = password;
        // credit ~> "money” that user will be using to perform purchases
        this.credit = d;

    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @return the credit
     */
    public double getCredit() {
        return credit;
    }

    /**
     * @param credit the credit to set
     */
    public void setCredit(double credit) {
        this.credit = credit;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }


}