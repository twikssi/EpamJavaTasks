import java.util.ArrayList;
import java.util.List;

public class ListLineAndLengthLine {

    public List<LineAndLengthLine> getListLineLength (String nameFile){
        List<LineAndLengthLine> listLineLength = new ArrayList<>();
        List<String> list;
        ListStringsFromFile listStringsFromFile = new ListStringsFromFile(nameFile);
        list = listStringsFromFile.getListStringsFromFile();

        for (String line: list) {
            listLineLength.add(new LineAndLengthLine(line));
        }
        return listLineLength;
    }

}
