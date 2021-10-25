package chapter4.item15;

public class AccessAuthority {
    // public으로 가변 필드를 갖는 클래스는 일반적으로 스레드 안전하지 않다.
    // 보안 허점이 숨어 있다.
    public static final String[] VALUES = {"ONE", "TWO", "THREE"};
}
