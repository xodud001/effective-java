package chapter5.item30;

import java.util.HashSet;
import java.util.Set;

public class Test {
    // 타입 매개변수를 명시해서 제네릭 메소드로 수정
    public static <E> Set<E> union(Set<E> s1, Set<E> s2){
        Set<E> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }

    public static void main(String[] args) {
        Set<String> one = Set.of("문", "자", "열");
        Set<String> two = Set.of("입", "니", "다");
        Set<String> result = union(one, two);
        System.out.println(result);
    }
}
