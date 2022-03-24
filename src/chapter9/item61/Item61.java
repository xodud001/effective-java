package chapter9.item61;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Item61 {

    public static void main(String[] args) {
        Comparator<Integer> naturalOrder =
                (i, j) -> (i < j) ? -1 : (i == j ? 0 : 1);

        List<Integer> integers = new ArrayList<>();

        for(int i = 0 ; i < 100; i++){
            integers.add(Math.abs(ThreadLocalRandom.current().nextInt()%100));
        }

        // 정렬에서는 잘 된다
        integers.sort(naturalOrder);
        System.out.println(integers);

        // 실제로 출력해보면 0이 아니라 1이 출력된다
        int compare = naturalOrder.compare(new Integer(42), new Integer(42));
        System.out.println(compare);
    }
}
