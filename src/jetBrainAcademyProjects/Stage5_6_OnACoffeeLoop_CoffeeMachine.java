package jetBrainAcademyProjects;

import java.util.Scanner;

public class Stage5_6_OnACoffeeLoop_CoffeeMachine {

    static Scanner scanner = new Scanner(System.in);

    static int water = 400;
    static int milk = 540;
    static int beans = 120;
    static int cups = 9;
    static int money = 550;

    static boolean exit = false;

    public static void main(String[] args) {


        do {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = scanner.next();

            switch (action) {
                case "buy":
                    buy();
                    break;
                case "fill":
                    fill();
                    break;
                case "take":
                    take();
                    break;
                case "remaining":
                    remaining();
                    break;
                case "exit":
                    exit();
                    break;
            }

        } while (exit == false);
    }

    static void exit() {

        exit = true;
    }

    static boolean canMakeCoffee(int waterNeed, int milkNeed, int beansNeed) {
        if (water >= waterNeed) {
            if (milk >= milkNeed) {
                if (beans >= beansNeed) {
                    System.out.println("I have enough resources, making you a coffee!\n");
                    return true;
                } else {
                    System.out.println("Sorry, not enough beans!\n");
                    return false;
                }
            } else {
                System.out.println("Sorry, not enough milk!\n");
                return false;
            }
        } else {
            System.out.println("Sorry, not enough water!\n");
            return false;
        }

    }

    static void take() {
        System.out.println("I gave you $" + money + "\n");
        money -= money;
    }


    static void buy() {

        /* If the user writes "buy" then they must choose one of three varieties of coffee that
            the coffee machine can make: espresso, latte, or cappuccino.
For the espresso, the coffee machine needs 250 ml of water and 16 g of coffee beans. It costs $4.
For the latte, the coffee machine needs 350 ml of water, 75 ml of milk, and 20 g of coffee beans. It costs $7.
And for the cappuccino, the coffee machine needs 200 ml of water, 100 ml of milk, and 12 g of coffee beans. It costs $6.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String list = scanner.next();

        switch (list) {
            case "1": {//Espresso

                if (canMakeCoffee(250, 0, 16)) {
                    water -= 250;
                    beans -= 16;
                    cups -= 1;
                    money += 4;
                    break;
                }
            }

            case "2": {//Latte

                if (canMakeCoffee(350, 75, 20)) {

                    water -= 350;
                    milk -= 75;
                    beans -= 20;
                    cups -= 1;
                    money += 7;

                    break;
                }
            }

            case "3": {//Cappuccino

                if (canMakeCoffee(200, 100, 12)) {

                    water -= 200;
                    milk -= 100;
                    beans -= 12;
                    cups -= 1;
                    money += 6;
                    break;
                }
            }

            case "back": {
                break;
            }
            default: {
                break;
            }

        }

    }


    static void remaining() {

        System.out.println("\nThe coffee machine has:\n" +
                water + " of water\n" +
                milk + " of milk\n" +
                beans + " of coffee beans\n" +
                cups + " of disposable cups\n" +
                money + " of money\n");
    }

    static void fill() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write how many ml of water do you want to add: ");
        water += scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add: ");
        milk += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add: ");
        beans += scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add: \n");
        cups += scanner.nextInt();

    }


}
