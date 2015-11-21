package model;

/**
 * Created by AirUnknown on 15-11-21.
 */

//create table person (
//        pid varchar(20) not null,
//        firstName varchar(25) not null,
//        laststName varchar(25) not null,
//        age varchar(3) not null,
//        country varchar(25),
//        phoneNumber varchar(20),
//        constraint person_pk
//        primary key(pid)
//        );
public class Person {
    private String mFirstName;
    private String mLastName;
    private int mAge;
    private String mCountry;
    private String mPhoneNumber;
    private int mPid;


    public Person(String firstName, String lastName, int age, int pid) {
        mFirstName = firstName;
        mLastName = lastName;
        mAge = age;
        mPid = pid;
    }

    public Person(String firstName, String lastName, int age, String country, String phoneNumber, int pid) {
        mFirstName = firstName;
        mLastName = lastName;
        mAge = age;
        mCountry = country;
        mPhoneNumber = phoneNumber;
        mPid = pid;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String firstName) {
        mFirstName = firstName;
    }

    public String getLastName() {
        return mLastName;
    }

    public void setLastName(String lastName) {
        mLastName = lastName;
    }

    public int getAge() {
        return mAge;
    }

    public void setAge(int age) {
        mAge = age;
    }

    public String getCountry() {
        return mCountry;
    }

    public void setCountry(String country) {
        mCountry = country;
    }

    public String getPhoneNumber() {
        return mPhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        mPhoneNumber = phoneNumber;
    }

    public int getPid() {
        return mPid;
    }

    public void setPid(int pid) {
        mPid = pid;
    }
}

