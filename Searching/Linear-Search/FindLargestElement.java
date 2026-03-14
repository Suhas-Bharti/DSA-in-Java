/*
Problem: Find the Largest Element in an Array

Description:
Given an array of integers, find the largest element present in the array.

Input:
arr = [5, 8, 3, 7, 9]

Output:
9

Explanation:
Among all the elements in the array, 9 is the largest.

Time Complexity: O(n)
Space Complexity: O(1)

Author: Suhas Bharti
*/

import java.util.*;

public class FindLargestElement {
    public static void main(String[] args) {
        int[] arr = {5, 8, 3, 7, 9};

        int result = findLargest(arr);
        System.out.println("The largest number is: " + result);
         
    }

    //Method to perform Find Largest Element
    public static int findLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;  // -infinity
       //int largest = arr[0]; 

        for(int i=0; i<arr.length; i++) {
            if(largest < arr[i]) {
                largest = arr[i];
            }
        }

        return largest;
    }
}