package model;

import java.security.Timestamp;

/**
 * Created by Shrey on 11/21/2015.
 */
public class Credit {

    private String aid;
    private double available_credit;
    private Timestamp timestamp;

    public Credit(String aid, double available_credit, Timestamp timestamp) {
        if (aid != null) {
            this.aid = aid;
            this.available_credit = available_credit;
            this.timestamp = timestamp;
        }
    }


    public double getAvailable_credit() {
        return available_credit;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }
}

/*
create table credit (
    aid varchar(20) not null,
    avail_credit integer(30),
    time_updated timestamp,
    constraint credit_pk
            primary key(aid),
    constraint credit_fk_aid
            foreign key(aid) references asset
);
 */