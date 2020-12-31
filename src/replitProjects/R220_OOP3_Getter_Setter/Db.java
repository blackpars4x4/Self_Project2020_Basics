package replitProjects.R220_OOP3_Getter_Setter;

class Db {

    private String data;
    private int yint;

    public void insertData(String data, int yint) {
        this.data = data;
        this.yint = yint;
    }

    public String getData() {
        return data;
    }

    public int getYint() {
        return yint;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setYint(int yint) {
        this.yint = yint;
    }
}
