package JavaFundamentalsTask.MainTaskAndOptionalTask.src;

import java.util.Scanner;

public class MainTask3 {
    public static void main(String args[]){
        Scanner in = new Scanner (System.in);

        System.out.println("Input count of numbers");
        int countNumbers = in.nextInt();
        int [] arrayNumbers = new int [countNumbers];

        for (int i = 0; i < countNumbers; i++) {
            System.out.print("Input number №" + (i+1) + " ");
            arrayNumbers[i] = in.nextInt();
        }

        System.out.println("Numbers without tab: ");
        for (int i = 0; i < countNumbers; i++){
            System.out.print(" " + arrayNumbers[i]);
        }

        System.out.println("");
        System.out.println("Numbers with tab: ");
        for (int i = 0; i < countNumbers; i++){
            System.out.println(" " + arrayNumbers[i]);
        }


    }
}
