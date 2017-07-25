package com.example;

import com.example.common.Month;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose one of these months:");

        for (Month name : Month.values()) {
            System.out.println(name.getEnglishName());
        }

        String userInput = scanner.next();
        Month userInputMonth = Month.valueOf(userInput.toUpperCase());

        ArrayList<String> monthList = new ArrayList<>();

        switch (userInputMonth.ordinal()) {
            case 0:
                monthList.add(Month.JANUARY.getEnglishName());
            case 1:
                monthList.add(Month.FEBRUARY.getEnglishName());
            case 2:
                monthList.add(Month.MARCH.getEnglishName());
            case 3:
                monthList.add(Month.APRIL.getEnglishName());
            case 4:
                monthList.add(Month.MAY.getEnglishName());
            case 5:
                monthList.add(Month.JUNE.getEnglishName());
            case 6:
                monthList.add(Month.JULY.getEnglishName());
            case 7:
                monthList.add(Month.AUGUST.getEnglishName());
            case 8:
                monthList.add(Month.SEPTEMBER.getEnglishName());
            case 9:
                monthList.add(Month.OCTOBER.getEnglishName());
            case 10:
                monthList.add(Month.NOVEMBER.getEnglishName());
            case 11:
                monthList.add(Month.DECEMBER.getEnglishName());
                break;
            default:
                System.out.println("That is not a valid month");
                break;

//            For each loop example of answer:
//
//            for (Month outputMonth : Month.values()) {
//                if (userInputMonth.ordinal() <= outputMonth.ordinal()) {
//                    monthList.add(outputMonth.getEnglishName());
//                }
//            }

        }
        System.out.println(monthList);
    }
}
