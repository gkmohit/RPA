package database;

import com.orm.SugarRecord;

/**
 * Created by AirUnknown on 15-11-22.
 */
public class Debit extends SugarRecord<Debit> {
    String timeUpdated;
    double availabeBalance;
    Asset asset;

    public Debit(String timeUpdated) {
        this.timeUpdated = timeUpdated;
    }

    public Debit(String timeUpdated, double availabeBalance, Asset asset) {
        this.timeUpdated = timeUpdated;
        this.availabeBalance = availabeBalance;
        this.asset = asset;
    }
}
