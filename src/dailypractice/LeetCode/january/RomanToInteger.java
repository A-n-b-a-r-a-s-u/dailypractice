package dailypractice.LeetCode.january;

import java.util.Scanner;

public class RomanToInteger {
    public int romanToInt(String s) {
        int result = 0;
        int lengthOfString = s.length();

        for(int i =0; i< lengthOfString; i++ ) {
            if(s.charAt(i) == 'I') {
                result += 1;
            }
            else if(s.charAt(i) == 'V') {
                if (i != 0 && s.charAt(i-1) == 'I') {
                    result += 3;
                }
                else {
                    result += 5;
                }
            }
            else if(s.charAt(i) == 'X') {
                if (i != 0 && s.charAt(i-1) == 'I') {
                    result += 8;
                }
                else {
                    result += 10;
                }
            }
            else if(s.charAt(i) == 'L') {
                if (i != 0 && s.charAt(i-1) == 'X') {
                    result += 30;
                }
                else {
                    result += 50;
                }
            }
            else if(s.charAt(i) == 'C') {
                if (i != 0 && s.charAt(i-1) == 'X' ) {
                    result += 80;
                }
                else {
                    result += 100;
                }
            }
            else if(s.charAt(i) == 'D') {
                if (i != 0 && s.charAt(i-1) == 'C' ) {
                    result += 300;
                }
                else {
                    result += 500;
                }
            }
            else if(s.charAt(i) == 'M') {
                if (i != 0 && s.charAt(i-1) == 'C') {
                    result += 800;
                }
                else {
                    result += 1000;
                    }
            }
            else {
                System.out.println("Entered a wrong Letter");
            }

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Enter the Roman Letters as Input: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        RomanToInteger roman = new RomanToInteger();
        System.out.println(roman.romanToInt(input));
    }

}
