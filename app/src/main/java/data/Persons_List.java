package data;

import java.util.Set;
import java.util.TreeSet;

import model.Person;

/**
 * Created by Shrey on 11/21/2015.
 */
public class Persons_List {

//static void main(String[] args){


    public Set<Person> persons = new TreeSet<>();



    Person jack = new Person("Jack", "Ma", "2980 Leslie Street, Toronto, M3J 4B9", 45, "6478764334");
    Person sndy = new Person("Andy", "Do Nhat", "Etobicoke", 25, "6378963454");
    Person moo = new Person("Mohit", "Kishore", "North York", 23, "6478653762");
    Person sangeev = new Person("Sangeev", "Mo", "Toronto", 22, "6479873254");

    persons.add(jack);
    persons.add(andy);
    persons.add(moo);
    persons.add(sangeev);


    //String first_name, String last_name, String address, int age, String phone_number, ArrayList<Asset> assets

   // }
}