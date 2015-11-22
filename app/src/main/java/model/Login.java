package model;


public class Login {

    private String username;
    private int per_id;
    private String password;
    private String email;

    public Login(String username, int per_id, String email, String pwd)
    {
            this.username = username;
            this.email = email;
            this.password = pwd;
            this.per_id = per_id;
    }

    public String get_username(){
        return this.username;
    }
    public String get_password() { return this.password; }
}


/*create table login (
    pid varchar(20) not null,
    username varchar(20) not null,
    password varchar(20) not null,
    email varchar(20) not null,
    constraint login_pk
            primary key(pid, username),
    constraint login_fk_pid
            foreign key(pid) references person
);*/

