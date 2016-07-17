import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by ThangNguyen on 7/17/2016.
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
                    ArrayList<String> phoneNumber = new ArrayList<>();
                    input.nextLine();
                    System.out.println("Enter contact name: ");
                    String name = input.nextLine();
                    System.out.println("Enter contact phone number: ");
                    phoneNumber.add(input.nextLine());
                    System.out.println("Do you want to add another phone number to this contact? ");
                    String opt = input.nextLine();
                    if (opt.equals("y") || opt.equals("Y")) {
                        System.out.println("Enter contact phone number: ");
                        phoneNumber.add(input.nextLine());
                    }
                    PhoneEntry entry = new PhoneEntry(name, phoneNumber);
                    phoneBook.addEntry(entry);
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
                            ArrayList<String> newNumber = new ArrayList<>();
                            input.nextLine();
                            System.out.println("Enter contact name you want to modify: ");
                            String entryName = input.nextLine();
                            System.out.println("Enter contact new number: ");
                            newNumber.add(input.nextLine());
                            System.out.println("Do you want to add another phone number to this contact? ");
                            String opt1 = input.nextLine();
                            if (opt1.equals("y") || opt1.equals("Y")) {
                                System.out.println("Enter contact phone number: ");
                                newNumber.add(input.nextLine());
                            }
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
                    int opt2 = input.nextInt();
                    switch (opt2) {
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
                    System.out.println(phoneBook.toString());
                    break;
                case 6:
                    break;
            }
        } while (option != 6);
    }
}