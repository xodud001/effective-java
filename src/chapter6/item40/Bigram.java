package chapter6.item40;

import java.util.HashSet;
import java.util.Set;

public class Bigram {
    private final char first;
    private final char second;

    public Bigram(char first, char second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public int hashCode() {
        return 31 * first + second;
    }

    //해당 메소드를 Override 하겠다 명시적으로 선언하면 잘못되 부분에 대해 컴파일 에러가 발생
    @Override
    public boolean equals(Bigram b) {
        return b.first == first && b.second == second;
    }

    public static void main(String[] args) {
        Set<Bigram> s = new HashSet<>();
        for (int i = 0; i < 10; i++)
            for(char ch = 'a' ; ch <= 'z' ; ch++)
                s.add(new Bigram(ch, ch));
        //26이 출력된다 예상하지만 260이 출력됨
        System.out.println(s.size());
    }

}
