package database;

import com.orm.SugarRecord;

/**
 * Created by AirUnknown on 15-11-22.
 */
public class Insurance extends SugarRecord<Insurance> {
    Asset asset;
    String insureanceComapnyName;
    String timeUpdated;
    String insuranceName;

    public Insurance() {
    }

    public Insurance(Asset asset, String insureanceComapnyName, String timeUpdated, String insuranceName) {
        this.asset = asset;
        this.insureanceComapnyName = insureanceComapnyName;
        this.timeUpdated = timeUpdated;
        this.insuranceName = insuranceName;
    }
}
