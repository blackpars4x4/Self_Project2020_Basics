package replitProjects;

public class R217_MethodWithArrays_BadProducts {

    public static void main(String[] args) {

        int[] array = new int[]{1,1,1,1,0,0,0,0};
        int lim = 5;

        System.out.println(badP(array, lim));

    }
    public static boolean badP(int[] products, int limit) {

        int brokenCount = 0;
        for (int each : products) {
            if(each == 0){
                brokenCount++;
            }
        }
        return brokenCount < limit;

    }


}
/*
All products that go into the warehouse go through a machine that checks if they are intact .
to declare if the products shipment was good or bad it also get a limited number of how many products can be broken for it to be considered a good shipment.

badP is a method that gets an int array named products and an int named limit.

products(int[]) - is an int array representing the products it checked, if the item is intact it will be represented by 1 if its broken its 0. for example: [0,1,1,1,0], this array represents 2 broken items and 3 intact.

limit(int) - represents the max amount of broken items for this shipment to be considered good (and the method returns true) for example : products [1,1,1,1,0] limit:3, there is only 1 broken product and its less then the limit (3) return true.

example use:

badP([1,1,1,1],5)
returns true

badP([1,1,1,1,0,0,0,0],2)
returns false

badP([1,1,0,0],2)
returns false

badP([1,1,1,0],6)
returns true

hint:
create a counter, loop the products, increment it for each 0 you find.
finally compare counter to limit and return true or false
 */