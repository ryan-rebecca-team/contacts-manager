import java.util.ArrayList;
import java.util.Scanner;

public class SearchContact {
    static ArrayList<String> contactNames = AddContact.keywords;
    static ArrayList<String> contactNumbers = AddContact.numbers;
    public static void searchContact(Scanner scanner) {
        scanner.nextLine();
        System.out.println("Enter a Full Name");
        String checkName = scanner.nextLine();

            if (contactNames.contains(checkName)){
                Contacts contacts1 = AddContact.listOfContacts.get(checkName);
                System.out.println(contacts1.getNames()+" | "+contacts1.getNumber());
            } else {
                System.out.println("This name does not exist");
            }

        ContactUI.contactsMainMenu();
    }
    /*public static String contactInfo (String keyWord) {
        AddContact.listOfContacts.get(keyWord);
        return "";
    }*/
}
