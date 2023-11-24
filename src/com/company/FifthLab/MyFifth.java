package com.company.FifthLab;

public class MyFifth {
    private static final double normalWeight = 1;
    private static final double wrongWeigth = 1.1;
    private static final int cansNumber = 20;
    public static double getWrongNumber(int wrongNumber){
        double sum =0;
        for (int i = 0; i<= cansNumber; i++) {
            if (i != wrongNumber) sum += i*normalWeight;
            else sum+= i*wrongWeigth;
        }


        return (sum - (cansNumber*(cansNumber+1))/2)/(wrongWeigth-normalWeight);
    }
}
