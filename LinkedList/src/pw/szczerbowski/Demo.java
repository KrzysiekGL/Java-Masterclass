package pw.szczerbowski;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit=new LinkedList<String>();


        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Gdansk");
        addInOrder(placesToVisit, "Krakow");
        addInOrder(placesToVisit, "Oliwa");
        addInOrder(placesToVisit, "Warszawa");
        addInOrder(placesToVisit, "PG");

        printList(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList) {
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
}
