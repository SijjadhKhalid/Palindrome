package com.company;

import java.util.Scanner;
class Palindrome {

    private Scanner input = new Scanner(System.in);

    void menu(){
        System.out.println("Input any word to find out if it is a palindrome");
    }

    void checkPalindrome(){
        System.out.println("Enter a word!  ");
        String word = input.nextLine().toLowerCase().trim();

        //Reverse the user input and stores into reverseWord
        String reverseWord = new StringBuilder(word).reverse().toString();

        System.out.println("The reverse of the word "+ word +" is "+ reverseWord);

        if (word.equals(reverseWord)){
            System.out.println("\nThe word you have entered is a palindrome."); }
        else{
            System.out.println("\nThe word you have entered is NOT a palindrome");
        }
    }
}

