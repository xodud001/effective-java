package chapter9.item57;

import javax.swing.text.Element;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Item57 {

    public static void main(String[] args) {
        List<Element> c = new ArrayList<>();

        // 지역변수의 범위가 커져서 i와 i2를 2개 선언 했지만 복사 붙여넣기의 실수로
        // i만 사용되는 실수를 범할 수 있다.
        Iterator<Element> i = c.iterator();
        while (i.hasNext()) {
            Element next = i.next();
        }

        Iterator<Element> i2 = c.iterator();
        while (i.hasNext()) {
            Element next = i.next();
        }

    }
}
