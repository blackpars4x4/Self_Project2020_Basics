package replitProjects;

import java.util.ArrayList;
import java.util.Arrays;

public class R215_MethodsWithArrayList_2Times {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,5,3,7));

        System.out.println(twoTimes(arr));
    }

    //create your method below:
    public static ArrayList<Integer> twoTimes(ArrayList<Integer> list) {

        ArrayList<Integer> newList = new ArrayList<Integer>();

        for (int i = 0; i < list.size(); i++ ){

            int temp = list.get(i);
            newList.add(temp);
            newList.add(temp);

        }

        return newList;
    }

}
/*
Create a method that:

is called twoTimes
returns a new ArrayList of Integers
takes in a single parameter - an ArrayList of Integers

This method should create a new ArrayList of Integers that contains
every value of the ArrayList parameter repeated twice.

For example, if the parameter is
(1,5,3,7)
The method should return a new ArrayList of Integers with
(1,1,5,5,3,3,7,7)
 */