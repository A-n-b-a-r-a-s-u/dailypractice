package dataStructureLearning.january;

import java.util.Scanner;

public class BaseProgram1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the natural Number");
        int n = sc.nextInt(), result = 0;
        for (int i =1; i<= n; i++){
            result += i;
        }
        System.out.println("Result is :" + result);
    }
}
