import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("KTY", "김태영");
        Set<String> keySet1 = map.keySet();
        map.put("KDY", "김동영");
        Set<String> keySet2 = map.keySet();

        keySet1.forEach(System.out::println);
        keySet2.forEach(System.out::println);

        System.out.println(keySet1.equals(keySet2));

    }
}
