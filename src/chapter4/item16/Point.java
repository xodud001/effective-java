package chapter4.item16;

public class Point {
    // 필드를 private로 바꾸고 접근자와 설정자를 만든다.
    // 클래스를 사용하는 클라이언트는 접근자에 의존하기 때문에
    // 내부 구현은 수정해도 문제가 없다
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
}
