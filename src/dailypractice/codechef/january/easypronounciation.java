package dailypractice.codechef.january;

import java.util.Scanner;

public class easypronounciation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        sc.nextLine();
        String s;
        for (int i = 0;i < len ; i++ ) {
            int dumm = sc.nextInt();
            boolean flag = true;
            sc.nextLine();
            s = sc.nextLine();
            int count =0;
            int size = s.length();
            for(int j =0; j< size; j++) {
                if(s.charAt(j) == 'a' || s.charAt(j) == 'e' ||s.charAt(j) == 'i' ||s.charAt(j) == 'o' ||s.charAt(j) == 'u'){
                     count =0;
                }
                else {
                    count++;
                }
                if (count > 4) {
                    System.out.println("NO");
                    flag = false;
                    break;
                }
            }
            if (flag == true) {

                System.out.println("YES");
            }
        }
    }
}
