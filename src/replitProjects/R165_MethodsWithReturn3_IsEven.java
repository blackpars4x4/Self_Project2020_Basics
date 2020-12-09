package replitProjects;

import java.util.Scanner;

public class R165_MethodsWithReturn3_IsEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(isEven(scanner.nextInt()));
    }

    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        }else {
            return false;
        }
    }
}
/*
isEven method gets a number(int) if its even (2,4,8...) returns true.
if its odd return false.

for example:

isEven(1) --> false

isEven(8) --> true
 */