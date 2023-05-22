package com.blogapp.TechnicalQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class TechnicalQuestions {

    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter a number");
//        int number = input.nextInt();
//
//        if(number %3 ==0 && number % 5 ==0){
//            System.out.println("Fizz Buzz");
//        }else if(number % 5 == 0){
//            System.out.println("Buzz");
//        } else if (number %3 ==0) {
//            System.out.println("fizz");
//        }else {
//            System.out.println(number);
//        }

//
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter the sequence of numbers: ");
//        String sequence = input.nextLine();
//
//        System.out.print("Enter the digit to count: ");
//        int digit = input.nextInt();
//
//        int count = 0;
//
//        for (int i = 0; i < sequence.length(); i++) {
//            if (sequence.charAt(i) == (char) (digit + '0')) {
//                count++;
//            }
//        }
//
//        System.out.println("The digit " + digit + " appears " + count + " times.");
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter the number of sequesnce");
//
//        String sequence = input.nextLine();
//        System.out.println("Enter the digit to count");
//        int digit = input.nextInt();
//        int count = 0;
//        for(int i =0; i<sequence.length(); i++){
//            if(sequence.charAt(i) == (char) (digit + '0')){
//                count++;
//            }
//        }

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of sequence");
        String sequence = input.nextLine();

        System.out.println("Enter the digit to count");
        int digit = input.nextInt();
        int count = 0;
        for(int i =0; i<sequence.length(); i++){
            if(sequence.charAt(i) == (char) (digit + '0')){
                count++;
            }
        }
        System.out.println(count);

//        String str1 = "ABCD";
//        String str2 = "XYZAz";
//        if(isRotation(str1,str2)){
//            System.out.println("Rotation is Present");
//        }else{
//            System.out.println("Rotation is not present");
//        }
//        String str = "AB@#FG%^*FGH&*^FGF";
//        int count = 0;
//        for(int i=0; i<str.length(); i++){
//            if(!Character.isDigit(str.charAt(i)) && !Character.isLetter(str.charAt(i))&&!Character.isWhitespace(str.charAt(i))){
//                count++;
//            }
//        }
//        if(count == 0){
//            System.out.println("No Special Character Fount");
//        }else{
//            System.out.println("Special Character fount " + count);
//        }

//        String str = "RahulVaghela";
//        char ch = 'V';
//        removeChar(str,ch);

//        int[] arr1 = {1,2,3,4,5};
//        int[] arr2 = {1,2,3,4,5};
//        if(areEqual(arr1,arr2)){
//            System.out.println("Arrays Are Equal");
//        }else{
//            System.out.println("Arrays Are Not Equal");
//        }

    }

   public static boolean areEqual(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;

        if(n != m){
            return false;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i=0; i<n; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
   }
    public static void removeChar(String str, char ch){
        int n = str.length();
        String finalString = "";
        for(int i =0; i<n; i++){
            if(str.charAt(i) != ch){
                finalString = finalString+str.charAt(i);
            }
        }
        System.out.println(finalString);
    }
   public static boolean isRotation(String str1, String str2){
        return (str1.length() == str2.length()) &&((str1+str1).indexOf(str2) != -1);
   }
}
