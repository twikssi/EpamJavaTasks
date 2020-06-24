import java.util.Comparator;

public class SortLineAndLengthLine implements Comparator <LineAndLengthLine> {
    public int compare(LineAndLengthLine one, LineAndLengthLine two){
        return two.getLineLength() - one.getLineLength();
    }
}
