public class Recorder {
    private String dataTime;
    private String infocode;
    private String surce;
    private String task;

    public String getLevel() {
        return level;
    }

    private String level;

    public Recorder(String dataTime, String infocode, String surce, String task, String level) {
        this.dataTime = dataTime;
        this.infocode = infocode;
        this.surce = surce;
        this.task = task;
        this.level = level;
    }

    public String getDataTime() {
        return dataTime;
    }

    public String getInfocode() {
        return infocode;
    }

    public String getSurce() {
        return surce;
    }

    public String getTask() {
        return task;
    }


}
