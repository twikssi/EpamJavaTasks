import java.io.*;
import java.util.ArrayList;
import java.util.List;



public class runner {
    public static void main (String [] args){
       ListStringsFromFile listStringsFromFile = new ListStringsFromFile("Lyrics.txt");
       FileReverse fileReverse = new FileReverse("Lyrics.txt");
       fileReverse.writeListInFileReverse(listStringsFromFile.getListStringsFromFile());
    }
}
