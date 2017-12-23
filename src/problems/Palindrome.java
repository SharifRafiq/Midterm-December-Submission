package problems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        String original, reverse = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to check if it is a Palindrome");
        original = sc.nextLine();

        int length = original.length();

        for( int i = length -1; i>=0; i--)
            reverse = reverse + original.charAt(i);

        if (original.equals(reverse))
            System.out.println("Enterd String is a Palindrome.");
        else
            System.out.println("Enterd String is not a Palindrome.");
        sc.close();
    }
}
