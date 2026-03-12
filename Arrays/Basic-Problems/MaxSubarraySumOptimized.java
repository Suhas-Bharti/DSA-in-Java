/*
Problem: Maximum Subarray Sum (Optimized O(n²) Approach)

Description:
Given an integer array, find the contiguous subarray that has the
maximum possible sum and return that sum.

This solution improves the brute force approach by storing the
current subarray sum instead of recalculating it every time.

Example:
Input:
arr = [-2, 4, 9, -3, -1, 5, -6]

Output:
14

Explanation:
The subarray [4, 9, -3, -1, 5] gives the maximum sum:
4 + 9 - 3 - 1 + 5 = 14

Approach:
1. Iterate through the array using index i as the starting point.
2. Initialize currentSum = 0 for each starting index.
3. Extend the subarray using index j and add elements to currentSum.
4. Update maxSum whenever a larger sum is found.

Time Complexity: O(n²)
Space Complexity: O(1)

Author: Suhas Bharti
*/

import java.util.*;

public class MaxSubarraySumOptimized{
    public static void main(String[] args){
        int[] arr = {-2, 4, 9, -3, -1, 5, -6};

        int result = optimizedMaxSubarraySum(arr);
        System.out.println("Maximum Subarray Sum = " + result);
    }

    //Method to find Max Subarray Sum using Optimized Appoach (O(n²))
    public static int optimizedMaxSubarraySum(int[] arr){
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++) {
            int currSum = 0;
            for(int j=i; j<arr.length; j++){
                currSum = currSum + arr[j];

                if(currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }

        return maxSum;
    }
}