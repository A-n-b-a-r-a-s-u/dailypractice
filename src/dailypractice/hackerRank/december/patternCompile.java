package dailypractice.hackerRank.december;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class patternCompile {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String pattern = in.nextLine();
            Pattern patt = Pattern.compile("");
            Matcher match = patt.matcher(pattern);

            if (match.find()) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
            testCases--;
        }
    }
}

/*
Pattern pattern = Pattern.compile("[A-Za-z]+");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        Matcher match = pattern.matcher(input);

        if (match.find()){
            System.out.println("Valid");
        }
        else {
            System.out.println("Invalid");
        }

 */