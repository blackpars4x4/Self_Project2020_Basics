package replitProjects.R221_Static1_Telephone;

public class Telephone {
    public String number;

    public static int quantity;
    public static double total;


    static{
        quantity = 250;
        total = 15658.92;
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
