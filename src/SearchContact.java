import java.util.ArrayList;
import java.util.Scanner;

public class SearchContact {
    static ArrayList<String> contactNames = AddContact.keywords;
    static ArrayList<String> contactNumbers = AddContact.numbers;
    public static void searchContact(Scanner scanner) {
        scanner.nextLine();
        System.out.println("Enter a Full Name");
        String checkName = scanner.nextLine();
        for (int i = 0; i < contactNames.size(); i++) {
            /*if (checkName.equals(contactNames.get(i))) {
                System.out.println(contactNames.get(i)+" | "+contactNumbers.get(i));
                break;
            } else if (!checkName.equals(contactNames.get(i))) {
                System.out.println("This name does not exist");
            }*/
            if (contactNames.contains(checkName)){
                System.out.println(contactNames.get(i)+" | "+contactNumbers.get(i));
                break;
            } else {
                System.out.println("This name does not exist");
            }

        }
        ContactUI.contactsMainMenu();
    }
    /*public static String contactInfo (String keyWord) {
        AddContact.listOfContacts.get(keyWord);
        return "";
    }*/
}
