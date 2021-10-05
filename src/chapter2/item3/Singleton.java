package chapter2.item3;

public class Singleton {
    // private 생성자는 Singleton.INSTANCE를 초기화할 때 딱 한 번만 호출
    // 다른 생성자는 없기 때문에 전체 시스템에서 하나뿐임을 보장
    public static final Singleton INSTANCE = new Singleton();

    private Singleton(){}
}
