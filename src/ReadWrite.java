import com.google.gson.Gson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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

    public static Path createFile() {
        String directory = "src/contactsinfo";
        String fileName = "contacts.json";

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, fileName);

        try {
            if (Files.notExists(dataDirectory)) {
                Files.createDirectories(dataDirectory);
            }

            if (!Files.exists(dataFile)) {
                Files.createFile(dataFile);
            }

            return dataFile;
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    public static void tryWriteFile(Path filePath, List<Contacts> contactsToWrite) {
        try {
            String linesToWrite = new Gson().toJson(contactsToWrite);
            Files.write(filePath, Collections.singleton(linesToWrite));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static List<Contacts> tryReadFile(Path filepath) {
        try {
            String contactsList = Files.readAllLines(filepath).get(0);
            System.out.println(contactsList);
            Contacts[] contacts = new Gson().fromJson(String.valueOf(contactsList), Contacts[].class);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }
}
