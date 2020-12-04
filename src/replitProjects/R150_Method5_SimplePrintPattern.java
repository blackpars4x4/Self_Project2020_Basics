package replitProjects;

public class R150_Method5_SimplePrintPattern {

    public static void printHollowRect() {
        // write your codes here

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 1 || i == 2 || i == 3) {
                    System.out.print("*   *");
                    break;
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {

        printHollowRect();
    }


}
/*
Create a method printHollowRect that prints a 5 on 5 hollow rectangle:


*****
*   *
*   *
*   *
*****

hint:you will need to use two nested for loops for that, and an if that
checks if its the last or first iteration of the loop (so you will know whet to print "*" or " ")
 */