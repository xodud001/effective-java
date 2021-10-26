package chapter4.item16;

public class Point {
    // 클래스의 필드를 public으로 설정하면 많은 문제가 따른다
    // API를 수정하지 않고는 내부 표현을 변경할 수 없고
    // 불변식을 보장할 수 없으며
    // 외부에서 필드에 접근할 때 부수 작업을 수행할 수도 없다.
    public double x;
    public double y;
}
