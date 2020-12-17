package replitProjects;

import java.util.ArrayList;
import java.util.Arrays;

public class AssessmentTest2_1_AppearsTwice {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(appearsTwice("laptop", "I would like to buy a new laptop, because my laptop is too old."));

    }

    /**
     *target - string that you need to check.
     * sentence - string where you need to lookup for target.
     *
     */
    public static boolean appearsTwice(String target, String sentence) {
        //write your codes here:
        ArrayList<String> list = new ArrayList<> (Arrays.asList(sentence.split(" ")));

        if(list.contains(target)){
            return true;
        }else{
            return false;
        }

       /* for(String each : list){
            if(each.equalsIgnoreCase(target)){
                return true;
            }else{
                return false;
            }
        }*/

    }
}
/*
Write a a method appearsTwice() that returns true if value of variable
target appears only twice in the string sentence, otherwise return false.

Examples:
Main.appearsTwice("java", "java is fun!")
      - returns false, because java appears only once.

Main.appearsTwice("laptop", "I would like to buy a new laptop, because my laptop is too old.")
      - returns true, because laptop appears twice.
 */