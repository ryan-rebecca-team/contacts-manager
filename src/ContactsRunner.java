public class ContactsRunner {

    public static void main(String[] args) {
        ReadWrite.createFile();
        AddContact.hashMap("billy", "bob", "321-456-7890");
       // ContactUI.contactsMainMenu();

    }
}
