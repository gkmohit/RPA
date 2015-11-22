package database;

import com.orm.SugarRecord;

/**
 * Created by AirUnknown on 15-11-22.
 */
public class Login extends SugarRecord<Login> {
    String userName;
    String password;
    String email;
    Person person;

    public Login() {
    }

    public Login(String userName, String password, String email, Person person) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.person = person;
    }

}
