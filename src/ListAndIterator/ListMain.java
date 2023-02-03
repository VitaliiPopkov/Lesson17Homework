package ListAndIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);
        myList.add(7);
        myList.add(8);
        myList.add(9);
        myList.add(10);

        Iterator<Integer> myIterator = myList.iterator();

        System.out.println("Elements of our list: " );
        while (myIterator.hasNext()) {
            System.out.println(myIterator.next());
        }


    }
}
