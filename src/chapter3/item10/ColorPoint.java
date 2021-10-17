package chapter3.item10;

public class ColorPoint extends Point{
    private final Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        //  ColorPoint와 Point간의 equals가 대칭성을 위배하기 때문에
        // ColorPoint가 아니면 단순 위치만 계산하도록 해서 대칭성을 지켰다
        // 하지만 이 방식은 추이성을 깨버린다.
        if( !(obj instanceof ColorPoint))
            return obj.equals(this);

        return super.equals(obj) && color == ((ColorPoint) obj).color;
    }
}
