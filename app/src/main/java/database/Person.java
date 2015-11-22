package database;

import com.orm.SugarRecord;

/**
 * Created by AirUnknown on 15-11-22.
 */
public class Person extends SugarRecord<Person> {
    String pid;
    String firstName;
    String lastName;
    int age;
    String country;
    String phoneNumber;

    public Person() {
    }

    public Person(String pid, String firstName, String lastName, int age, String country, String phoneNumber) {
        this.pid = pid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.country = country;
        this.phoneNumber = phoneNumber;
    }
}
