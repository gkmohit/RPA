package model;

import java.util.*;
import java.io.*;

public class Bank {
    String bid;
    String bname;

    public Bank(String bid, String bname){
        if(bid != null){
            this.bid = bid;
            this.bname = bname;
        }
    }

    public Bank(Bank b){
        new Bank(b.bid, b.bname);
    }

//	create table bank (
//			bid varchar(20) not null,
//			bname varchar(30),
//			constraint bank_pk
//			primary key(bid)
//			);
}

