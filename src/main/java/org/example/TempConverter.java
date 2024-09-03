package org.example;
import java.util.Scanner;

public class TempConverter {
        public static void main (String[]args){
            boolean isValid = false;

            Scanner myScan = new Scanner(System.in);
            System.out.println("Please enter a temperature in Fahrenheit: ");
            do {
                try {
                    double fahrenheit = Double.parseDouble(myScan.nextLine());
                    Double celcius = ((fahrenheit - 32) * 5) / 9;
                    if (celcius instanceof Double) {
                        isValid = true;
                    }
                    System.out.print(fahrenheit + " degree Fahrenheit is equals ");
                    System.out.printf("%.2f", celcius);
                    System.out.println(" degree Celcius");
                    ;
                } catch (NumberFormatException ex) {
                    System.out.println("please only enter a number");
                }

            } while (!isValid);
        }
    }
