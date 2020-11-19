package replitProjects;

import java.util.Arrays;
import java.util.Scanner;

public class R_ArraysUtility {
    public static String printShortestWord(String[] str){

        String shortest = str[0];
        for (int i = 0; i <= str.length-1; i++){
            for (int j =0; j <= str.length-1; j++){
                if(shortest.length() > str[j].length()){
                    shortest = str[j];
                }
            }
        }
        return shortest;
    }


}
