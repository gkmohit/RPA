package data;

import java.util.Set;
import java.util.TreeSet;

import model.Person;

/**
 * Created by Shrey on 11/21/2015.
 */
public class Persons_List {



    public static Set<Person> persons = new TreeSet<>();
    public static Person personArray[];

    static {

        Person jack = new Person("Jack", "Ma", "2980 Leslie Street, Toronto, M3J 4B9", 45, "6478764334");
        Person andy = new Person("Andy", "Do Nhat", "Etobicoke", 25, "6378963454");
        Person moo = new Person("Mohit", "Kishore", "North York", 23, "6478653762");
        Person sangeev = new Person("Sangeev", "Mo", "Toronto", 22, "6479873254");

        persons.add(jack);
        persons.add(andy);
        persons.add(moo);
        persons.add(sangeev);

//        personArray
    }
}