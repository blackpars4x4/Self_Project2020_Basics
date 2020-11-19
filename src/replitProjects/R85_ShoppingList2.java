package replitProjects;
/*

 */

import java.util.Scanner;

public class R85_ShoppingList2 {
    /*

     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        String shoppinglist = "";
        int totalprice = 0;
        System.out.println("Enter item1"+" and it's price");
        String item1 = scan.nextLine();
        double price1 = scan.nextDouble();
        totalprice += price1;
        System.out.println("Add one more item? ");
        String answer = scan.next();

        if(answer.equalsIgnoreCase("yes")) {
            while (answer.equalsIgnoreCase("yes")) {

                for (int i = 2; i <= 10; i++) {
                    System.out.println("Enter item" + i + " and it's price");
                    String item = scan.next();
                    double price = scan.nextDouble();
                    shoppinglist += "item" + i + ": " + item + " price: " + price + ", ";
                    totalprice += price;
                    System.out.println("Add one more item? ");
                    answer = scan.next();

                    if (answer.equals("no")) {
                        System.out.println("Item1: " + item1 + " Price: " + price1+", " + shoppinglist);
                        System.out.println("Total price: " + totalprice);
                        break;
                    }

                }
            }
        }
        else{
            System.out.println("Item1: "+item1+" Price: "+price1);
            System.out.println("Total price: "+totalprice);
                }

            }
        }









/*
In this assignment, you will write a program that will generate a shopping list.
It's more advanced version of assignment #22 (Shopping list I).
Your program should ask user to enter items followed by its price.

After adding item,  ask user if he wants to add one more item.
If so, repeat previous steps again.
If no, print shopping list report and total price as show in examples.
Your program should accept up to 10 items.

    Hint: use do while loop.


Example:


output: Enter Item1 and its price:

input: Tomatoes

input: 5.5

output: Add one more item?

input: yes

output: Enter Item2 and its price:

input: Cheese

input: 3.5

output: Add one more item?

input: yes

output: Enter Item3 and its price:

input: Apples

input: 6.3

output: Add one more item?

input: no

output: Item1: Tomatoes Price: 5.5, Item2: Cheese Price: 3.5, Item3: Apples Price: 6.3

output: Total price: 15.3


Example:


output: Enter Item1 and its price:

input: Lemons

input: 2.3

output: Add one more item?

input: yes

output: Enter Item2 and its price:

input: Oranges
 */