package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* 1) Write a program to print a string in reverse: Eg: Welcome */
//	    char [] reverseWord = {'W','e','l','c','o','m','e'} ;
//
//	    for (int i = reverseWord.length-1; i >= 0 ; i--){
//	      System.out.print(reverseWord[i]);
//       }


        /* 2) Write a program that will find the length of an input string
         without using the library function.
         */
//        Scanner input = new Scanner(System.in);

//       //Ask user for string input
//        System.out.println("Please enter a string: ");
//        String mysterySentence = input.nextLine();
//
//        for

       /* 3) Prompt the user to input 10 values and store them into an array.
       If there are any duplicate values in that array, remove them and
       print out the remaining values.
       */
       double []num = new double[10];
       Scanner input = new Scanner(System.in);
       System.out.println("Please enter 10 values: ");

       for(int i =0; i < 10; i++) {
           num[i] = input.nextDouble();

           for (int k = 0; k < 10; k++) {
               if (i == k) {
                   continue;
               } else if (num[i] == num[k]) {
                   num[i] = num[k]=0;
               }
           }
       }
       for(double numbers:num) {
           if (numbers != 0) {
               System.out.println(numbers);
           }
       }

       }
    }

