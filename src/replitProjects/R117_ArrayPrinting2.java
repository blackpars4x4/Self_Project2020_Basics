package replitProjects;

public class R117_ArrayPrinting2 {
    public static void main(String[] args) {

        String [] arr = {"apple", "banana","kiwi", "grape","milk", "soda","juice", "coffee"};

        for(int i = 0; i <= arr.length-1; i+=2){

            /*String result = arr[i];*/

            System.out.println(arr[i] + ", " + arr[i+1]);
        }

    }
}
    /*
    The code provided in your main method will take in eight Strings and save them into an array called arr.
    Print out the 4 lines using for loop:
    each line should contain a pair of array element as displayed below user for loop
    Example:
    arr -> ["apple", "banana","kiwi", "grape","milk", "soda","juice", "coffee"]
     prints:  apple , banana
              kiwi , grape
              milk, "soda"
              juice, coffee
     */