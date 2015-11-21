package model;

/**
 * Created by AirUnknown on 15-11-21.
 */
public class IdGenerator {

    public static int mPid = 0;

    public static int getmPid() {
        return mPid;
    }

    public static void setmPid(int mPid) {
        IdGenerator.mPid = mPid;
    }

    public static int nextPId(){
        IdGenerator.setmPid(IdGenerator.mPid++);
        return IdGenerator.mPid;
    }
}
