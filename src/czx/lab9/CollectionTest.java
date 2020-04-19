package czx.lab9;

import java.util.ArrayList;

import java.util.Comparator;
import java.util.Iterator;

public class CollectionTest {
    public CollectionTest() {
        ArrayList<String> list = new ArrayList<String>();

        list.add("James");
        list.add("Tom");
        list.add("Steven");
        list.add("Alice");

        for(int count=0;count<list.size();count++)
            System.out.println(list.get(count)+" ");

        Iterator iter=list.iterator();

        while(iter.hasNext())
        {
            String element = (String) iter.next();
            System.out.println(element +" ");
            if(element.equals("Tom"))
                iter.remove();
        }

        //sort 不会

        for(String s:list){
            System.out.println(s);
        }
    }

}
