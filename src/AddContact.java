import java.nio.file.Paths;
import java.util.*;

public class AddContact {
   static HashMap<String, Contacts> listOfContacts = new HashMap<>();
    static ArrayList<String> keywords = new ArrayList<>();
    static ArrayList<String> numbers = new ArrayList<>();

    public static void addPrompt(Scanner scanner) {
        System.out.println("Enter a First Name");
        scanner.nextLine();
        String newContFirstNAme = scanner.nextLine();
        System.out.println("Enter Last name: ");

        String newContLastName = scanner.nextLine();
        System.out.println("Enter a number");

        String contactNumber = scanner.nextLine();
        addContact(newContFirstNAme,newContLastName,contactNumber);
    }

    //This adds to the hashmap
    public static void addContact(String firstName, String lastName, String number){
        Contacts contacts1 = new Contacts(firstName, lastName, number);
        keywords.add(contacts1.getNames());
        numbers.add(contacts1.getNumber());
        listOfContacts.put(contacts1.getNames(), contacts1);

       ContactUI.contactsMainMenu();
    }


}
