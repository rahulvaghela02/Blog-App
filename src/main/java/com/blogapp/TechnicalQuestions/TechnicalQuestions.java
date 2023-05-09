package com.blogapp.TechnicalQuestions;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TechnicalQuestions {

    public static void main(String[] args) {
//        //Remove Duplicate element
////        int[] x = {1,1,2,3,4,4,5,6,4,5,6};
////        int[] temp = new int[x.length];
////        int j = 0;
////        for(int i=0; i<x.length-1; i++){
////            if(x[i]!=x[i+1]){
////                temp[j] = x[i];
////                j++;
////            }
////        }
////        temp[j] = x[x.length-1];
////        for(int i=0; i<j+1; i++){
////            System.out.println(temp[i]);
////        }
//        //Bubble sort
////        int[] x = {45,646,2,32,4};
////        for(int j=0; j<x.length-1; j++){
////            for(int i=0; i<x.length-1; i++){
////                if(x[i]>x[i+1]){
////                    int temp = x[i];
////                    x[i] = x[i+1];
////                    x[i+1] = temp;
////                }
////            }
////        }
////        for(int m=0; m<x.length; m++){
////            System.out.println(x[m]);
////        }
//
//        //filter Record
////        List<Integer> number = Arrays.asList(10,20,30,40,50,50,30,46,12,3);
////        List<Integer> evenNumber = number.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
////        System.out.println(evenNumber);
////        List<Integer> Number = Arrays.asList(10,20,30,40,522,36,45);
////        List<Integer> square = Number.stream().map(x -> x * x).collect(Collectors.toList());
////        System.out.println(square);
//
////        List<String> words = Arrays.asList("Rahul", "Selina","Jennifer","Sanya","Ryan");
////        List<String> r = words.stream().filter(x -> x.startsWith("R")).collect(Collectors.toList());
////        System.out.println(r);
//
////        List<String> line = Arrays.asList("Rahul","Jennifer","Selina","Johna","Jenny");
////        List<String> collect = line.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
////        System.out.println(collect);
//
////        List<String> string = Arrays.asList("Rahul","Sanya","Johna","Rahul","Sanya");
////        List<String> Ans = string.stream().filter(x -> x.equals("Sanya")).collect(Collectors.toList());
////        System.out.println(Ans.size());
//
////        List<Integer> number = Arrays.asList(10,20,30,45,12,45,3211,412,3212,120,320);
////        List<Integer> sorted = number.stream().sorted().collect(Collectors.toList());
////        System.out.println(sorted);
//
////        List<Integer> number = Arrays.asList(10,23,12,23,10,45,23,56,1);
////        List<Integer> unique = number.stream().distinct().collect(Collectors.toList());
////        System.out.println(unique);
//
////        String name = "Rahul Vaghela obey him";
////        for(int i=name.length()-1; i>=0; i--){
////            System.out.print(name.charAt(i));
////        }
////
////        String  name = " Rahul Vaghela ";
////        String[] s = name.trim().split(" ");
////        System.out.println(s.length);
////        for(String x : s){
////            System.out.println(x);
////        }
//
//        //Check the opening and closing paranthese are same
////        Scanner scan = new Scanner(System.in);
////        System.out.println("Enter Opening and closing parantheses");
////        String str = scan.next();
////        int  count1 = 0;
////        int count2 = 0;
////        for(int i=0; i<str.length(); i++){
////            if(str.charAt(i) == '('){
////                count1++;
////            } else if (str.charAt(i) == ')') {
////                count2++;
////            }
////        }
////        if(count1 == count2){
////            System.out.println("No Error Present");
////        }else{
////        }
////        System.out.println("Error Present");
//
////        for(int i =0; i<5; i++){
////            for(int j= 0; j<5; j++){
////                System.out.print("*");
////            }
////        }
////        System.out.println("\n");
//
//        //if the String 1 is Rotation of String 2 Find out
////        String str1 = "ABCD";
////        String str2 = "CDABz";
////        if(isRotation(str1,str2)){
////            System.out.println("Rotation Is Present");
////        }else{
////            System.out.println("Rotation is Not Present");
////        }
//
////        String str = "R@hu!v@g#e!@";
////        int count = 0;
////        for(int i=0; i<str.length(); i++){
////            if(!Character.isDigit(str.charAt(i)) && !Character.isLetter(str.charAt(i)) && !Character.isWhitespace(str.charAt(i))){
////                count++;
////            }
////        }
////        if(count == 0){
////            System.out.println("No Special character Fount");
////        }else{
////            System.out.println("Special Character Found "+count );
////        }
//        //Remove All The Occurences Of Given String
//
////        String str = "Rahul Vaghela";
////        char ch = "R";
////        removeChar(str,ch);
//
//        //compare rwo arrays and check they are same or not
////        int[] arr1 = {3,2,5,7};
////        int[] arr2 = {2,3,5,7};
////        if(areEqual(arr1,arr2)){
////            System.out.println("Two Arrays Are Equal");
////        }else{
////            System.out.println("Two Arrays Are NotEqual");
////        }
//
////        List<Integer> list = Arrays.asList(20,32,0103,10,10,20,31,5);
////        Set<Integer> set = new HashSet<>();
////        list.stream().filter(x -> set.add(x)).forEach(x-> System.out.println(x));
////        list.stream().filter(x -> !set.add(x)).collect(Collectors.toSet()).forEach(x-> System.out.println(x));
//
//        String str = "Welcome to the world of sigma and stoic you skinny jerk";
//        List<String> list = Arrays.asList(str.split(" "));
//        list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//
//        Map<String,Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//        System.out.println(map);
//    }
//    public static boolean areEqual(int[] arr1, int[] arr2){
//        int n = arr1.length;
//        int m = arr2.length;
//
//        if(n!= m){
//            return false;
//        }
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
//
//        for(int i=0; i<n; i++){
//            if(arr1[i] != arr2[i]){
//                return false;
//            }
//        }
//        return true;
//    }
//    public static boolean isRotation(String str1, String str2){
//        return (str1.length() == str2.length())&&((str1+str2).indexOf(str2)!=-1);
//    }
//
//    public static void removeChar(String str, char c){
//        int n = str.length();
//        String findString = " ";
//        for(int i=0; i<n; i++){
//            if(str.charAt(i) != c){
//                findString = findString + str.charAt(i);
//            }
//        }
//        System.out.println(findString);



    }
}
