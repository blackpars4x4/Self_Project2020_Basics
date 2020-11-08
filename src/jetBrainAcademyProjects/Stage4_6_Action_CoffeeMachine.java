package jetBrainAcademyProjects;

import java.util.Scanner;

public class Stage4_6_Action_CoffeeMachine {

    static void buy(int water, int milk, int beans , int cups, int money) {

        /* If the user writes "buy" then they must choose one of three varieties of coffee that
            the coffee machine can make: espresso, latte, or cappuccino.
For the espresso, the coffee machine needs 250 ml of water and 16 g of coffee beans. It costs $4.
For the latte, the coffee machine needs 350 ml of water, 75 ml of milk, and 20 g of coffee beans. It costs $7.
And for the cappuccino, the coffee machine needs 200 ml of water, 100 ml of milk, and 12 g of coffee beans. It costs $6.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        int list = scanner.nextInt();
        switch (list) {
            case 1://Espresso
                water -= 250;
                beans -= 16;
                cups -= 1;
                money += 4;

                System.out.println("The coffee machine has:\n" +
                        water + " of water\n" +
                        milk + " of milk\n" +
                        beans + " of coffee beans\n" +
                        cups + " of disposable cups\n" +
                        money + " of money");
                break;

            case 2://Latte
                water -= 350;
                milk -= 75;
                beans -= 20;
                cups -= 1;
                money += 7;

                System.out.println("The coffee machine has:\n" +
                        water + " of water\n" +
                        milk + " of milk\n" +
                        beans + " of coffee beans\n" +
                        cups + " of disposable cups\n" +
                        money + " of money");
                break;

            case 3://Cappuccino
                water -= 200;
                milk -= 100;
                beans -= 12;
                cups -= 1;
                money += 6;

                System.out.println("The coffee machine has:\n" +
                        water + " of water\n" +
                        milk + " of milk\n" +
                        beans + " of coffee beans\n" +
                        cups + " of disposable cups\n" +
                        money + " of money");

        }

    }

    static void fill(int water, int milk, int beans, int cups) {
        Scanner scanner = new Scanner(System.in);


    }

    static void take(int money) {

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int water = 400;
        int milk = 540;
        int beans = 120;
        int cups = 9;
        int money = 550;

        System.out.println("The coffee machine has:\n" +
                water + " of water\n" +
                milk + " of milk\n" +
                beans + " of coffee beans\n" +
                cups + " of disposable cups\n" +
                money + " of money");

        System.out.println("Write action (buy, fill, take):");
        String action = scanner.next();
        switch (action) {

            case "buy":
                buy(water, milk, beans, cups, money);

                break;

            case "fill":

                break;

            case "take":

                break;

        }

    }
}
