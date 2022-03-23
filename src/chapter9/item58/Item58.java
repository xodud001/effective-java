package chapter9.item58;

import javax.swing.text.Element;
import java.util.ArrayList;
import java.util.List;

public class Item58 {

    public static void main(String[] args) {
        List<Element> c = new ArrayList<>();

        // 전통적인 배열 순회
        for (int i = 0; i < c.size(); i++) {
        }

        // 향상된 for 문으로 깔끔하게 순회
        for (Element element : c) {
        }
    }
}

