import java.util.HashMap;

public class ShowContacts {

    public static void contactsShown(){
        HashMap<String, Contacts> contact = AddContact.listOfContacts;
        System.out.println(AddContact.listOfContacts.keySet());

    }
}
