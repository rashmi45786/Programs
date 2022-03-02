package practice;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      /*  System.out.println("enter value");
        String value = sc.nextLine();
        createPalindrome(value);*/

        System.out.println("enter value");
        int n = sc.nextInt();
        createPalindromeOfNumber(n);

    }

    static void createPalindrome(String str) {
        String rev = "";
        System.out.println("you entered " + str);
        int length = str.length();
        for (int i = length - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if (str.toLowerCase().equals(rev.toLowerCase())) {
            System.out.println(str + " is a Palindrome String.");
        } else {
            System.out.println(str + " is not a Palindrome String.");
        }

    }

    static void createPalindromeOfNumber(int num) {
        int rev = 0, remainder;
        int orignal= num;
        while (num != 0) {
            remainder = num % 10;
            rev = rev * 10 + remainder;
            num /= 10;
        }
        if (orignal==rev){
            System.out.println(orignal + " is a Palindrome String.");
        }
        else
            System.out.println(orignal + " is not a Palindrome String.");
    }
}
