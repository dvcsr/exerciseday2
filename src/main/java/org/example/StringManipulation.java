package org.example;
import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        String sampleString = "\"This is a sample string for this exercise\"";
        System.out.println("The string used in this exercise is:\n" + sampleString);

        Scanner myScan = new Scanner(System.in);
        System.out.println("enter your string keyword to apply in sample string: ");
        String theRegex = myScan.nextLine();

        String newStr = sampleString.replaceFirst(theRegex, "");
        System.out.println("The result of the manipulation is: ");
        System.out.println(newStr);

    }
}
