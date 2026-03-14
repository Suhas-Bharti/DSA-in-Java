/*
Problem: Basic Binary Search

Description:
Given a sorted array of integers, find the index of a target element
using Binary Search.

Input:
arr = [10,20,30,40,50]
target = 40

Output:
3

Time Complexity: O(log n)
Space Complexity: O(1)

Author: Suhas Bharti
*/

public class BasicBinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 40;

        int result = searchElement(arr, target);

        if(result != -1) {
            System.out.println("Elelment found at index: " + result);
        } else {
            System.out.println("Element not found in the array");
        }
    }

    // Method to perform Binary Search
    public static int searchElement(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] == target) {
                return mid;  // target found
            } else if(arr[mid] < target) {
                start = mid + 1;   // search right half
            } else {
                end = mid - 1;   // search left half
            }
        }
        return -1;  // target not found  

    }
}