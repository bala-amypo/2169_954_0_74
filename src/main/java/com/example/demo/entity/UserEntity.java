package com.example.demo.entity;

public class UserEntity {

    private @id Long id;
    private String user;
    private String vehicleNumber;
    private Double capacity;
    private Double fuelEff;

    public UserEntity() {
    }

    public UserEntity(Long id, String user, String vehicleNumber, Double capacity,Double fuelEff) {
        this.id = id;
        this.user = user;
        this.vehicleNumber = vehicleNumber;
        this.capacity = capacity;
        this.fuelEff=fuelEff;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}