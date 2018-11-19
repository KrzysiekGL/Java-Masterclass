package pw.szczerbowski;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit=new LinkedList<String>();

        placesToVisit.add("Sydney");
        placesToVisit.add("Gdansk");
        placesToVisit.add("Krakow");
        placesToVisit.add("Oliwa");
        placesToVisit.add("Warszawa");
        placesToVisit.add("PG");

        printList(placesToVisit);

        placesToVisit.add(1, "Alice Springs");
        printList(placesToVisit);

        placesToVisit.remove(4);
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
        }
    }
}
