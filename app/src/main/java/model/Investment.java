package model;

import java.security.Timestamp;

/**
 * Created by Shrey on 11/21/2015.
 */
public class Investment {

    private String aid;
    private String st_company_name;
    private double bought_price;
    private Timestamp timestamp;


    public Investment(String aid, String st_company_name, double bought_price, Timestamp timestamp) {
        if (aid != null) {
            this.aid = aid;
            this.st_company_name = st_company_name;
            this.bought_price = bought_price;
            this.timestamp = timestamp;
        }
    }

    public String getSt_company_name() {
        return st_company_name;
    }

    public double getBought_price() {
        return bought_price;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }
}
