import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadWrite {
  /*  public static void main(String[] args){
        List<String> linesToWrite = new ArrayList<>();
        linesToWrite.add("Hello!");
        linesToWrite.add("This is a line");
        linesToWrite.add("Now read this");
        tryWriteFile(createFile(),linesToWrite);

        for (String lines:tryReadFile(createFile())) {
            System.out.println(lines);
        }
    }*/

    public static Path createFile(){
        String directory = "src/contactsinfo";
        String fileName = "contacts.txt";

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, fileName);

        try{
            if (Files.notExists(dataDirectory)){
                Files.createDirectories(dataDirectory);
            }

            if (!Files.exists(dataFile)) {
                Files.createFile(dataFile);
            }

            return dataFile;
        } catch (IOException ex){
            System.out.println(ex.getMessage());
            return null;
        }
    }
    public static  void tryWriteFile(Path filePath, List<String> linesToWrite){
        try {
            Files.write(filePath,linesToWrite);
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static List<String> tryReadFile(Path filepath) {
        try {
            return Files.readAllLines(filepath);
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
}
