package chapter4.item19;

public final class Sub extends Super{
    // 초기화 되지 않은 final 필드. 생성자에서 초기화한다.
    private final String str;

    Sub(){
        str = "TEST";
    }

    @Override
    public void overrideMe() {
        System.out.println(str);
    }

    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.overrideMe();
    }
}
