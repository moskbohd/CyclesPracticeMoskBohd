package com.MoskBohd;

import java.util.Locale;

public class Main {

    // 2. Check a string as a palindrome ( 3 points).

    // First way - char comparing
    public static boolean isPalindrome1(String str) {
        boolean result = true;
        str = str.toLowerCase(Locale.ROOT);
        str = str.replaceAll("[^abc]", "");
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                result = false;
                break;
            }
        }
        return result;
    }

    // Second way - string reversing
    public static boolean isPalindrome2(String str) {
        str = str.replaceAll("[^abc]", "");
        boolean result = false;
        String revesre = "";
        for (int i = 0; i < str.length(); i++) {
            revesre += str.charAt(str.length()-1-i);
        }
        if (revesre.equalsIgnoreCase(str)) {
            result = true;
        }
        return result;
    }

    // Third way - char comparing
    public static boolean isPalindrome3(String str) {
        str = str.replaceAll("[^abc]", "");
        boolean result = false;
        StringBuilder sb = new StringBuilder(str);
        String reverse = sb.reverse().toString();
        if (reverse.equalsIgnoreCase(str)) {
            result = true;
        }
        return result;
    }

    // 3. Get the area limited by the following functions
    // x = 0 .. 3.14;    y = sin(x);   y = 0.1 * k, k = 6
    // where k is the last cipher in your student card; (2 points)

    public static double getArea(){
        int steps = 10;
        double width = Math.PI/steps;
        byte k = 6;
        double lineBorder = 0.1 * k;
        double area = 0.0;
        for (int i = 0; i < steps -1; i++){
            double height = Math.sin(i * width);
            if (height >= lineBorder){
                height = lineBorder;
            }
            double deltaS = width * height;
            area += deltaS;
        }
        return area;
    }

    public static void main(String[] args) {

        // 1. Write to console 8 facts about yourself using primitive types. (1 points).
        {
            byte myAge = 22;
            short myYearOfBirth = 1999;
            float myDateOFBirth = 26.07f;
            int myHeight = 172;
            long myWeight = 70;
            double theDioptersOfMyGlasses = -1.5;
            char theFirstLetterOfMyName = 'B';
            boolean amIMale = true;
            System.out.println("My age is " + myAge + ", I was born in " + myDateOFBirth + " "
                    + myYearOfBirth + " My height is " + myHeight + " cm tall and my weight is " +
                    myWeight + " kg. I wear glasses with " + theDioptersOfMyGlasses + " diopters. " +
                    "Call me " + theFirstLetterOfMyName + "ohdan" + ", I`m male " + amIMale);
        }

        // 2. Check a string as a palindrome ( 3 points).
        {
            String str = "!No 1 lemon, no = melon";
            System.out.println(isPalindrome1(str));
            System.out.println(isPalindrome2(str));
            System.out.println(isPalindrome3(str));
        }

        // 3. Get the area limited by the following functions
        // x = 0 .. 3.14;    y = sin(x);   y = 0.1 * k,
        // where k is the last cipher in your student card; (2 points)
        {
            System.out.println(getArea());
        }
    }
}
