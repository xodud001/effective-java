package chapter5.item26;

import java.util.ArrayList;
import java.util.Collection;

public class Test {
    // 컬렉션의 Raw type. 절대 사용해서는 안된다.
    // 자바 5 이전에 지원하던 코드들의 호환성을 위해 아직 남겨져 있다
    private final Collection stampls = new ArrayList();
}
