package org.example;

import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args){
            boolean isValid = false;

            Scanner myScan = new Scanner(System.in);
            System.out.println("Please enter value of cm: ");
            do {
                try {
                    double cm = Double.parseDouble(myScan.nextLine());
                    Double km = cm / 10000;
                    if (km instanceof Double) {
                        isValid = true;
                    }
                    System.out.print(cm + " centimeter is equals ");
                    System.out.printf("%.2f", km);
                    System.out.println(" kilometer");
                    ;
                } catch (NumberFormatException ex) {
                    System.out.println("please only enter a number");
                }

            } while (!isValid);
        }
    }

