package com.codetests;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static boolean isLeapYear(int year) {
        boolean result = false;

        if(!((year >= 1) && (year <= 9999))){
            return result;
        }
        else if (year % 4 != 0){
            return result;
        }
        else {
            if(year % 100 != 0)
                result = true;
            else if (year % 400 == 0)
                result = true;
        }

        return result;
    }

    public static boolean areEqualByThreeDecimalPlaces(double one, double two){
        boolean result = true;
        int loopCounter = 1;
        int processor = 1;

        while (result && loopCounter < 5) {
            int firstNumber = (int) (one * processor);
            int secondNumber = (int) (two * processor);

            if (firstNumber != secondNumber){
                result = false;
            }
            else {
                processor *= 10;
                loopCounter += 1;
            }
        }

        return result;
    }

    public static boolean hasEqualSum(int firstNumber, int secondNumber, int total) {
        if((firstNumber + secondNumber) == total)
            return true;
        else
            return false;
    }

    public static void printYearsAndDays(long minutes) {
        if(minutes < 0)
            System.out.println("Invalid Value");
        else {
            long years, days;
            if(minutes >= 525600){
                years = minutes/525600;
                days = (minutes % 525600)/1440;
            }
            else{
                years = 0;
                days = minutes/1440;
            }
            System.out.println(minutes +" min = "+years+" y and "+days+" d");
        }
    }

    public static void printEqual(int one, int two, int three) {
        if (one < 0 || two < 0 || three < 0)
            System.out.println("Invalid Value");
        else if (one == two && two == three)
            System.out.println("All numbers are equal");
        else if (one != two && one != three && two != three)
            System.out.println("All numbers are different");
        else
            System.out.println("Neither all are equal or different");
    }

    public static void main(String[] args) {
        double discount;
        int qty = Integer.parseInt("75");

        discount = (qty >= 90) ? 0.5 : (qty > 80) ? 0.2 : 0;



        System.out.println(discount);
    }
}
