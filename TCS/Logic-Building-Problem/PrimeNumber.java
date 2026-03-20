/*
Problem: Check Prime Number

Description:
Given a number, check whether it is a prime number or not.

A prime number is a number greater than 1 that has only two factors:
1 and the number itself.

Input:
An integer n

Output:
True if the number is prime, otherwise False

Example:
Input: 7
Output: True

Input: 8
Output: False

Approach:
- If n <= 1, it is not prime
- Loop from 2 to sqrt(n)
- If n is divisible by any number in this range, it is not prime
- Otherwise, it is prime

Time Complexity: O(√n)
Space Complexity: O(1)

Author: Suhas Bharti
*/

import java.util.*;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        boolean isPrime = primeNumber(n);
        System.out.println(n + " is prime? " + isPrime);

        sc.close();

    }

    // Method to check whether number is prime
    public static boolean primeNumber(int n) {

        // Handle edge case
        if(n <= 1) {
            return false;
        }

        // Using optimized loop (i * i <= n) instead of Math.sqrt(n)
        // Alternative:
        // for (int i = 2; i <= Math.sqrt(n); i++)
        for(int i=2; i*i<=n; i++) {
            if(n % i == 0) {  // n is the multiple of i (i not equal to 1 or n)
                return false;
            }
        }

        return true;
    }
}