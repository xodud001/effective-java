package chapter9.item57;

import javax.swing.text.Element;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Item57 {

    public static void main(String[] args) {
        List<Element> c = new ArrayList<>();

        for(Iterator<Element> i = c.iterator(); i.hasNext(); ){
            Element next = i.next();
        }
        for(Iterator<Element> i2 = c.iterator(); i2.hasNext(); ){
            Element next = i2.next();
        }

    }
}
