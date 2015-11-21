package model;


/**
 * Created by AirUnknown on 15-11-21.
 */

//import java.io.*;
import java.util.*;

public class Person {

    private String first_name;
    private String last_name;
    private String address;
    private int age;
    private String phone_number;
    private int per_id;
    private ArrayList<Asset> Assets;
    private Login login;
    //private static int pids[];

    public Person(String first_name, String last_name, String address, int age, String phone_number) {
        if(first_name != null && last_name != null){
            this.first_name = first_name;
            this.last_name = last_name;
            this.address = address;
            this.age = age;
            this.phone_number = phone_number;
            per_id = IdGenerator.nextPId();
            login = new Login(first_name.toLowerCase()+last_name.toLowerCase(), per_id, first_name.toLowerCase()+"@gmail.com", "hello");
        }

    }

    public int get_personId(){
        return per_id;
    }

    public String  get_firstName() {
        return new String(first_name);
    }

    public String get_lastName(){
        return new String(last_name);
    }

    public String get_fullName(){
        return new String("" + first_name + " " + last_name);
    }

    public Login getLogin() {
        return login;
    }
}

