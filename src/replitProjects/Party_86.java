package replitProjects;

import java.util.Scanner;

public class Party_86 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter guest name: ");
        String firstname = scan.nextLine();
        System.out.println("Do you want enter new guest name?: ");
        String answer = scan.next();
        StringBuilder listOfGuests= new StringBuilder();

        while(answer.equalsIgnoreCase("yes")){
            System.out.println("Enter guest name: ");
            listOfGuests.append(", ").append(scan.next());

            System.out.println("Do you want enter new guest name?: ");
            answer = scan.next().toLowerCase();

            }
        System.out.println("Guest's list: " + firstname + listOfGuests);
    }
}
/*
Imagine you have a party and need to form the list of the guests.
(Assume you have at least one guest)
Ask for the first guest name.
Then ask does user want to enter one more guest.
 If yes - take input from.
If not - finish the program and print list of the guests.

Example of the program:

Please enter guest name:

Nick

Do you want to enter new guest name:

yes

Please enter guest name:

Linda

Do you want to enter new guest name:

no


Guest's list: Nick, Linda
 */