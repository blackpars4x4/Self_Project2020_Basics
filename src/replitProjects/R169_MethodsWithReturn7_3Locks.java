package replitProjects;

public class R169_MethodsWithReturn7_3Locks {
    public static void main(String[] args) {

        System.out.println(threeLocks(false, true, false));
    }

    public static boolean threeLocks(boolean a, boolean b, boolean c) {
        boolean result = (a && b) || c;

        return result;
    }
}
/*
This one is about truth table logic, threeLocks gets 3 booleans and returns a boolean.

It returns true only if both a and b are true or c is true.

https://en.wikipedia.org/wiki/Truth_table

 */