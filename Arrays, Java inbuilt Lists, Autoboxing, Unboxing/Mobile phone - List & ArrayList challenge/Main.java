
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0723 505 090");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while (!quit) {
            System.out.println("Enter actions : ");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nShutting down");
                    quit = true;
                    break;
                case 1:
                    System.out.println("Contacts\n" + "----------------");
                    mobilePhone.printContacts();
                    break;
                case 2:
                    System.out.println("Add new contact");
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }


        }
    }

    private static void startPhone() {
        System.out.println("Starting phone");
    }

    private static void printActions() {
        System.out.println("Available actions : press keys");
        System.out.println("0 - to shutdown\n" +
                "1 - to print contacts\n" +
                "2 - to add new contact\n" +
                "3 - to update a contact\n" +
                "4 - to remove contact\n" +
                "5 - query if an contact exists\n" +
                "6 - print list with available actions.");
        System.out.println("Choose a number");

    }

    private static void addNewContact() {
        System.out.println("Enter contact name :");
        String name = scanner.nextLine();
        System.out.println("Enter phone number :");
        String number = scanner.nextLine();
        Contact newContact = Contact.createContact(name, number);
        if (mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added");
        } else {
            System.out.println("Cannot add, is already on file");
        }
    }

    private static void updateContact(){
        System.out.println("Enter contact name to update :");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if(existingContact == null){
            System.out.println("Contact not found.");
            return;
        }

        System.out.println("Enter new name :");
        String newName = scanner.nextLine();
        System.out.println("Enter new number :");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if(mobilePhone.updateContact(existingContact, newContact)){
            System.out.println("Updated successfully");
        }else{
            System.out.println("Contact not found");
        }
    }

    public static void removeContact(){
        System.out.println("Enter contact name to remove :");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if(existingContact == null){
            System.out.println("Contact not found.");
            return;
        }
        if(mobilePhone.removeContact(existingContact)){
            System.out.println("Removed successfully");
        }else{
            System.out.println("Contact not found");
        }
    }

    public static void queryContact(){
        System.out.println("Enter contact name to query :");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if(existingContact == null){
            System.out.println("Contact not found.");
            return;
        }
    }
}
