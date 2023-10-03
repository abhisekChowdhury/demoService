package com.example.DemoService;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
    int id;
    String firstName;
    String lastName;
    String emailAddress;

    public User(int id, String firstName, String lastName, String emailAddress) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
    }

    @JsonProperty("id")
    public int getId() {
        return this.id;
    }

    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("emailAddress")
    public String getEmailAddress() {
        return emailAddress;
    }
}
