package com.company;
/*
Sijjad Khalid
Purpose: This application will distinguish whether a word is a palindrome
Input: User will input a word of there choice
Processing: Program will use if statement to decide if the word is a palindrome
Output: The program will display the word and the palindrome version of the word; then display if palindrome or not
 */

public class Main {

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        palindrome.menu();
        palindrome.checkPalindrome();
    }
}
