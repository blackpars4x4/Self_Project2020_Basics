package replitProjects;

import java.util.Scanner;

public class R83_First_Two_Characters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String txt = scan.nextLine();

        System.out.print(txt.substring(0, 2));

    }
}
/*
using substring method output the first two letters of txt string
for example:
String txt = "foo"
the first two letters are "fo"


use print not println.


 */