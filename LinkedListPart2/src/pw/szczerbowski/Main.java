package pw.szczerbowski;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit=new LinkedList<String>();


        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Gdansk");
        addInOrder(placesToVisit, "Krakow");
        addInOrder(placesToVisit, "Oliwa");
        addInOrder(placesToVisit, "Warszawa");
        addInOrder(placesToVisit, "PG");

        printList(placesToVisit);

        addInOrder(placesToVisit, "Ohio");
        addInOrder(placesToVisit, "Ohio");
        addInOrder(placesToVisit, "Krakow");

        printList(placesToVisit);

        visit(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList) {
        System.out.println("\n\n");
        Iterator<String> i=linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("===============================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator=linkedList.listIterator();

        while (stringListIterator.hasNext()) {
            int comparison=stringListIterator.next().compareTo(newCity);
            if(comparison==0) {
                //equal, do not add
                System.out.println(newCity + " is already included as a destination");
                return false;
            }
            else if (comparison>0) {
                //new City should appear before this one
                // Brisbane -> Adelaide
                stringListIterator.previous(); //list iterator allows to go back
                stringListIterator.add(newCity);
                return true;
            }
            else if (comparison<0) {
                //move on next City
            }
        }

        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities) {
        Scanner scanner=new Scanner(System.in);
        boolean quit=false;
        boolean goingForward=true;

        ListIterator<String> listIterator=cities.listIterator();

        if(cities.isEmpty()) {
            System.out.println("No cities in the itenerary");
            return;
        }
        else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while(!quit) {
            int action=scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Holiday (Vacation) over");
                    quit=true;
                    break;

                case 1:
                    if(!goingForward) {
                        if(listIterator.hasNext())
                            listIterator.next();
                        goingForward=true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    }
                    else {
                        System.out.println("Reached the end of the list");
                        goingForward=false;
                    }
                    break;

                case 2:
                    if(goingForward){
                        if(listIterator.hasPrevious())
                            listIterator.previous();
                        goingForward=false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    }
                    else {
                        System.out.println("We are at the start of the list");
                        goingForward=true;
                    }
                    break;

                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress");
        System.out.println("0-quit");
        System.out.println("1-next city");
        System.out.println("2-previous city");
        System.out.println("3-print this menu");
    }
}