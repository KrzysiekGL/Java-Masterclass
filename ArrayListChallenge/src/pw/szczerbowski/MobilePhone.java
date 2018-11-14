package pw.szczerbowski;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> contacts;

    public MobilePhone(){
        contacts=new ArrayList<Contact>();
    }

    public void storeContact(String name, String phoneNumber) {
        contacts.add(new Contact(name, phoneNumber));
        System.out.println("Contact added");
    }

    public void modifyContact(String changeName, String withName, String andPhoneNumber) {
        int index=getIndexOfContactByName(changeName);
        if(index==-1) System.out.println("There is no contact with that name");
        else {
            System.out.println("Contact " + changeName + " modified to " + withName + " " + andPhoneNumber);
            contacts.set(index, new Contact(withName, andPhoneNumber));
        }
    }

    public void removeContact(String name) {
        int index=getIndexOfContactByName(name);
        if(index==-1) System.out.println("There is no such contact");
        else {
            contacts.remove(index);
        }
    }

    public void queryContact(String name) {
        int index=getIndexOfContactByName(name);
        if(index==-1) System.out.println("There is no such Contact");
        else {
            System.out.println("Contact: " + contacts.get(index).getName() + " " + contacts.get(index).getPhoneNumber());
        }
    }

    public int getIndexOfContactByName(String name) {
        String temp;
        for(int i=0; i<contacts.size(); ++i)
            if(contacts.get(i).getName().equals(name)) return i;
        return -1;
    }
}