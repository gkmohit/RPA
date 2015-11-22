package database;

import com.orm.SugarRecord;

/**
 * Created by AirUnknown on 15-11-22.
 */
public class PersonAsset extends SugarRecord<PersonAsset> {
    Person person;
    Asset asser;
    Bank bank;

    public PersonAsset() {
    }

    public PersonAsset(Person person, Asset asser, Bank bank) {
        this.person = person;
        this.asser = asser;
        this.bank = bank;
    }
}
