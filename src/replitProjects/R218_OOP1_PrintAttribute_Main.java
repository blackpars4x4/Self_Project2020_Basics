package replitProjects;

public class R218_OOP1_PrintAttribute_Main {
    public static void main(String[] args) {

        R218_OOP1_PrintAttribute a = new R218_OOP1_PrintAttribute();
        a.name = "ball";
        a.color = "red";
        a.amount = 1;


        System.out.println(a.asString());
    }
}
