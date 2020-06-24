import java.util.Scanner;

public class MainTask2 {
    public static void main (String args[]){
        Scanner in = new Scanner (System.in);

        System.out.println("Input your text");
        String text = in.nextLine();

        String[] subStr = text.split(" ");

        for (int i = subStr.length -1; i >= 0; i--){
            System.out.print(subStr[i] + " ");
        }
        System.out.println("");
        String revers = new StringBuffer(text).reverse().toString();
        System.out.println(revers);
    }
}
