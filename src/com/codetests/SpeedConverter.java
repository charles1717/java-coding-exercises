package com.codetests;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {
        long result = 0;

        if(kilometersPerHour < 0)
            result = -1;
        else {
            double convertedSpeed = Math.round(kilometersPerHour * (1 / 1.609));
            result = (long) convertedSpeed;
        }

        return result;
    }

    public static void printConversion(double kilometersPerHour) {

        long convertedSpeed = toMilesPerHour(kilometersPerHour);
        if(convertedSpeed == -1)
            System.out.println("Invalid Value");
        else {
            System.out.println(kilometersPerHour+" km/h = "+convertedSpeed+" mi/h");
        }
    }
}
