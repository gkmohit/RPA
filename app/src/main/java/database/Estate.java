package database;

import com.orm.SugarRecord;

/**
 * Created by AirUnknown on 15-11-22.
 */
public class Estate  extends SugarRecord<Estate> {

    double amount;
    String trustee;
    String time_updated;
    Asset asset;

    public Estate() {
    }

    public Estate(double amount, String trustee, String time_updated, Asset asset) {
        this.amount = amount;
        this.trustee = trustee;
        this.time_updated = time_updated;
        this.asset = asset;
    }
}
