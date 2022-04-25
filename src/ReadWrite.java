import com.google.gson.Gson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class ReadWrite {

    static HashMap<String, Contacts> contactsHashMap = AddContact.listOfContacts;
   static ArrayList<String> contactNames = AddContact.keywords;
   static ArrayList<String> contactNumbers = AddContact.numbers;

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

            Contacts[] contacts = new Gson().fromJson(String.valueOf(contactsList), Contacts[].class);

            for (int i = 0; i < contacts.length; i++) {
                AddContact.keywords.add(contacts[i].getNames());
                AddContact.listOfContacts.put(contacts[i].getNames(),contacts[i]);
                AddContact.numbers.add(contacts[i].getNumber());
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }
}
