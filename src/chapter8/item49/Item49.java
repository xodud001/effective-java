package chapter8.item49;

import java.math.BigInteger;

public class Item49 {

    /**
     * (현재 값 mod m) 값을 반환한다. 이 메서드는
     * 음이 아닌 BigInteger를 반환한다는 점에서 remainder 메서드와 다르다.
     *
     * @param m 계수(양수여야 한다.)
     * @return 현재 값 mod m
     * @throws ArithmeticException m이 0보다 작거나 같으면 발생한다.
     */
    public BigInteger mod(BigInteger m){
        if(m.signum() <= 0){
            throw new ArithmeticException("계수(m)은 양수여야 합니다." + m);
        }
        return new BigInteger(String.valueOf(100)).mod(m);
    }
}
