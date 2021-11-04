package chapter5.item26;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test {
    // 컬렉션의 Raw type. 절대 사용해서는 안된다.
    // 자바 5 이전에 지원하던 코드들의 호환성을 위해 아직 남겨져 있다
    private final Collection stampls = new ArrayList();

    public static void main(String[] args) {
        Test test = new Test();

        // Stamp 대신 Coin을 넣어도 오류없이 컴파일 되고 실행 된다
        // 추후에 런타임 시에 발견된다.
        test.stampls.add(new Coin());

        for(Iterator i = test.stampls.iterator() ; i.hasNext() ;){
            Stamp stamp = (Stamp) i.next(); // Coin 클래스에 의해 ClassCastException을 던진다.
            stamp.cancel();
        }
    }
}
class Stamp{
    public void cancel(){

    }
}
class Coin{

}
