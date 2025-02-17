package dailypractice.hackerRank.december;

import java.util.*;

public class stringSplit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        String str[] = s.split("[^a-zA-Z]+");
        if (s.isEmpty()) {
            System.out.println(0);
        }
        else {
            System.out.println(str.length);
        }

        for (String in : str) {
            System.out.println(in);
        }
    }
}
