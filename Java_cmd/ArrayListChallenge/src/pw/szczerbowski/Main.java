package pw.szczerbowski;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    private static Scanner scanner=new Scanner(System.in);
    private static int optionChosen;
    private static boolean isExit=false;

    private static MobilePhone mobilePhone=new MobilePhone();

    public static void main(String[] args) {
        showInstructions();

        while (!isExit) {
            System.out.print("Choose option: ");
            optionChosen=scanner.nextInt();
            scanner.nextLine();

            switch (optionChosen) {
                case 0:
                    addContact();
                    break;
                case 1:
                    modifyContact();
                    break;
                case 2:
                    removeContact();
                    break;
                case 3:
                    queryContact();
                    break;
                case 9:
                    System.out.println("Shutting down...");
                    isExit=true;
                    break;
                case 7:
                    showInstructions();
                    break;
                default:
                    System.out.println("Option not recognized...");
                    break;
            }
        }
    }

    private static void showInstructions() {
        System.out.println("Use THE Phone - manual:");
        System.out.println("0 - Store contact (name, phone number)");
        System.out.println("1 - Modify contact (old name, new name, new phone number)");
        System.out.println("2 - Remove contact (name)");
        System.out.println("3 - Query contact (name)");
        System.out.println("7 - Show this manual");
        System.out.println("9 - Exit THE Phone program...");
    }

    private static void addContact() {
        System.out.println("Enter Name and Phone number for new contact: ");
        String name=scanner.nextLine();
        String phone=scanner.nextLine();
        mobilePhone.storeContact(name, phone);
    }

    private static void modifyContact() {
        System.out.print("Enter Name of contact you want to modify: ");
        String oldName=scanner.nextLine();
        System.out.println("Enter Name and Phone number for this contact: ");
        String newName=scanner.nextLine();
        String newPhone=scanner.nextLine();
        mobilePhone.modifyContact(oldName, newName, newPhone);
    }

    private static void removeContact() {
        System.out.print("Enter Name of contact you want do delete: ");
        String name=scanner.nextLine();
        mobilePhone.removeContact(name);
    }

    private static void queryContact(){
        System.out.print("Enter Name of contact you want to look for: ");
        String name=scanner.nextLine();
        mobilePhone.queryContact(name);
    }
}