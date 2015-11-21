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

    public Person(String fn, String ln, String add, int aGE, String pn)
    {
            first_name = fn;
            last_name = ln;
            address = add;
            age = aGE;
            phone_number = pn;
            per_id = IdGenerator.nextPId();
            login = new Login(first_name.toLowerCase(), per_id, first_name.toLowerCase()+"@gmail.com", "hello");

    }

    public int get_personId(){
        return per_id;
    }

    public String  get_firstName() {
        return first_name;
    }

    public String get_lastName(){
        return last_name;
    }

    public String get_fullName(){
        return first_name + " " + last_name;
    }

    public Login getLogin() {
        return login;
    }
}

