package Dervis;

public class LeftTriangle {

    public static void leftTriangle(int n) {

        for(int i=0; i<n; i++){           //i=0, n=5

        for(int j=2*(n-i); j>=0; j--){    // j=8,

                System.out.print(" ");    // (
            }
            for(int j=0; j<=i; j++){

                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n=5;
        leftTriangle(n);
    }

}
