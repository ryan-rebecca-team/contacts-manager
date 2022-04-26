import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class RemoveContact {
    static HashMap<String, Contacts> listOfContacts = new HashMap<>();
    static ArrayList<String> contactNames = AddContact.keywords;
    public static void removeContact(String removeName){

        for (int i = 0; i < contactNames.size(); i++) {
            if (removeName.equals(contactNames.get(i))){
                AddContact.listOfContacts.remove(contactNames.get(i));
                AddContact.keywords.remove(i);
                AddContact.numbers.remove(i);
                System.out.println("ok bye "+removeName);
            }
        }

    }
}
