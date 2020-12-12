package replitProjects;

import java.util.Arrays;

public class R190_MethodsWithArrays_MergeArrays {

        public static int[] mergR(int[] a, int[] b) {

            int lntg = a.length+b.length;
            int[] newArr = new int[lntg];

            for (int i =0; i < a.length; i++){
                newArr[i] = a[i];
            }
            for (int i =a.length, j = 0; i < lntg; i++, j++){
                newArr[i] = b[j];
            }
            return newArr;


        }//end mergR

        public static void main(String[] args) {

        int[] a = {1,2,3};
        int[] b = {4,5,6};

            System.out.println(Arrays.toString(mergR(a, b)));
        }
    }
/*
mergR merges two arrays into one.
it gets two int arrays and returns an int array

for example:

mergR([1,2,3],[4,5,6])
returns [1,2,3,4,5,6]

mergR([1,2],[6,8])
returns [1,2,6,8]

hint:
create a length int for the combined length of both arrays.
create an array with that length (thats the array we will return).
create an iterator for both arrays (int z=0).

loop first array and inside the loop insert current element to the return array (ret[z]=a[i];)
then increment the iterator for both arrays (z++).

do the same for the second array.
 */