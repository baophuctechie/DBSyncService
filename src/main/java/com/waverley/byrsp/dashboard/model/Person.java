package com.waverley.byrsp.dashboard.model;

import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;

/**
 * Created by linhnguyen on 10/12/15.
 */
public class Person extends BeanPropertyItemSqlParameterSourceProvider {
    int id;
    String firstName, lastName, school;
    int rollNumber;

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getSchool() {
        return school;
    }
    public void setSchool(String school) {
        this.school = school;
    }
    public int getRollNumber() {
        return rollNumber;
    }
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return "Hello, " + firstName + " " + lastName
                + "! Welcome to " + school + "! Your ID is " + id;
    }
}
