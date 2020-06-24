package JavaFundamentalsTask.MainTaskAndOptionalTask.src;

import java.util.Scanner;

public class MainTask4 {
    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input numbers with space and click Enter ");

        String numbers = in.nextLine();
        String [] arrNumbersString = numbers.split(" ");
        long sum = 0;
        long composition = 1;
        long [] arrNumbersLong = new long[arrNumbersString.length];

        for (int i = 0; i < arrNumbersString.length; i++){
            arrNumbersLong[i] = Long.parseLong(arrNumbersString[i]);
        }

        for (int i = 0; i < arrNumbersLong.length; i++){
            sum += arrNumbersLong[i];
            composition *= arrNumbersLong[i];
        }

        System.out.println("Total = " + sum);
        System.out.println("Composition = " + composition);
    }
}
