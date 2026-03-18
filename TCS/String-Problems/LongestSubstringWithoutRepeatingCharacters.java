/*
Problem: Longest Substring Without Repeating Characters

Description:
Given a string, find the length of the longest substring without repeating characters.

Input:
A string str

Output:
Length of the longest substring without repeating characters

Example:
Input: abcabcbb
Output: 3
Explanation: "abc" is the longest substring without repeating characters.

Input: bbbbb
Output: 1

Approach:
- Use Sliding Window technique with two pointers (left & right)
- Use an array to track characters in the current window
- Expand window by moving right pointer
- If duplicate found, shrink window from left

Time Complexity: O(n)
Space Complexity: O(1)

Author: Suhas Bharti
*/

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String str = "abcabcbb";
        int result = longestSubstring(str);

        System.out.println("Length of longest substring: " + result);
    }

    public static int longestSubstring(String str) {
        
        if(str == null || str.length() == 0) {
            return 0;
        }

        int[] freq = new int[256]; //ASCII array
        int left = 0, maxLength = 0;

        for(int right = 0; right < str.length(); right++){
            freq[str.charAt(right)]++;

            // If duplicate found, shrink window
            while(freq[str.charAt(right)] > 1) {
                freq[str.charAt(right)]--;
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
        
    }
}