/*
Problem: Check Armstrong Number

Description:
Given an integer n, check whether it is an Armstrong number or not.

An Armstrong number is a number that is equal to the sum of its digits 
each raised to the power of the total number of digits.

Example:
Input: 153
Output: True

Approach:
- Store the original number
- Count total digits
- Extract each digit using %
- Raise digit to power of total digits and add to sum
- Compare sum with original number

Time Complexity: O(d)
Space Complexity: O(1)

Author: Suhas Bharti
*/

// Note :- “Math class java.lang package ka part hai, jo automatically import hota hai, isliye explicit import ki zarurat nahi hoti.”

public class ArmstrongNumber {

    public static void main(String[] args) {
        int num = 153;

        boolean result = isArmstrong(num);
        System.out.println("Given number is Armstrong: " + result);
    }

    // Method to check whether it is an Armstrong number or not.
    public static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;

        // Count number of digits
        int digits = String.valueOf(num).length();

        while(num != 0) {
            int digit = num % 10;
            sum +=(int)Math.pow(digit, digits); // generalized power
            num = num / 10;
        }

        return original == sum;
    }
}