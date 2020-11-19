package replitProjects;

import java.util.Scanner;

public class R89_PrintFirstAndLastLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        System.out.println(input.substring(0,1)+input.substring(input.length()-1));
    }
}
