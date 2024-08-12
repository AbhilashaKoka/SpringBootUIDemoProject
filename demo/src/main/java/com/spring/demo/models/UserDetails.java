package com.spring.demo.models;

public class UserDetails {


    public UserDetails(String username, String email, String currentaddress, String permanentaddress) {
        this.username = username;
        this.email = email;
        this.currentaddress = currentaddress;
        this.permanentaddress = permanentaddress;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurrentaddress() {
        return currentaddress;
    }

    public void setCurrentaddress(String currentaddress) {
        this.currentaddress = currentaddress;
    }

    public String getPermanentaddress() {
        return permanentaddress;
    }

    public void setPermanentaddress(String permanentaddress) {
        this.permanentaddress = permanentaddress;
    }

    private String  username;
   private String email;
   private String currentaddress;
   private String permanentaddress;

}
