package replitProjects;

import java.util.Scanner;

public class BuildARoute_80 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Start Point: ");
        String start = scan.next();
        System.out.print("Enter a End Point: ");
        String end = scan.next();

        String AtoB="right";
        String BtoC="down";
        String CtoD="left";
        String DtoA="up";

        if (start.equalsIgnoreCase("a")){
            if (end.equalsIgnoreCase("b")){
                System.out.println(AtoB+": "+end+" found");
            }else if(end.equalsIgnoreCase("c")){
                System.out.println(AtoB+" > "+BtoC+": "+end+" found");
            }else if(end.equalsIgnoreCase("d")){
                System.out.println(AtoB+" > "+BtoC+" > "+CtoD+": "+end+" found");
            }else if (end.equalsIgnoreCase("a")){
                System.out.println(start+" found");
            }

        }else if (start.equalsIgnoreCase("b")){
            if (end.equalsIgnoreCase("c")){
                System.out.println(BtoC+": "+end+" found");
            }else if(end.equalsIgnoreCase("d")){
                System.out.println(BtoC+" > "+CtoD+": "+end+" found");
            }else if(end.equalsIgnoreCase("a")){
                System.out.println(BtoC+" > "+CtoD+" > "+DtoA+": "+end+" found");
            }else if (end.equalsIgnoreCase("b")){
                System.out.println(start+" found");
            }


        }else if (start.equalsIgnoreCase("c")){
            if (end.equalsIgnoreCase("d")){
                System.out.println(CtoD+": "+end+" found");
            }else if(end.equalsIgnoreCase("a")){
                System.out.println(CtoD+" > "+DtoA+": "+end+" found");
            }else if(end.equalsIgnoreCase("b")){
                System.out.println(CtoD+" > "+DtoA+" > "+AtoB+": "+end+" found");
            }else if (end.equalsIgnoreCase("c")){
                System.out.println(start+" found");
            }

        }else if (start.equalsIgnoreCase("d")) {
            if (end.equalsIgnoreCase("a")) {
                System.out.println(DtoA + ": " + end + " found");
            } else if (end.equalsIgnoreCase("b")) {
                System.out.println(DtoA + " > " + AtoB + ": " + end + " found");
            } else if (end.equalsIgnoreCase("c")) {
                System.out.println(DtoA + " > " + AtoB + " > " + BtoC + ": " + end + " found");
            } else if (end.equalsIgnoreCase("d")) {
                System.out.println(start + " found");
            }

        }
        }
}
/*
Write a program that will print out route instructions. Your program should take 2 parameters: start point and endpoint. Use left, right, up and down for navigation. Insert ">" between commands. If start point equals to endpoint - display: "start/end(start or end variable!) found".
Note: you may move only clockwise.

Example:

Input: A

Input: D

Output: right > down > left: D found


Input: C

Input: C

Output: C found

 */