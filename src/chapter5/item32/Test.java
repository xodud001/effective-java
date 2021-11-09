package chapter5.item32;

import java.util.concurrent.ThreadLocalRandom;

public class Test {
    public static void main(String[] args) {
        // java.lang.Object가 java.lang.String로 변환될 수 없기 때문에 ClassCastExceptoin 발생
        String[] attributes = pickTwo("좋은", "빠른", "저렴한");
    }

    // 제네릭 가변
    public static <T> T[] toArray(T... args){
        return args;
    }

    public static <T> T[] pickTwo(T a, T b, T c){
        switch (ThreadLocalRandom.current().nextInt(3)){
            case 0: return toArray(a, b);
            case 1: return toArray(a, c);
            case 2: return toArray(c, b);
        }
        throw new AssertionError();
    }
}
