package replitProjects;

import java.util.Arrays;

public class AssesmentTest3_3_ReverseInArray {

    public static void main(String[] args) {
        String[] array = {"apple", "pear"};
        System.out.println(Arrays.toString(reverse(array)));
    }

    /**
     * Reverses the order of the elements in the specified array
     * @param arr
     * @return array of strings
     */
    public static String[] reverse(String[] arr) {
        //write your codes here
        String[] strings = new String[arr.length];

        for( int i = 0, j = arr.length - 1; j >= 0; i++, j--){
            strings[i] = arr[j];
        }

        return strings;
    }

}
/*
Write the definition of a method reverse, whose parameter is an array of Strings.
The method reverses the elements of the array. The method returns an array of strings in the reversed order.
Example:
input: ["apple", "pear"]
output: ["pear", "apple"]
 */