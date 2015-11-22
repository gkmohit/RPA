package database;

import com.orm.SugarRecord;

/**
 * Created by AirUnknown on 15-11-22.
 */
public class Bank  extends SugarRecord<Bank> {
    String bid;
    String bName;

    public Bank() {
    }

    public Bank(String bid, String bName) {
        this.bid = bid;
        this.bName = bName;
    }

}
