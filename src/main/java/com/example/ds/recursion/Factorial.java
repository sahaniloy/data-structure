package com.example.ds.recursion;

/**
 * Calculate factorial of a given number using recursive way
 *
 * @author Niloy Saha<niloysaha@gmail.com>
 */
public class Factorial {
    public static void main(String[] args) {
        System.out.println(recursive(3));
        System.out.println(iterative(3));
    }

    // 0! = 1
    // 1! = 1 * (1 - 1)! = 1 * 0! = 1
    // 2! = 2 * (2 - 1)! = 2 * 1! = 2 * 1 = 2;
    // 3! = 3 * (3 - 2)! = 3 * 2! = 3 * 2 = 6
    //...
    // n! = n * (n - 1)!
    private static int recursive(int num) {
        if (num == 0)
            return 1;
        return num * recursive(num - 1);
    }

    private static int iterative(int num) {
        if (num == 0)
            return 1;

        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
