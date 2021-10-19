package chapter3.item10;

import java.util.Set;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Point))
            return false;

        Point p = (Point) obj;
        return x == p.x && p.y == y;
    }

    public static void main(String[] args) {
        test1();
    }

    public static void test1(){
        // x.equals(y) == true and y.equals(z) == true 이면
        // x.equals(z)도 true여야 하지만 false가 나옴으로써 추이성이 위배된다.
        ColorPoint p1 = new ColorPoint(1, 2, Color.RED);
        Point p2 = new Point(1, 2);
        ColorPoint p3 = new ColorPoint(1, 2, Color.BLUE);

        System.out.println(p1.asPoint().equals(p2));
        System.out.println(p2.equals(p3.asPoint()));

        System.out.println(p1.equals(p3));
    }

    public static void test2(){
        // CounterPoint는 Point를 상속 받았기 때문에
        // 어디서든지 Point로 동작해야 하지만 Point의 equals()를
        // 리스코프 치환 원칙을 위배해서 정의했기 때문에 제대로 된 동작을 하지 않는다.
        CounterPoint cp = new CounterPoint(1, 0);
        System.out.println(unitCircle.contains(cp));
    }
    private static final Set<Point> unitCircle = Set.of(
            new Point(1, 0), new Point(0, 1),
            new Point(-1, 0), new Point(0, -1)
    );
    public static boolean onUnitCircle(Point p) {
        return unitCircle.contains(p);
    }
}
