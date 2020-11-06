package replitProjects;

import java.util.Scanner;

public class Online_Book_Merchants_84 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("The Customer is Premium ");//options are premium & regular

        boolean isPremiumCustomer = scan.nextBoolean();
        System.out.println("Purchased Book Qty: ");
        int nbookPurchased = scan.nextInt();


        if(isPremiumCustomer){
            if(nbookPurchased >= 8){
                int freeBook = 2;
                System.out.println("The amount of free book is: " + freeBook);
            }
            if(nbookPurchased >=5){
                int freeBook = 1;
                System.out.println("The amount of free book is: " + freeBook);
            }
        }
        else{
            if(nbookPurchased >= 12){
                int freeBook = 2;
                System.out.println("The amount of free book is: " + freeBook);
            }
            if(nbookPurchased >=7){
                int freeBook = 1;
                System.out.println("The amount of free book is: " + freeBook);
            }
        }
    }
}
/*
    Online Book Merchants offers premium customers 1 free book with every purchase of 5
    or more books and offers 2 free books with every purchase of 8 or more books.

    It offers regular customers 1 free book with every purchase of 7 or more books,
    and offers 2 free books with every purchase of 12 or more books.

    Write a program that assigns freeBooks the appropriate value based on the
     values of the boolean variable isPremiumCustomer and the int variable nbooksPurchased.
    Print amount of freeBooks into the console.
 */