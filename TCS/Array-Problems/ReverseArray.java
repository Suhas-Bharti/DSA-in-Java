/*
Problem: Print Array in Reverse Order Using Method

Description:
Given an array of integers, print its elements in reverse order 
using a separate method.

Input:
- First line contains an integer n (size of array)
- Second line contains n space-separated integers

Output:
Print the elements of the array in reverse order

Example:
Input:
5
1 2 3 4 5

Output:
5 4 3 2 1

Explanation:
The array is traversed from the last index to the first index 
and each element is printed.

Approach:
- Take input using Scanner
- Store elements in an array
- Create a method to print elements in reverse order
- Traverse from last index to 0

Time Complexity: O(n)
Space Complexity: O(1)

Author: Suhas Bharti
*/

import java.util.*;

public class ReverseArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // Size
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        reverseArray(arr); // Method call
    }

    // Method to print array in reverse order
    public static void reverseArray(int[] arr) {
        System.out.print("Reverse array= ");
        for(int i=arr.length-1; i>=0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}