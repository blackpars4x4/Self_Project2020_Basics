package w3resource.javaArrayExercises;

public class w3_2_SumValuesOfArray { //Write a Java program to sum values of an array
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7,8,9,10};

        int sum = 0;

        for(int each : arr){
            sum += each;
        }
        System.out.println(sum);
    }
}
