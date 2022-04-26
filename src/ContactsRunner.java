import java.nio.file.Paths;
import java.util.ArrayList;

public class ContactsRunner {

    public static void main(String[] args) {
        ReadWrite.createFile();
        ReadWrite.tryReadFile(Paths.get("src/contactsinfo/contacts.json"));
        ContactUI.asciiArt();

    }
}
