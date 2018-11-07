package pw.szczerbowski;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private ArrayList<Contact> contacts;

    static private Scanner scanner=new Scanner(System.in);

    private int getIndexOfContactByNameOnly(String name) {
        for(int i=0; i<contacts.size(); ++i) {
            if(contacts.get(i).getName() == name) return i;
        }
        return -1;
    }

    public MobilePhone(){
        contacts=new ArrayList<Contact>();
    }

    public void storeContact(String name, String phoneNumber) {
        contacts.add(new Contact(name, phoneNumber));
        System.out.println("Contact added");
    }

    public void modifyContact(String name) {
        int index=getIndexOfContactByNameOnly(name);
        if(index==-1) System.out.println("There is no contact with that set of name & phone number");
        else {
            System.out.println("Enter new name and phone for contact: ");
            String newName=scanner.nextLine();
            String newPhone=scanner.nextLine();
            contacts.set(index, new Contact(newName, newPhone));
        }
    }

    public void removeContact(String name, String phoneNumber) {
        int index=getIndexOfContactByNameOnly(name);
        if(index==-1) System.out.println("There is no such contact");
        else {
            contacts.remove(index);
        }
    }

    public void queryContact(String name) {
        int index=getIndexOfContactByNameOnly(name);
        if(index==-1) System.out.println("There is no such Contact");
        else {
            System.out.println("Contact: " + contacts.get(index).getName() + " " + contacts.get(index).getPhoneNumber());
        }
    }
}
