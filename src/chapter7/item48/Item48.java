package chapter7.item48;

import java.math.BigInteger;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import static java.math.BigInteger.*;

public class Item48 {

    // 스트림으로 처음 20개의 메르센 소수를 생성
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(pi(2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2));
        System.out.println(System.currentTimeMillis() - start);
    }

    private static long pi(long n) {
        return LongStream.rangeClosed(2, n)
                .parallel()
                .mapToObj(BigInteger::valueOf)
                .filter(i -> i.isProbablePrime(50))

                .count();
    }

}
