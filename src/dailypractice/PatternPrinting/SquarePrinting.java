package dailypractice.PatternPrinting;

import java.util.Scanner;

public class SquarePrinting {
    Scanner scanner = new Scanner(System.in);

    public void normal(){
        System.out.print("Enter the Number for square shape: ");
        int input = scanner.nextInt();
        System.out.println();
        for (int i = 1; i<= input; i++){

            for (int j = 1; j<= input; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void outsidebox(){
        System.out.print("Enter the Number for printing the Square pattern : ");
        int input = scanner.nextInt();
        System.out.println();
        for (int i = 0; i <= input; i++){
            for (int j = 0 ; j<= input; j++){
                if (i == 0 || i == input || j == 0 || j == input){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void numberNormal(){
        System.out.print("Enter the Number for printing the Square pattern : ");
        int printnum = 0, input = scanner.nextInt();
        for (int i = 0; i<input; i++){
            for (int j = 0; j< input; j++){
                System.out.print(printnum+ " ");
                printnum++;
            }
            System.out.println();
        }
    }
    public void snackSquareNumPattern(){
        System.out.println("Enter the Number for printing the Square pattern : ");
        int printNum = 0, input = scanner.nextInt();
        for (int i = 0; i< input; i++){
            if (i % 2 != 0 ){
                printNum+=(input-1);
                for (int j = input; j > 0 ; j--){
                    System.out.print(printNum + " ");
                    printNum--;
                }
                printNum+=(input+1);
            }
            else {
                for (int j = 0; j< input; j++){
                    System.out.print(printNum + " ");
                    printNum++;
                }
            }
            System.out.println();
        }
    }


}

