package model;

public class PersonAsset {

    private int pid;
    private String aid;
    private String bid;

    public PersonAsset(int pid, String aid, String bid) {

        if (pid != 0 && aid != null) {
            this.pid = pid;
            this.aid = aid;
            this.bid = bid;
        }

    }

}