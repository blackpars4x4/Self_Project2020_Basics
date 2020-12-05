package replitProjects;

import java.util.Scanner;

public class R152_Methods7_PlusMinus {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i <= size - 1; i++) {

            arr[i] = inp.nextInt();
        }

        plus_minus(arr);

    }//end of main method

    // write your codes here:
    public static void plus_minus(int[] array) {
            int countZero = 0;
            int countPositives = 0;
            int countNegatives = 0;
        for(int each : array){
            if(each > 0){
                countPositives++;
            }else if(each == 0){
                countZero++;
            }else{
                countNegatives++;
            }
        }
        System.out.println("positives: "+ countPositives+", negatives: "+countNegatives+", zero: "+countZero);
    }


}
/*
Create a method called plus_minus that gets an array of ints (int[]),
it outputs how many negative , positive and zero numbers are in the array.

for example:

plus_minus (new int[]{1,2,55,-9,-2,0});

will output:
positives:3, negatives:2, zeros:1
 */
