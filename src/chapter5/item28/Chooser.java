package chapter5.item28;

import java.util.Collection;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

// 제네릭을 사용해서 구현한 클래스
public class Chooser<T> {
    private final T[] choiceArray;

    public Chooser(Collection<T> choices){
        // T가 무슨 타입인지 알 수 없으니 컴파일러가 형변환이 런타임에 안전하는 것이 보장되지 않는다는 경고
        // 동작하지만 안전을 보장하지 못할 뿐
        choiceArray = (T[]) choices.toArray();
    }

    public Object choose(){
        Random rnd = ThreadLocalRandom.current();
        return choiceArray[rnd.nextInt(choiceArray.length)];
    }
}
