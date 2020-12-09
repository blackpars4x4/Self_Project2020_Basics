package replitProjects;

import java.util.Scanner;

public class R163_MethodsWithReturn_CountAppearance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        String[] array = new String[length];
        for (int i = 0; i < length; i++){
            array[i] = scanner.next();
        }
        String str = scanner.next();
        System.out.println(count_appearance(array,str));
    }

    public static int count_appearance(String[] arr, String t) {
        int count = 0;

        for (String each : arr) {
            if (t.equalsIgnoreCase(each)) {
                count++;
            }

        }

        return count;

    } //end  count_appearance

}
/*
Create a method that gets an array of strings and a string, the method returns an int.

It counts how many times a string appears in the array and returns the count.

for example (pseudo code):

some_array = ["a","foo","bar","foo","bla"]

some_string = "foo"

count_appearance(some_array ,some_string )

will return 2 because some_array  has 2 appearances of "foo" string.

 */