package com.company.domain;

public class PersonRecord {

    private String firstName;
    private String secondName;
    private String age;
    private String phoneNumber;

    public PersonRecord(String firstName, String secondName, String age, String phoneNumber) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    PersonRecord(){}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static PersonRecord recordProvider(){
        return new PersonRecord();
    }

    @Override
    public String toString() {
        return "{firstName:" + firstName + ","
                + "secondName:" + secondName + ","
                + "age:" + age + "," +
                "phoneNumber:" + phoneNumber + "}";
    }
}
