package adapteriteratorenumeration;

import java.util.ArrayList;

public class IteratorEnumerationTest {
    public static void main(String[] args) {
        ArrayList<Integer> ai= new ArrayList<>();
        ai.add(7);
        ai.add(5);
        ai.add(3);
        ai.add(2);

        IteratorEnumeration ie = new IteratorEnumeration(ai.iterator());

        while (ie.hasMoreElements()) {
            System.out.println(ie.nextElement().toString());
        }
    }
}
