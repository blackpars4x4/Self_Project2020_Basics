package jetBrainAcademyProjects;

import java.util.Scanner;

public class Stage2_6_MachinesHaveNeeds_CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");

        System.out.println("Write how many cups of coffee you will need: ");
        int cupsOfCoffee = scanner.nextInt();

        System.out.println("For " + cupsOfCoffee + " cup of coffee you will need: ");
        /*
        For 1 Cup of Coffee needs > 200 ml of water, 50 ml of milk, and 15 g of coffee beans
        */
        int mlOfWater = (200 * cupsOfCoffee);
        System.out.println(mlOfWater + " ml of water");

        int mlOfMilk = (50 * cupsOfCoffee);
        System.out.println(mlOfMilk + " ml of milk");

        int gOfCoffeeBean = (15 * cupsOfCoffee);
        System.out.println(gOfCoffeeBean + " g of coffee bean");


    }
}

/*
Description
Now let's consider a case where you need a lot of coffee. Maybe, for example,
you’re hosting a party with a lot of guests. The program should calculate how much water,
coffee, and milk are necessary to make the specified amount of coffee.
One cup of coffee made on this coffee machine contains 200 ml of water, 50 ml of milk, and 15 g of coffee beans.

The user should input the amount of coffee he needs, in cups, for all the guests.

Of course, all this coffee is not needed right now, so at this stage,
the coffee machine doesn’t actually make any coffee.

Instruction
Write a program that calculates the amount of ingredients needed to make a certain amount of coffee.

Examples
The example below shows how your output might look.
The symbol > represents the user input. Notice that it's not the part of the input.

Example 1

Write how many cups of coffee you will need:
> 25
For 25 cups of coffee you will need:
5000 ml of water
1250 ml of milk
375 g of coffee beans
Example 2

Write how many cups of coffee you will need:
> 125
For 125 cups of coffee you will need:
25000 ml of water
6250 ml of milk
1875 g of coffee beans
 */