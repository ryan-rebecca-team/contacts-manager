import java.util.Scanner;

public class ContactUI {
    static Scanner scanner = new Scanner(System.in);
    public static void contactsMainMenu(){
        System.out.println("\n1. View contacts.\n" +
                "2. Add a new contact.\n" +
                "3. Search a contact by name.\n" +
                "4. Delete an existing contact.\n" +
                "5. Exit.\n" +
                "Enter an option (1, 2, 3, 4 or 5):");

        int userInput = scanner.nextInt();
        checkUserInput(userInput);
    }
    public static void checkUserInput(int userInput){
        if (userInput == 1){
            //todo make method that shows al contacts
            ShowContacts.contactsShown();

        } else if (userInput == 2) {
            //todo make method that creates contacts and push it to a hashmap
          AddContact.addPrompt(scanner);

        } else if (userInput == 3) {
            //todo search contact information by using the hashmap and the key would be the contact full name

            System.out.println("This is three");
        } else if (userInput == 4) {
            //todo delete contact information by using remove in hashmap by giving the key which is the contact full name
            System.out.println("This is four");

        }else if (userInput == 5) {
            //todo exit-out of app
            System.out.println("This is five");
        }else {
            scanner.nextLine();
            System.out.println("Not a valid input ");
            contactsMainMenu();
        }
    }
}
