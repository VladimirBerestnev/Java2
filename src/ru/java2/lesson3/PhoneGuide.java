package ru.java2.lesson3;

public class PhoneGuide {

    private String phoneNumber;
    private String name;
    private String lastName;

    public PhoneGuide(String phoneNumber, String name, String lastName) {

        this.phoneNumber = phoneNumber;
        this.name = name;
        this.lastName = lastName;

    }

    @Override
    public String toString() {
        return this.lastName + " " + this.name + " " + this.phoneNumber;

    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }
}
