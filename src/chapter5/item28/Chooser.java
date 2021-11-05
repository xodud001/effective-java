package chapter5.item28;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

// 제네릭을 사용해서 구현한 클래스
// 코드의 양이 조금 늘었고 조금 더 느릴 수 있지만
// 런타입에 ClassCastExceptoin을 만날 일은 없으니 그만한 가치가 있다
public class Chooser<T> {
    // 배열을 리스트로 수정
    private final List<T> choiceList;

    public Chooser(Collection<T> choices){
        // 배열을 리스트로 변환해서 경고를 제거
        choiceList = new ArrayList<>(choices);
    }

    public Object choose(){
        Random rnd = ThreadLocalRandom.current();
        return choiceList.get(rnd.nextInt(choiceList.size()));
    }
}
