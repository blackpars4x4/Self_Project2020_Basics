package replitProjects;

public class R188_Method_Overloading1 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 6, 7};
        double[] b = {1.2, 1.5, 6.5, 8.9};

        System.out.println(findMax(a));
        System.out.println(findMax(b));
    }

    public static int findMax(int[] arr) {

        int max = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }

    public static double findMax(double[] arr) {
        double max = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
/*
In this task, you need to write 2 methods findMax()
that will find a maximum number in the array.
First method should work with array of integers (int[]) and return int,
 and second method should work with an array of doubles (double[]) and
 return double as a result.
Methods must have the same name and different parameters.
Fo more information:
https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html

Comment: Methods should be non static and with a return type.
 */