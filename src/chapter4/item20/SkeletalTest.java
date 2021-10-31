package chapter4.item20;

import java.util.AbstractList;
import java.util.List;
import java.util.Objects;

public class SkeletalTest {
    public static void main(String[] args) {
        List<Integer> integers = intArrayAsList(new int[] {1, 2, 3,});
        System.out.println(integers);
    }

    static List<Integer> intArrayAsList(int[] a){
        Objects.requireNonNull(a);

        return new AbstractList<Integer>() {
            @Override
            public Integer get(int index) {
                return a[index];
            }

            @Override
            public Integer set(int index, Integer element) {
                int oldElement = a[index];
                a[index] = element;
                return oldElement;
            }

            @Override
            public int size() {
                return a.length;
            }
        };
    }
}
