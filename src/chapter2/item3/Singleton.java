package chapter2.item3;

public class Singleton {
    // Singleton.getInstance는 항상 같은 객체의 참조를 반환. 제 2의 Singleton 인스턴스란 만들어지지 않음
    private static final Singleton INSTANCE = new Singleton();
    private Singleton(){}
    public static Singleton getInstance() {
        return INSTANCE;
    }
}
