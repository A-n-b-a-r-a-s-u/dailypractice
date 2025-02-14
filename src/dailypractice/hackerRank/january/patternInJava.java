package dailypractice.hackerRank.january;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class patternInJava {

    public static void main(String[] args) {
        Pattern patter = Pattern.compile("([0-9]|[0-9][1-9]|[0-2][0-4][0-9]|25[0-5])\\.([0-9]|[0-9][1-9]|[0-2][0-4][0-9]|25[0-5])\\.([0-9]|[0-9][1-9]|[0-2][0-4][0-9]|25[0-5])\\.([0-9]|[0-9][1-9]|[0-2][0-4][0-9]|25[0-5])");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Matcher match = patter.matcher(input);
        System.out.println(match.matches());
    }
}

/*
String pattern = "(([0-9]|[0-9][1-9]|[0-2][0-5][0-5])\\.([0-9]|[0-9][1-9]|[0-2][0-5][0-5])\\.([0-9]|[0-9][1-9]|[0-2][0-5][0-5])\\.([0-9]|[0-9][1-9]|[0-2][0-5][0-5]))";
 */