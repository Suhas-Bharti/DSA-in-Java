/*
Problem: Remove Spaces from a String

Description:
Given a string, remove all spaces from it without using built-in 
functions like replace() or replaceAll().

Input:
A string str

Output:
A new string with all spaces removed

Example:
Input: Hello World Java
Output: HelloWorldJava

Approach:
- Traverse the string character by character
- Check if the character is not a space (' ')
- Append only non-space characters to a StringBuilder

Time Complexity: O(n)
Space Complexity: O(n)

Author: Suhas Bharti
*/


public class RemoveSpaces {
    public static void main(String[] args) {
        String str = "Hello World Java";
        String result = removeSpaces(str);

        System.out.println("Remove Spaces: " + result);
    }

    // Method to remove spaces from string using StringBuilder
    public static String removeSpaces(String str) {

        // Handle edge case (optional but recommended)
        if(str == null || str.length() == 0) {
            return str;
        }

        StringBuilder remove = new StringBuilder();

        for(int i=0; i<str.length(); i++) {

            // Append only non-space characters
            if(str.charAt(i) != ' ') {
                remove.append(str.charAt(i));
            }
        }

        return remove.toString();
    }
}