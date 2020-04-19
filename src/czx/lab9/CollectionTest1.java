package czx.lab9;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class CollectionTest1 {
    public CollectionTest1() {
        ArrayList<String> list = new ArrayList<String>();

        list.add("James");
        list.add("Tom");
        list.add("Steven");
        list.add("Alice");

        for (int count = 0; count < list.size(); count++)
            System.out.println(list.get(count) + " ");

        Iterator iter = list.iterator();

        while (iter.hasNext()) {
            String element = (String) iter.next();
            System.out.println(element + " ");
            if (element.equals("Tom"))
                iter.remove();
        }

        list.sort(new Comparator<String>() {
            public int compare(String lhs, String rhs) {
                int i = lhs.compareTo(rhs);
                if (i > 0) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });

        for (String s : list) {

            {
                System.out.println(s);
            }
        }

    }
}
