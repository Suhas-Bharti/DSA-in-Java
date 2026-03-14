/*
Problem: Maximum Sum Subarray (Brute Force Approach)

Description:
Given an array of integers, find the contiguous subarray with the
maximum possible sum.

This solution uses the brute force approach by generating all
possible subarrays and calculating their sums.

Example:
Input:
arr = [-2, 3, -4, 5, 7, 9]

Output:
21

Explanation:
The subarray [5,7,9] has the maximum sum = 21.

Approach:
1. Generate all possible subarrays using three nested loops.
2. Calculate the sum of each subarray.
3. Track the maximum sum encountered.

Time Complexity: O(n³)
Space Complexity: O(1)

Author: Suhas Bharti
*/

import java.util.*;

public class MaxSubarraySumBruteForce{
    public static void main(String[] args) {
        int[] arr = {-2, 3, -4, 5, 7, 9};

        maxSubArray(arr);

    }

    //Method to perform MaxSubArray sum using Brute Force
    public static void maxSubArray(int[] arr) {
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int currSum = 0;
                for(int k=i; k<=j; k++){
                    currSum += arr[k];
                }
                if(maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum Subarray Sum (Brute Force): " + maxSum);
    }
}