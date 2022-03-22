package chapter9.item57;

import javax.swing.text.Element;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Item57 {

    public static void main(String[] args) {
        List<Element> c = new ArrayList<>();
        // 컬렉션이나 배열을 순회하는 권장 관용구
        for (Element e : c) {
        }

        // 반복자가 필요할 때의 관용구
        for(Iterator<Element> i = c.iterator(); i.hasNext(); ){
        }

    }
}
