package chapter5.item28;

import java.util.Collection;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
// 제네릭을 쓰지 않고 구현한 클래스
// choose 메소드를 호출 할 때마다 반환된 Object를 원하는 타입으로 형변환 해야한다.
// 혹시 타입이 다른 원소가 들어 있다면 런타임에 형변환 오류가 날 것이다.
public class Chooser {
    private final Object[] choiceArray;

    public Chooser(Collection choices){
        choiceArray = choices.toArray();
    }

    public Object choose(){
        Random rnd = ThreadLocalRandom.current();
        return choiceArray[rnd.nextInt(choiceArray.length)];
    }
}
