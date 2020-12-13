package replitProjects;

import java.util.ArrayList;
import java.util.Arrays;

public class R_MethodsWithArrayList_combinesAll {
    public static void main(String[] args) {
        ArrayList<String > wordList1=new ArrayList<>(Arrays.asList("a","b"));
        ArrayList<String > wordList2=new ArrayList<>(Arrays.asList("c","d"));

        System.out.println(combineAL(wordList1,wordList2));
    }
    public static ArrayList<String> combineAL(ArrayList<String > list1, ArrayList<String > list2){
        ArrayList<String > str = new ArrayList<>();
        str.addAll(list1);
        str.addAll(list2);
        return str;


    }
}
/*
Create a static method that:
is called combineAL
returns an ArrayList
takes two parameters: an ArrayList of Strings called wordList1, and an ArrayList of Strings called wordList2

This method should create a new ArrayList of Strings, add all the words (in order) from wordList1, then add all the words (in order) from wordList2.
In other words, it is combining all the elements from the two parameters.
 */