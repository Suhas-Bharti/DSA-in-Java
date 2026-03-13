/*
Problem: Search in Rotated Sorted Array

Description:
Given a sorted array that has been rotated,
find the index of a target element.

Input:
arr = [4,5,6,7,0,1,2]
target = 0

Output:
4

Time Complexity: O(log n)
Space Complexity: O(1)

Author: Suhas Bharti
*/

import java.util.*;

public class SearchInRotatedSortedArray{
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        int result = searchInRotatedSortedArray(arr, target);
        if(result != -1){
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }

    //Method
    public static int searchInRotatedSortedArray(int[] arr, int target) {
        int start = 0, end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] == target) {
                return mid;
            }

            if(arr[start] <= arr[mid]) {

                if(target >= arr[start] && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            //
            else {

                if(target > arr[mid] && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        } 

        return -1;
    }
}