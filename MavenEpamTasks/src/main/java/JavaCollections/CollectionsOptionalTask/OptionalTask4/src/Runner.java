import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {
    public static void main(String [] args){

        ListLineAndLengthLine listLineAndLengthLine = new ListLineAndLengthLine();
        SortLineAndLengthLine sortLineLength = new SortLineAndLengthLine();
        List<LineAndLengthLine> listLineAndLengthLinePoem = listLineAndLengthLine.getListLineLength("Poem.txt");;

        Collections.sort(listLineAndLengthLinePoem,sortLineLength);
        System.out.println(listLineAndLengthLinePoem);

    }
}
