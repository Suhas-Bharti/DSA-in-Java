/*
Problem: Find Factorial of a Number

Description:
Given an integer n, find its factorial.

Factorial of n = n * (n-1) * ... * 1

Input:
An integer n

Output:
Factorial of n

Example:
Input: 5
Output: 120

Explanation:
5 * 4 * 3 * 2 * 1 = 120

Approach:
- Initialize result = 1
- Multiply numbers from 1 to n

Time Complexity: O(n)
Space Complexity: O(1)

Author: Suhas Bharti
*/


public class Factorial {
    public static void main(String[] args) {
        int n = 5;

        System.out.println("Factorial of " + n + " is: " + factorial(n));
    }

    // Method to perform to find a factorial of given number
    public static int factorial(int n) {
        int result = 1;

        for(int i=1; i<=n; i++) {
            result *= i;
        }

        return result;
    }
}