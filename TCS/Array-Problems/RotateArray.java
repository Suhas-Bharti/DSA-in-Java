/*
Problem: Rotate Array to the Right by K Steps (Using Reversal Algorithm)

Description:
Given an array of integers, rotate the array to the right by k steps 
using an in-place reversal algorithm.

Input:
- An integer array arr[]
- An integer k (number of rotations)

Output:
Return the rotated array after k right rotations

Example:
Input:  arr = [1, 2, 3, 4, 5], k = 3
Output: [3, 4, 5, 1, 2]

Explanation:
After rotating the array 3 times to the right,
the last 3 elements move to the front.

Approach:
- Use reversal algorithm:
  1. Reverse the entire array
  2. Reverse first k elements
  3. Reverse remaining elements

Time Complexity: O(n)
Space Complexity: O(1)

Author: Suhas Bharti
*/

public class RotateArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 3;

        // Call method and store result
        int[] result = rotateArray(arr, k);

        // Print rotated array
        for(int i=0; i<result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }

     // Method to rotate array using reversal algorithm
    public static int[] rotateArray(int[] arr, int k) {
        int n = arr.length;

        // Handle cases where k > n
        k = k % n;

        // Step 1: Reverse entire array
        reverse(arr, 0, n - 1);
        // Step 2: Reverse first k elements
        reverse(arr, 0, k - 1);
        // Step 3: Reverse remaining elements
        reverse(arr, k, n-1);

        return arr;
    }

    //Helper method to reverse array
    public static void reverse(int[] arr, int start, int end) {

        //Swapping elements
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}