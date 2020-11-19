package replitProjects;

public class R118_ArrayPrinting3 {
    public static void main(String[] args) {

        String[] arr = {"apple", "banana","kiwi", "grape","milk","soda"};
        for(int i = 0; i <= arr.length-3; i++){

            System.out.println(arr[i] + ", " + arr[i+1] + ", " + arr[i+2]);
        }
    }
}
/*
The code provided in your main method will take in six Strings and save them into an array called arr.
Print out the 3 neighboring items of the array in one line until the last line
each line should contain 3 neighboring items of array element as displayed below
user for loop
Example:
arr -> ["apple", "banana","kiwi", "grape","milk","soda"]
 prints:  apple , banana , kiwi
          banana , kiwi , grape
          kiwi , grape , milk
          grape , milk , soda
 */