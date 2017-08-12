package com.example.nilkesh.jsonvolley;

/**
 * Created by NILKESH on 17-05-2017.
 */

public class ModelData {

String name,email,gender,Address,mobile,home,office;
    public  ModelData(String name,String email,String gender,String Address,String mobile,String home,String office)
    {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.Address = Address;
        this.mobile = mobile;
        this.home = home;
        this.office = office;

    }

    public ModelData() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }
}
