import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class FileReverse {
    private String nameFile;

    public FileReverse(String nameFile) {
        this.nameFile = nameFile;
    }

    public void writeListInFileReverse(List<String> listStringFile){
        ListIterator<String> itr = listStringFile.listIterator(listStringFile.size());
                try {
           BufferedWriter writeReverseWrite = new BufferedWriter(new FileWriter(this.nameFile));
                    while(itr.hasPrevious()) {
                        writeReverseWrite.write(itr.previous()+"\n");
                    }
            writeReverseWrite.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }

    }
}
