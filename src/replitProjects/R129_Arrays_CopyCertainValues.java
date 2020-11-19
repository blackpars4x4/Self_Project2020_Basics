package replitProjects;

import java.util.Arrays;

public class R129_Arrays_CopyCertainValues {
    public static void main(String[] args) {
        String[] arr = {"zero", "one", "two","three","four"};
        System.out.println(Arrays.toString(getWithELetter(arr)));
    }

    public static String[] getWithELetter(String[] arr){
        int count = 0;

        for(int i = 0; i <= arr.length-1; i++){
            if(arr[i].contains("e")){
                count++;
            }
        }
        String fewValues[] = new String[count];
        int j = 0;
        for(int i = 0; i <= arr.length-1; i++){
            if(arr[i].contains("e")){
                fewValues[j++]= arr[i];
            }
        }
        return fewValues;
    }
}
/*
Given a String array arr with the following elements
["zero", "one", "two","three","four"]

Create another array fewValues and copy words that have letter "e" in them

You need to know how many element contain "e" and create array accordingly

Values in fewValues array need to be["zero", "one","three"]

Examples:
arr -> ["aa", "be", "lol", "lel", "oreo"]
fewValues -> ["be",  "lel", "oreo"]

arr -> ["e", "hey", "bye", "furey", "spoon"]
fewValues ->["e", "hey", "bye", "furey"]
 */