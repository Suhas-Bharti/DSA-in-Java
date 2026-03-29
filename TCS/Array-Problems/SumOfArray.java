/*
Problem: Sum of Array Elements

Description:
Given an array of integers, find the sum of all elements 
present in the array.

Input:
An integer array arr[]

Output:
Return the sum of all elements in the array

Example:
Input:  [10, 20, 30, 40]
Output: 100

Explanation:
Sum = 10 + 20 + 30 + 40 = 100

Approach:
- Initialize a variable sum = 0
- Traverse the array using a loop
- Add each element to sum
- Return the final sum

Time Complexity: O(n)
Space Complexity: O(1)

Author: Suhas Bharti
*/

public class SumOfArray {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};

        int result = findSum(arr);
        System.out.println("Sum of array = " + result);
    }

    // Method to return sum of array
    public static int findSum(int[] arr) {
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }
}