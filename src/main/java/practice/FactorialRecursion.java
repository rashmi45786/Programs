package practice;

import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int value = sc.nextInt();
        System.out.println(factorial(value));
        System.out.println(factoWithoutRecursion(value));
    }

    static int factorial(int num) {
        if (num == 0)
            return 1;
        else
            return num * factorial(num - 1);
    }

    static int factoWithoutRecursion(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        return fact;
    }

}
