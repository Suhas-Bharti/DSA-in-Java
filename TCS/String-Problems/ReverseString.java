/*
Problem: Reverse a String

Description:
Given a string, reverse it and return the reversed string.

Input:
A string str

Output:
Reversed string

Example:
Input: hello
Output: olleh

Approach:
- Traverse the string from end to beginning
- Append each character to a new string

Time Complexity: O(n)
Space Complexity: O(n)

Author: Suhas Bharti
*/

public class ReverseString{
    public static void main(String[] args){
        String str = "Noon";

        String result = reverseString(str);
        System.out.println("Reverserd string: " + result);
    }

    //
    public static String reverseString(String str){

        if(str == null || str.length() == 0) {
            return str;
        }

        StringBuilder reversed = new StringBuilder();

        for(int i=str.length()-1; i>=0; i--){
            reversed.append(str.charAt(i));
        }

        return reversed.toString();
    }
}