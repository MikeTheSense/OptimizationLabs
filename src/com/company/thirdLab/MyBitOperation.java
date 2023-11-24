package com.company.thirdLab;

public class MyBitOperation {
    public static int swapInt(int number){
        int even_bits = number & 0xAAAAAAAA;
        int odd_bits = number & 0x55555555;
        System.out.println(printBinaryNumber(number));
        System.out.println("Четные " + printBinaryNumber(even_bits));
        System.out.println("Нечетные " + printBinaryNumber(odd_bits));
        even_bits >>= 1;
        odd_bits <<= 1;
        int finalNumber = even_bits | odd_bits;
        System.out.println("Четные " + printBinaryNumber(even_bits));
        System.out.println("Нечетные " + printBinaryNumber(odd_bits));
        System.out.println("Готовое число " + printBinaryNumber(finalNumber));
        return (finalNumber);
    }
    public static String printBinaryNumbers(int n) {
        char[] arr = Integer.toBinaryString(n).toCharArray();
        StringBuilder sb = new StringBuilder();
        for (Character c : arr) {
            sb.append(c);
        }
        return sb.toString();
    }
    public static String printBinaryNumber(int n) {
        int decimalOrBinary = n;
        StringBuilder builder = new StringBuilder();

        do {
            builder.append(decimalOrBinary % 2);
            decimalOrBinary = decimalOrBinary / 2;
        } while (decimalOrBinary > 0);

        return builder.reverse().toString();
    }
}
