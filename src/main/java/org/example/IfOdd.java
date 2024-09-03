package org.example;

import java.util.Scanner;

public class IfOdd {
    public static void main(String[] args) {
        boolean isValid = false;

        Scanner myScan = new Scanner(System.in);
        System.out.println("Please enter an integer number: ");
        do {
            try {
                Integer theNum = Integer.parseInt(myScan.nextLine());
                if (theNum instanceof Integer) {
                    isValid = true;
                }
                System.out.println("Your number is " + theNum + "and is it an odd number?");
                System.out.println(checkIfOdd.checkIfOdd(theNum));

            } catch (NumberFormatException ex) {
                System.out.println("please only enter a number. Do it again: ");
            }

        } while (!isValid);
    }
}

class checkIfOdd {
    public static boolean checkIfOdd(int n){
        return n % 2 != 0;
    }
}
