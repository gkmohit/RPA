package model;

public class PersonAsset {

    private int pid;
    private String aid;
    private String bid;

    public PersonAsset(int pid_1, String aid_1, String bid) {

        if (pid_1 != 0 && aid_1 != null) {
            this.pid = pid_1;
            this.aid = aid_1;
            this.bid = bid;
        }

    }

}