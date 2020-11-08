package w3resource.javaArrayExercises;
/*
4. Write a Java program to calculate the average value of array elements.
 */
public class w3_4_AverageValueOfArray {
    public static void main(String[] args) {

        int[] arr = {40, 50, 60, 100};

        int sum = 0;
        String total ="";

        for(int each : arr){
            sum += each;
            total += each + " ";
        }
        System.out.println("The Average of " + total + " is: " + sum/arr.length);
    }
}
