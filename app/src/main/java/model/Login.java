package model;

/**
 * Created by AirUnknown on 15-11-21.
 */

//create table login (
//        pid varchar(20) not null,
//        username varchar(20) not null,
//        password varchar(20) not null,
//        email varchar(20) not null,
//        constraint login_pk
//        primary key(pid, username),
//        constraint login_fk_pid
//        foreign key(pid) references person
//        );
public class Login {

    private String mUserName;
    private String mPassword;
    private String mEmail;

    public Login(String userName, String password, String email) {
        mUserName = userName;
        mPassword = password;
        mEmail = email;
    }


    public String getUserName() {
        return mUserName;
    }

    public void setUserName(String userName) {
        mUserName = userName;
    }

    public String getPassword() {
        return mPassword;
    }

    public void setPassword(String password) {
        mPassword = password;
    }

    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String email) {
        mEmail = email;
    }
}
