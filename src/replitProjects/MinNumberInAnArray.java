package replitProjects;

/*
create a function that can print out the minimum number from any given integer array
 */
public class MinNumberInAnArray {
    public static void main(String[] args) {
        int[] array = {10, 2, 3, 6, 9, 25};

        int min = array[0];

        for (int i = 0; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }

        }
        System.out.println(min);
    }
}
