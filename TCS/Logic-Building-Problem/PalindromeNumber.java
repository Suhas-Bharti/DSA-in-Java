/*
Problem: Check Palindrome Number

Description:
Given an integer, check whether it is a palindrome or not.

A palindrome number remains the same when reversed.

Example:
Input: 121
Output: True

Approach:
- Reverse the number
- Compare with original number

Time Complexity: O(d)
Space Complexity: O(1)

Author: Suhas Bharti
*/

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 121;

        boolean result = isPalindrome(num);
        System.out.println("Given number is palindrome: " + result);
    }

    // Method to check whether number is palindrome or not
    public static boolean isPalindrome(int num) {
        int original = num; // Store original number
        int rev = 0;

        while(num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        // Compare original and reversed number
        return original == rev;
    }
}