package dailypractice.PatternPrinting;

import java.util.Scanner;

public class TrianglePrinting {

    Scanner sc = new Scanner(System.in);
    public void upSideDown(){
        System.out.print("Enter the number for pattern printing : ");
        int input = sc.nextInt();
        int temp = input;
        for (int i =0; i< input; i++){
            for (int j =0; j< temp; j++){
                System.out.print("* ");
            }
            temp--;
            System.out.println();
        }

    }

    public void downToUp(){
        System.out.print("Enter the Number for Pattern Printing : ");
        int input = sc.nextInt();
        System.out.println();
        for (int i = 1; i <= input; i++){
            for (int j = 0 ; j< i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void realTriangle(){

    }
}
