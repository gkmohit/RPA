package model;

import java.security.Timestamp;
import java.util.Date;

/**
 * Created by Shrey on 11/21/2015.
 */
public class Cash {
    private String aid;
    private int amount;
    private int credit;
    private int debit;
    private Timestamp timestamp;

    public Cash(String aid, int amount, int credit, int debit, Timestamp timestamp) {
        if (aid != null) {
            this.aid = aid;
            this.amount = amount;
            this.credit = credit;
            this.debit = debit;
            this.timestamp = timestamp;
        }
    }
    public int getAmount(){
        return amount;
    }

    public String getAid() {
        return aid;
    }

    public int getCredit() {
        return credit;
    }

    public int getDebit() {
        return debit;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }
}





/*
create table cash (
       aid varchar(20) not null,
       amount integer,
       time_updated timestamp,
       constraint cash_pk
                  primary key(aid),
       constraint cash_fk_aid
                  foreign key(aid) references asset
);
 */
