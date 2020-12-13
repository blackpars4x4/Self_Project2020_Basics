package replitProjects;

import java.util.ArrayList;
import java.util.Arrays;

public class R198_MethodsWithArrayList_removeAll {
    public static void main(String[] args) {

        ArrayList<String > str=new ArrayList<>(Arrays.asList("hi","hey","hi","yo"));
        System.out.println(test(str));

    }

    public static ArrayList<String> test(ArrayList<String > list){
        list.removeAll(Arrays.asList("hi"));
        return list;
    }
    }
/*
Create a static method that:
is called removeAll
returns nothing
takes two parameters: an ArrayList of Strings called wordList, and a String called targetWord

This method should go through every element of wordList and remove every instance of targetWord from the ArrayList.

Example:

ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("hi","hey","hi","yo"));

removeAll(wordList,"hi");

now wordList is ["hey","yo"]

 */