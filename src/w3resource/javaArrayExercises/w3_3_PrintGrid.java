package w3resource.javaArrayExercises;

public class w3_3_PrintGrid {
    /*
    3. Write a Java program to print the following grid. Go to the editor

Expected Output :

- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -

     */
    public static void main(String[] args) {

        int [][] arr = new int[10][10];

        for (int i = 0; i <= arr.length-1; i++){
            for(int j = 0; j <= arr.length-1; j++){
                System.out.printf("- ", arr[i][j] );
            }
            System.out.println();
        }

    }
}
