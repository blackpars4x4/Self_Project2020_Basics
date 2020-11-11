package jetBrainPractice;

public class RightRotationWithArray {
    public static void main(String[] args) {

    }
}
/*
A right rotation is an operation that shifts each element of an array to the right. For example, if an array is {1,2,3,4,5} and we right rotate it by 1, the new array will be {5,1,2,3,4}. If we rotate it by 2, the new array will be {4,5,1,2,3}. It goes like this: {1,2,3,4,5} -> {5,1,2,3,4} -> {4,5,1,2,3}.

Write a program that performs a right rotation on an array by a given number.

Input format:
The first line is an array of numbers.
The second line is the number of rotations.

Output format:
Resulting array

 Report a typo
Sample Input 1:

1 2 3 4 5
1
Sample Output 1:

5 1 2 3 4
Sample Input 2:

1 2 3 4 5
2
Sample Output 2:

4 5 1 2 3
Sample Input 3:

1 2 3 4 5
8
Sample Output 3:

3 4 5 1 2
Sample Input 4:

11 21 1 41 51 78 90
10000
Sample Output 4:

41 51 78 90 11 21 1
 */