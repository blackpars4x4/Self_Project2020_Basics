package replitProjects;

import java.util.Scanner;

public class StringNoEnd_82 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String txt = scan.nextLine();

        System.out.println(txt.substring(0, txt.length()-1));
    }

}
/*
In this exercise you get a string called txt .

output txt without its last letter.

for example:

txt = "foo"

output will be:
fo
 */