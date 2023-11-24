package com.company.fourthLab;

public class MyFourth {

    public static long myReccursion(int n, long[] array){
        if (n < 0) return 0;
        else if (n == 0) return 1;
        else if (array[n-1] > 0)
            return array[n-1];
        else {
                array[n-1] = myReccursion(n-1,array) + myReccursion(n-2,array) + myReccursion(n-3,array);
                return array[n-1];
        }
    }
}
