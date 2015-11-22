package model;

import java.io.*;
import java.util.*;

public class Asset implements Serializable {

    private String aid;
    private String atype;
    private Bank bcode;

    public Asset(String atype, Bank bcode){
        if(atype != null){
            this.atype = atype;
            this.aid = "" + Math.random();
            this.bcode = new Bank(bcode);

        }
    }
//	create table asset (
//		    aid varchar(20) not null,
//		    atype varchar(30) not null,
//		    constraint asset_pk
//		               primary key(aid)
//		 );
}
