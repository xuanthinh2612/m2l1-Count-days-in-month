package com.company;

import java.util.Scanner;

public class daysInMonth {

    public static void main(String[] args) {
        // write your code here
        String daysInMonth;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert the month you want to count days");
        int month = scanner.nextInt();
        switch (month) {
            case 2:
                daysInMonth = "28 or 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = "30";
                break;
            default:
                daysInMonth = "";
        }
        if (daysInMonth == "") {
            System.out.print("Invalid input");
        } else  {
            System.out.printf("so ngay thang %d la %s ngay", month, daysInMonth);
        }

    }
}

