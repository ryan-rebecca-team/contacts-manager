import java.util.ArrayList;
import java.util.HashMap;

public class ShowContacts {

    public static void contactsShown(){
        HashMap<String, Contacts> contact = AddContact.listOfContacts;
        ArrayList<String> contactNames = AddContact.keywords;
        ArrayList<String> contactNumbers = AddContact.numbers;
//        System.out.println(AddContact.listOfContacts.keySet());
//        System.out.println(contactNames);
//        System.out.println(contactNumbers);
        System.out.println("Name | Phone number");
        System.out.println("-------------------");
        for (int i = 0; i < contact.size(); i++) {
            System.out.println(contactNames.get(i)+" | "+contactNumbers.get(i));
        }

    }
}
