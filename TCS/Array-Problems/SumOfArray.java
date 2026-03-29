/*
<<<<<<< HEAD
Problem: Sum of Array Elements

Description:
Given an array of integers, find the sum of all elements 
present in the array.

Input:
An integer array arr[]
=======
Problem: Find Sum of Array Elements

Description:
Given an array of integers, calculate the sum of all elements present in the array.

Input:
- First line contains an integer n (size of array)
- Second line contains n space-separated integers
>>>>>>> 0631290b1a718c79823a39905afb7073071f99a7

Output:
Return the sum of all elements in the array

Example:
<<<<<<< HEAD
Input:  [10, 20, 30, 40]
Output: 100

Explanation:
Sum = 10 + 20 + 30 + 40 = 100
=======
Input:
5
1 2 3 4 5

Output:
15

Explanation:
Sum = 1 + 2 + 3 + 4 + 5 = 15
>>>>>>> 0631290b1a718c79823a39905afb7073071f99a7

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
<<<<<<< HEAD
        int[] arr = {10, 20, 30, 40};

        int result = findSum(arr);
        System.out.println("Sum of array = " + result);
    }

    // Method to return sum of array
    public static int findSum(int[] arr) {
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
=======
        int[] arr = {1, 2, 3, 4, 5};

        int result = sumOfArray(arr);
        System.out.println("Sum of all elements: " + result);
    }

    // Method to calculate the sum of all elements present in the array
    public static int sumOfArray(int[] arr) {
        int sum = 0;
        
        for(int i=0; i<arr.length; i++) {
>>>>>>> 0631290b1a718c79823a39905afb7073071f99a7
            sum += arr[i];
        }

        return sum;
    }
}