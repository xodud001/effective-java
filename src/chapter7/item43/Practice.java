package chapter7.item43;

import java.util.HashMap;
import java.util.Map;

public class Practice {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.merge("KEY", 1, Integer::sum);
    }
}
