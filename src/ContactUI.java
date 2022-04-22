import java.util.Scanner;

public class ContactUI {
    static Scanner scanner = new Scanner(System.in);
    public static void contactsMainMenu(){
        System.out.println("1. View contacts.\n" +
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
            System.out.println("This is one");
        } else if (userInput == 2) {
            System.out.println("Enter a Name");
            String newContact = scanner.nextLine();
            System.out.println("Enter a number");
            String contactNumber = scanner.nextLine();
            Contacts contact = new Contacts(newContact, contactNumber);
            System.out.println("This is the name " + contact.getNames());
            System.out.println("This is the number " + contact.getNumber());
        } else if (userInput == 3) {
            System.out.println("This is three");
        } else if (userInput == 4) {
            System.out.println("This is four");
        }else if (userInput == 5) {
            System.out.println("This is five");
        }else {
            scanner.nextLine();
            System.out.println("Not a valid input \n");
            contactsMainMenu();
        }
    }
}
