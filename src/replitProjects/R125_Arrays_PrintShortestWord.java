package replitProjects;

import java.util.Scanner;

public class R125_Arrays_PrintShortestWord {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String[] str = {scanner.next(), scanner.next(), scanner.next(), scanner.next(), scanner.next(), scanner.next()};

        String shortest = str[0];
        for (int i = 0; i <= str.length-1; i++){
            for (int j =0; j <= str.length-1; j++){
                if(shortest.length() > str[j].length()){
                    shortest = str[j];
                }
            }
        }
        System.out.println(shortest);
    }
}
/*
Write a program that will print the shortest word in the given array str.

input: java, cable, red, vivid, remedy, grace
output: red
 */