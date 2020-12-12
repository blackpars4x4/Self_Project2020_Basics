package replitProjects;

import java.util.ArrayList;
import java.util.Arrays;

public class R195_MethodsWithArrayList_SizeGet {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1,2,3,4,5));

        System.out.println(sum(list));
    }

    public static int sum(ArrayList<Integer> ints) {
        //write code here
        int total=0;
        for (int i=0; i < ints.size(); i++){
            total += ints.get(i);
        }

        return total;
    }

    }

/*
The next two methods are .size() and .get().

If we have an ArrayList called someList and an Array called arr,
 these two pretty much do the same thing:
someList.size()
arr.length

In other words, .size() returns the length (size) of the list.

The method .get(i) will return the element found at index i.
The following two expressions also do the same thing:
someList.get(4)
arr[4]

On the left, given an ArrayList of Integers called ints,
 find and return the sum of all the Integers in ints.
 */