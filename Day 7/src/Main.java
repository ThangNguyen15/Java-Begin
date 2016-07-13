import java.util.Scanner;

/**
 * Created by ThangNguyen on 7/13/2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();
        int option;
        do {
            System.out.println("PHONE BOOK PROGRAM");
            System.out.println("1.Add a contact");
            System.out.println("2.Modify a contact");
            System.out.println("3.Delete a contact");
            System.out.println("4.Search contact");
            System.out.println("5.Show all contact");
            System.out.println("6.Quit program");
            System.out.println("Enter your option: ");
            option = input.nextInt();
            switch (option) {
                case 1:
                    PhoneEntry entry = new PhoneEntry();

                    input.nextLine();
                    System.out.println("Enter contact name: ");
                    entry.setName(input.nextLine());
                    System.out.println("Enter contact phone number: ");
                    entry.setPhoneNumber(input.nextLine());
                    phoneBook.addEntry(entry);
                    System.out.println(phoneBook.getNumberOfEntries());
                    break;
                case 2:
                    System.out.println("1. Modify contact name");
                    System.out.println("2. Modify contact phone number");
                    System.out.println("Enter your option: ");
                    int choice = input.nextInt();
                    switch (choice) {
                        case 1:
                            input.nextLine();
                            System.out.println("Enter contact name you want to modify: ");
                            String oldName = input.nextLine();
                            System.out.println("Enter contact new name: ");
                            String newName = input.nextLine();
                            phoneBook.modifyEntryName(oldName, newName);
                            break;
                        case 2:
                            input.nextLine();
                            System.out.println("Enter contact name you want to modify: ");
                            String entryName = input.nextLine();
                            System.out.println("Enter contact new number: ");
                            String newNumber = input.nextLine() ;
                            phoneBook.modifyEntryNumber(entryName, newNumber);
                            break;
                    }
                    break;
                case 3:
                    input.nextLine();
                    System.out.println("Enter contact you want to delete: ");
                    String entryName = input.nextLine();
                    phoneBook.deleteEntry(entryName);
                    break;
                case 4:
                    System.out.println("1. Search contact by name");
                    System.out.println("2. Search contact by phone number");
                    System.out.println("Enter your option: ");
                    int opt = input.nextInt();
                    switch (opt) {
                        case 1:
                            input.nextLine();
                            System.out.println("Enter keyword to search: ");
                            entryName = input.nextLine();
                            System.out.println(phoneBook.findEntryByName(entryName));
                            break;
                        case 2:
                            input.nextLine();
                            System.out.println("Enter number to search: ");
                            String entryNumber = input.nextLine();
                            System.out.println(phoneBook.findEntryByNumber(entryNumber));
                            break;
                    }
                    break;
                case 5:
                    System.out.println("Name\tPhone Number");
                    if (phoneBook.getNumberOfEntries() != 0) {
                        for (int i = 0; i < phoneBook.getNumberOfEntries(); i++) {
                            System.out.println(phoneBook.getPhoneEntries()[i].toString());
                        }
                    }
                    break;
                case 6:
                    break;
            }
        } while (option != 6);
    }
}
