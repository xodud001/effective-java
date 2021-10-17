package chapter3.item10;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if( !(obj instanceof Point))
            return false;

        Point p = (Point) obj;
        return x == p.x && p.y == y;
    }

    public static void main(String[] args) {
        // x.equals(y) == true and y.equals(z) == true 이면
        // x.equals(z)도 true여야 하지만 false가 나옴으로써 추이성이 위배된다.
        ColorPoint p1 = new ColorPoint(1, 2, Color.RED);
        Point p2 = new Point(1, 2);
        ColorPoint p3 = new ColorPoint(1, 2, Color.BLUE);

        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p3));

        System.out.println(p1.equals(p3));
    }
}
