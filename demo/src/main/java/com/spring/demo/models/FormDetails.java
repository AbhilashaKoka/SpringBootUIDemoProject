package com.spring.demo.models;

public class FormDetails {
    private String LastName;
    private String  Email;
    private String  Gender;
    private String Mobile;
    private String DOB;
    private String Subject;
    private String Hobbies;
    private String CurrAddr;
    private String State;
    private String City;

    public FormDetails(String lastName, String email, String gender, String mobile, String DOB, String subject, String hobbies, String currAddr, String state, String city) {
        LastName = lastName;
        Email = email;
        Gender = gender;
        Mobile = mobile;
        this.DOB = DOB;
        Subject = subject;
        Hobbies = hobbies;
        CurrAddr = currAddr;
        State = state;
        City = city;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public String getHobbies() {
        return Hobbies;
    }

    public void setHobbies(String hobbies) {
        Hobbies = hobbies;
    }

    public String getCurrAddr() {
        return CurrAddr;
    }

    public void setCurrAddr(String currAddr) {
        CurrAddr = currAddr;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }
}
