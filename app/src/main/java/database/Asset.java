package database;

import com.orm.SugarRecord;

/**
 * Created by AirUnknown on 15-11-22.
 */
public class Asset  extends SugarRecord<Asset> {
    String aid;
    String aType;

    public Asset() {
    }

    public Asset(String aType, String aid) {
        this.aType = aType;
        this.aid = aid;
    }
}
