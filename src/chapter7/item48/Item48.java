package chapter7.item48;

import java.math.BigInteger;
import java.util.stream.Stream;

import static java.math.BigInteger.*;

public class Item48 {

    // 스트림으로 처음 20개의 메르센 소수를 생성
    public static void main(String[] args) {
        primes().map(p -> TWO.pow(p.intValueExact()).subtract(ONE))
                .filter(mersenne -> mersenne.isProbablePrime(50))
                .limit(20)
                .forEach(System.out::println);
    }

    static Stream<BigInteger> primes(){
        return Stream.iterate(TWO, BigInteger::nextProbablePrime);
    }
}
