import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ListStringsFromFile {
        private String nameFile;

        public ListStringsFromFile(){

        }

        public ListStringsFromFile(String nameFile) {
            this.nameFile = nameFile;
        }

        public List<String> getListStringsFromFile (){
            List<String> listSringsFile = new ArrayList<>();
            try{
                BufferedReader readerFile = new BufferedReader(new FileReader(this.nameFile));
                String lineSongFile;
                while( (lineSongFile = readerFile.readLine()) != null) {
                    listSringsFile.add(lineSongFile);
                }
                readerFile.close();
            }catch (IOException ex) {
                ex.printStackTrace();
            }
            return listSringsFile;
        }
}
