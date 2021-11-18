package chapter6.item40;

import java.io.ObjectStreamException;
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

    // 컴파일 에러가 난 부분을 수정해 정상적으로 재정의함
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Bigram))
            return false;
        Bigram b = (Bigram) obj;
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
