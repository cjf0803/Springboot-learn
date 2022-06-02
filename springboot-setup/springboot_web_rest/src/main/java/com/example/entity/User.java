package com.example.entity;

public class User {
    private Integer id;
    private String username;
    private  String address;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getAddress() {
        return address;
    }

    public User(Integer id, String username, String address) {
        this.id = id;
        this.username = username;
        this.address = address;
    }
    public User(){

    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
