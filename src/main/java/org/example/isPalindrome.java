package org.example;
import java.util.Scanner;

public class isPalindrome {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);

        while(true) {
            System.out.println("Please enter a word: ");
            String theAns = myScan.nextLine();

            int low = 0;
            int high = theAns.length() - 1;

            boolean isPalindrome = true;
            while(low <= high) {
                if(theAns.charAt(low) != theAns.charAt(high)) {
                    isPalindrome = false;
                    break;
                }
                low++; high--;

            }

            if(isPalindrome) {
                System.out.println();
                System.out.println(theAns + " is a palindrome");
            }
            else System.out.println(theAns + " is not a palindrome.");
        }
    }
}
