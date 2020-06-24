import sun.awt.geom.AreaOp;
import java.util.Scanner;

public class OptionalTaskProject1and2OldVersion {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.println("Input count of numbers");
        int countNumbers = in.nextInt();
        int length = 0;

        int[][] arr = new int[1000][countNumbers];
        int per;
        int maxCount = 0;
        int minCount = 10000;

        for (int i = 0; i < countNumbers; i++){
            System.out.print("Input a number №" + (i+1) +":");
            arr[0][i] = in.nextInt();
            per = arr[0][i];

            while (arr[0][i] >= 1) {
                length++;
                arr[0][i] /= 10;
            }

            arr[length][i] = per;

            if (minCount > length) {
                minCount = length;
            }

            if (maxCount < length) {
                maxCount = length;
            }
            length = 0;
        }

        for (int i = 0; i <= countNumbers - 1; i++ ){
            if (arr[minCount][i] != 0) {
                System.out.println("Min length Number: " + arr[minCount][i] + " His length = " + minCount);
            }
        }

        for (int i = 0; i <= countNumbers - 1; i++ ){
            if (arr[maxCount][i] != 0) {
                System.out.println("Max length Number: " + arr[maxCount][i] + " His length = "+maxCount);
            }
        }

        System.out.println("Numbers low to high:");
        for (int j = 0; j <= maxCount; j++) {
            for (int i = 0; i <= countNumbers - 1; i++) {
                if (arr[j][i] != 0) {
                    System.out.println(arr[j][i]);
                }
            }
        }

        System.out.println("Numbers high to low:");
        for (int j = maxCount; j >= 0; j--) {
            for (int i = countNumbers - 1; i >= 0; i--) {
                if (arr[j][i] != 0) {
                    System.out.println(arr[j][i]);
                }
            }
        }

        in.close();
    }
}
