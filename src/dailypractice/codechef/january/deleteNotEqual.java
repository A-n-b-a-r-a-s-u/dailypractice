package dailypractice.codechef.january;

import java.util.Scanner;

public class deleteNotEqual {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        System.out.println(loop);
        int len;
        String s;

        for (int i = 0;i< loop ; i++ ) {
            len = sc.nextInt();
            sc.nextLine();
            System.out.println(len);
            s = sc.nextLine();
            System.out.println(s);
            if (s.length() == len) {
                if (s.contains("1")){
                    System.out.println(1);
                }
                else {
                    System.out.println(s.length());
                }
            }
            else {
                System.out.println("Length is mismatched.. ");
            }


        }

    }
}
