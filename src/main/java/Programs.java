import java.util.Scanner;

public class Programs {

    public static void main(String[] args) {
      /*  AddNumbers();
        reverseString();
        reverseStr("abc");
        PrimeNumber(41);
        PrimeOwn();
        swapNumbers();
        swap();*/
        System.out.println("Factorial is  " + factorial(7));

        /*
         * performing factorial with recursion here
         */
        int num = 5;
        int fact = 1;
        fact = recursionFactorial(num);
        System.out.println("factorial of " + num + " is " + fact);

        System.out.println("reverse is " + palindrome("454"));
        fibonacci();
    }

    static void AddNumbers() {
        int a = 10;
        int b = 10;
        int sum = 0;
        sum = a + b;
        System.out.println("result is " + sum);
    }

    static void reverseString() {
        String rev = "";
        Scanner str = new Scanner(System.in);
        System.out.println("enter string name  ");
        String value = str.nextLine();
        int length = value.length();

        for (int i = length - 1; i >= 0; i--) {
            rev = rev + value.charAt(i);
        }
        System.out.println("reverse of " + value + " = " + rev);
    }

    static void reverseStr(String str) {
        String rev = "";
        int length = str.length();
        for (int i = length - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println("reverse of " + str + " = " + rev);
    }

    static void PrimeNumber(Integer num) {
        int temp = 0;
        for (int i = 2; i <= num - 1; i++) {
            if (num % i == 0) {
                temp = temp + 1;
            }
        }
        if (temp > 0) {
            System.out.println("" + num + " is not prime");
        } else {
            System.out.println("" + num + " is prime");
        }
    }

    static void PrimeOwn() {
        int temp = 0;
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();

        for (int i = 2; i <= value - 1; i++) {
            if (value % 2 == 0) {
                temp = temp + 1;
            }
        }
        if (temp > 0) {
            System.out.println("" + value + " is not prime");
        } else {
            System.out.println("" + value + " is prime");
        }
    }

    static void swapNumbers() {
        int a = 200;
        int b = 110;

        b = b + a;
        a = b - a;
        b = b - a;
        System.out.println("swap " + a + " " + b + " ");

    }

    static void swap() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        b = b + a;
        a = b - a;
        b = b - a;
        System.out.println("swap " + a + " " + b + " ");

    }

    static int factorial(int num) {
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    static int recursionFactorial(int num) {
        if (num == 0)
            return 1;
        else
            return num * recursionFactorial(num - 1);
    }

    static String palindrome(String orignal) {
        String rev = "";
        int length = orignal.length();
        for (int i = length - 1; i >= 0; i--) {
            rev = rev + orignal.charAt(i);
        }
        return rev;
    }

    static void fibonacci() {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number  ");
        int count = sc.nextInt();

        int num, first = 0, second = 1;
        System.out.print("" + first + " " + second + "");

        for (int i = 0; i <= count; i++) {
            num = first + second;
            first = second;
            second = num;
            System.out.print(" " + num);
        }
    }
}
