package replitProjects;

import java.util.ArrayList;
import java.util.Arrays;

public class R197_MethodsWithArrayList_AddInsert {
    public static void main(String[] args) {
        ArrayList<String > list=new ArrayList<>(Arrays.asList("a","b","c","d","e"));
        test(list);

    }
    public static void test(ArrayList<String> words)
    {
        //write code here

        words.add(0,"hey");
        words.add(3,"yo");
        System.out.println(words);
    }
}
