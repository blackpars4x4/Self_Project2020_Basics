package replitProjects;

import java.util.Arrays;

public class R180_Methods_Cover {
    public static void main(String[] args) {
        System.out.println(coverString("hello hello", "ello")); //java [me]thods
    }

    public static String coverString(String main, String coverME) {

        String str = "";

        if (main.contains(coverME)) {
            str = main.replaceAll(coverME, "[" + coverME + "]");
            System.out.println(str);

        }
        return str;
    }
}
