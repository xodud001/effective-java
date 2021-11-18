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

    // equals를 재정의 한게 아니라 오버라이딩 해서 예상과 다르게 동작하게 됨
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
