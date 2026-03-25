/*
Problem: Find Second Largest Element in Array with Index

Description:
Given an array of integers, find the second largest element 
present in the array along with its index.

Input:
An integer array arr[]

Output:
Return an array where:
[0] = second largest element
[1] = index of second largest element

Example:
Input:  [20, 45, 17, 34, 86, 30]
Output: [45, 1]

Explanation:
Largest = 86
Second Largest = 45 (index 1)

Approach:
- Maintain two variables: first (largest) and second (second largest)
- Traverse the array once
- Update both values accordingly
- Return second largest and its index

Time Complexity: O(n)
Space Complexity: O(1)

Author: Suhas Bharti
*/

public class SecondLargestElement {

    public static void main(String[] args) {
        int[] arr = {20, 45, 17, 34, 86, 30};

        int[] result = secondLargest(arr);
        System.out.println("Second largest element= " + result[0] + " index is= " + result[1]);
    }

    // Method to find the second largest element and its index
    public static int[] secondLargest(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int indexFirst = -1;
        int indexSecond = -1;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] > first) {
                second = first;
                indexSecond = indexFirst;

                first = arr[i];
                indexFirst = i;

            } else if(arr[i] > second && arr[i] != first) {
                second = arr[i];
                indexSecond = i;
            }
        }

        return new int[]{second, indexSecond};
    }
}