/*
Problem: Generate Fibonacci Series

Description:
Print first n numbers of Fibonacci series.

Fibonacci series:
0, 1, 1, 2, 3, 5, 8...

Input:
An integer n

Output:
First n Fibonacci numbers

Example:
Input: 5
Output: 0 1 1 2 3

Approach:
- Use two variables (a, b)
- Print and update them iteratively

Time Complexity: O(n)
Space Complexity: O(1)

Author: Suhas Bharti
*/

import java.util.*;

public class FibonacciSeries {
    public static void main(String[] args) {
        int num = 10;

        printFibonacciSeries(num);
    }

    // Method to perform to print fibonacci series
    public static void printFibonacciSeries(int num) {
        int a = 0, b = 1;

        for(int i=0; i< num; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}