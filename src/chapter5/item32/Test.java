package chapter5.item32;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Test {
    public static void main(String[] args) {
        // java.lang.Object[]가 java.lang.String[]로 변환될 수 없기 때문에 ClassCastExceptoin 발생
        List<String> attributes = pickTwo("좋은", "빠른", "저렴한");
    }


    public static <T> List<T> pickTwo(T a, T b, T c){
        switch (ThreadLocalRandom.current().nextInt(3)){
            case 0: return List.of(a, b);
            case 1: return List.of(a, c);
            case 2: return List.of(c, b);
        }
        throw new AssertionError();
    }
}
