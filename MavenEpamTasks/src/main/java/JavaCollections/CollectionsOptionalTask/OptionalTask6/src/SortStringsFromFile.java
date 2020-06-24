import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortStringsFromFile {
    public static void main(String[] args){
        ListStringsFromFile listStringsFromFile = new ListStringsFromFile("Song.txt");
        List<String> sortListFromFile = new ArrayList<>();
        sortListFromFile = listStringsFromFile.getListStringsFromFile();
        System.out.println("There is list from file no sort: " + sortListFromFile);
        Collections.sort(sortListFromFile);
        System.out.println("List has sorted: " + sortListFromFile);
    }
}
