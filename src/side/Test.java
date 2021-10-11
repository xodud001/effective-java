package side;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        Long sum = 0L;
        Long pre = sum;


        for (long i = 0L; i < Integer.MAX_VALUE; i++)
            sum += i;


        System.out.println(System.currentTimeMillis() - start);
    }
}
