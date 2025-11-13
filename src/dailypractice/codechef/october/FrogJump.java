package dailypractice.codechef.october;

import java.util.Scanner;

public class FrogJump {
    public static void main (String[] args)
    {
        System.out.println(NValue(5));
    }

    public static int NValue(int n){
        boolean left = true;
        for(int i = n-1; i> 0; i--){
            if (left){
                n = n - i;
                left = false;
            }
            else{
                n = n + i;
                left = true;
            }
        }
        return n;
    }
}
