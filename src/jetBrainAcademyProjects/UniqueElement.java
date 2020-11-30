package jetBrainAcademyProjects;
/*
create a function that can print the unique elements from the array
 */

public class UniqueElement {
    public static void main(String[] args) {
        int[] intArray = {1, 1, 1, 5, 6, 9, 9, 10,10};

        String result = "";


        for (int anIntArray : intArray) {
            int count = 0;
            for (int anIntArray1 : intArray) {
                if (anIntArray == anIntArray1) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(anIntArray);
            }
        }
    }
}
