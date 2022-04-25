import java.nio.file.Paths;
import java.util.ArrayList;

public class ContactsRunner {

    public static void main(String[] args) {
        ReadWrite.createFile();
//        AddContact.hashMap("billy", "bob", "321-456-7890");
//        AddContact.hashMap("john", "snow", "555-555-5555");

        ReadWrite.tryReadFile(Paths.get("src/contactsinfo/contacts.json"));
        ContactUI.contactsMainMenu();

    }
}
