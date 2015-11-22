package database;

import com.orm.SugarRecord;

/**
 * Created by AirUnknown on 15-11-22.
 */
public class Stock  extends SugarRecord<Stock> {
    String companyName;
    int shareNumber;
    double purchasePrice;
    String time_updated;
    Asset asset;

    public Stock() {
    }

    public Stock(String companyName, int shareNumber, double purchasePrice, String time_updated, Asset asset) {
        this.companyName = companyName;
        this.shareNumber = shareNumber;
        this.purchasePrice = purchasePrice;
        this.time_updated = time_updated;
        this.asset = asset;
    }
}
