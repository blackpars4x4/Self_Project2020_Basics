package replitProjects;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        double totalprice = 0;
        String shoppinglistReport = "";
        System.out.println("Enter Item1 and its price:");
        String item1 = input.nextLine();
        double price1 = input.nextDouble();
        totalprice += price1;
        System.out.println("Add one more item?");

        String YesOrNo = input.next().toLowerCase();
        if (YesOrNo.equals("yes")) {

            while (YesOrNo.equals("yes")) {

                for (int i = 2; i <= 10; i++) {

                    System.out.println("Enter Item" + i + " and its price:");
                    String item = input.next();
                    double price = input.nextDouble();

                    totalprice += price;
                    shoppinglistReport += ", " + "Item" + i + ": " + item + " Price: " + price;
                    System.out.println("Add one more item?");
                    YesOrNo = input.next().toLowerCase();

                    if (YesOrNo.equals("no")) {

                        System.out.println("Item1: " + item1 + " Price: " + price1 + shoppinglistReport);
                        System.out.println("Total price: " + totalprice);
                        break;
                    }

                }
            }
        } else {
            System.out.println("Item1: " + item1 + " Price: " + price1);
            System.out.println("Total price: " + totalprice);
        }
    }
}
