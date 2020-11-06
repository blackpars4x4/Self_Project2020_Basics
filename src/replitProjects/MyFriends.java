package replitProjects;

import java.util.Scanner;

public class MyFriends {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many friends?");
        int number = scan.nextInt();

        String[] firstName = new String[number]; // 3
        String[] lastName = new String[number];

        // for storing the names
        for(int i =0; i < number; i++){ // i: 0, 1, 2
            System.out.println("Enter first name: ");
            String f =  scan.next();
            f =  f.substring(0,1).toUpperCase() + f.substring(1).toLowerCase();
            firstName[i] = f;

            System.out.println("Enter your last name: ");
            String l = scan.next();
            l = l.substring(0,1).toUpperCase() +l.substring(1).toLowerCase();
            lastName[i] = l;

        }  // the loop is used for initializing the arrays

        scan.close();

        System.out.println("=====================================================");

        for(int i = 0; i < number; i++){  // used for printing out the elements in the arrays
            System.out.println(firstName[i]+" "+lastName[i]);
        }





    }


}
