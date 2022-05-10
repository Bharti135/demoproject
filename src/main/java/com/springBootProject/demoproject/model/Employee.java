package com.springBootProject.demoproject.model;

import javax.persistence.*;

@Entity(name ="Employees")
public class Employee {
    @Id
    @GeneratedValue
    private  long id;
    @Column (name = "first_name")
    private  String  firstName;
    @Column (name = "second_name")

    private String lastName;
    @Column (name = "email")

    private String email;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
