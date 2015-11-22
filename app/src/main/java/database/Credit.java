package database;

import com.orm.SugarRecord;

/**
 * Created by AirUnknown on 15-11-22.
 */
public class Credit extends SugarRecord<Credit> {

    Asset asset;
    double availableCredit;
    String timeUpdated;

    public Credit() {
    }

    public Credit(Asset asset, double availableCredit, String timeUpdated) {
        this.asset = asset;
        this.availableCredit = availableCredit;
        this.timeUpdated = timeUpdated;
    }
}
