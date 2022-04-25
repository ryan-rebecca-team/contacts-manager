import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ContactUI {
    static Scanner scanner = new Scanner(System.in);
    public static void contactsMainMenu() {
        System.out.println("\n1. View contacts.\n" +
                "2. Add a new contact.\n" +
                "3. Search a contact by name.\n" +
                "4. Delete an existing contact.\n" +
                "5. Save and Exit.\n" +
                "Enter an option (1, 2, 3, 4 or 5):");
        try {
        int userInput = scanner.nextInt();
            checkUserInput(userInput);
        }
        catch (InputMismatchException ex) {
            //System.out.println(ex.getMessage());
            System.out.println("This is not a valid input, use numbers 1-5");
            scanner.nextLine();
            contactsMainMenu();
        }
    }
    public static void checkUserInput(int userInput) {

            if (userInput == 1) {
                //todo make method that shows all contacts- done
                ShowContacts.contactsShown();

            } else if (userInput == 2) {
                //todo make method that creates contacts and push it to a hashmap - done
                AddContact.addPrompt(scanner);

            } else if (userInput == 3) {
                //todo search contact information by using the hashmap and the key would be the contact full name - done
                SearchContact.searchContact(scanner);
            } else if (userInput == 4) {
                //todo delete contact information by using remove in hashmap by giving the key which is the contact full name -
                RemoveContact.removeContact(scanner);

            } else if (userInput == 5) {
                //todo exit-out of app
                System.out.println("bye");
                ReadWrite.tryWriteFile(Paths.get("src/contactsinfo/contacts.json"), new ArrayList<>(AddContact.listOfContacts.values()));
                ReadWrite.tryReadFile(Paths.get("src/contactsinfo/contacts.json"));
            } else {
                scanner.nextLine();
                System.out.println("Not a valid input ");
                contactsMainMenu();
            }
    }
}
