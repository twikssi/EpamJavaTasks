import java.util.Scanner;

public class OptionalTaskNewVersion {
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Input count of numbers");
        int count = in.nextInt();

        double [] number = new double[count];
        int [] length = new int[count];

        for (int i = 0 ;i < count; i++){
            System.out.print("Input number №" + (i+1) + " ");
            number[i] = in.nextDouble();
        }

        for (int i = 0; i < count; i++){
            length[i] = String.valueOf(number[i]).length();
        }

        for (int i = 0 ;i < count; i++){
            if ( number[i] < 0){
                if (number[i] == 0.0) {
                    length[i] = 0;
                    System.out.println("Number is " + number[i] + " his lenght 0");
                } else if (number[i] - ((int) number[i]) == 0 ){
                    length[i] = length[i] - 3;
                    System.out.println("Number is " + number[i] + " his lenght " + length[i]);
                } else {
                    length[i] = length[i] - 2;
                    System.out.println("Number is " + number[i] + " his lenght " + length[i]);
                }
            } else {
                if (number[i] == 0.0) {
                    length[i] = 0;
                    System.out.println("Number is " + number[i] + " his lenght 0");
                } else if (number[i] - ((int) number[i]) == 0 ){
                    length[i] = length[i] - 2;
                    System.out.println("Number is " + number[i] + " his lenght " + length[i]);
                } else {
                    length[i] = length[i] - 1;
                    System.out.println("Number is " + number[i] + " his lenght " + length[i]);
                }
            }

        }

        int len = 0;
        double num = 0.0;


        for (int i = 0; i < count;i++)
            for (int j = 0; j < count; j++){
                if ((j+1) != count) {
                    if (length[j] > length[j + 1]) {
                        len = length[j];
                        length[j] = length[j + 1];
                        length[j + 1] = len;

                        num = number[j];
                        number[j] = number[j + 1];
                        number[j+1] = num;
                    }
                }
            }

        System.out.println("");
        for (int i = 0; i < count; i++){
            if (length[0] == length[i])
            System.out.println("The shortsest number " + number[i] + " his length " + length[i]);
        }

        System.out.println("");
        for (int i = 0; i < count; i++){
            if (length[count-1] == length[i])
                System.out.println("The largest number " + number[i] + " his length " + length[i]);
        }

        System.out.println("");
        System.out.println("Numbers from smaller to larger");
        for (int i = 0; i <count; i++){
            System.out.println("Number " + number[i]+" his length "+ length[i]);
        }
        System.out.println("");
        System.out.println("Number from larger to smaller");
        for (int i = count - 1; i >= 0; i--){
            System.out.println("Number " + number[i]+" his length "+ length[i]);
        }

        double average = 0;
        for (int i = 0; i < count; i++){
            average += length[i];
        }
        average = average / length.length;

        System.out.println(" Average length " + average);

        System.out.println(" ");
        for (int i = 0; i < count; i++){
            if (length[i] < average){
                System.out.println("Numbers are less then average " + number[i] + " his length " + length[i]);
            }
              else if(length[i] > average) {
                System.out.println("Numbers are more then average " + number[i] + " his length " + length[i]);
            } else {
                System.out.println("Numbers are equal average " + number[i] + " his length " + length[i]);
            }
        }

    }
}
