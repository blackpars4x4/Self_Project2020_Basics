package replitProjects;

import java.util.Scanner;

public class First_Two_Characters_83 {
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