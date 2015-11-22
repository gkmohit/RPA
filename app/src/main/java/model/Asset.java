package model;

import java.io.*;
import java.util.*;

public class Asset {

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
}
