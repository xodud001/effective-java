package chapter4.item23;

// 현재 표현하는 의미를 태그 값으로 알려주는 클래스
// 인스턴스 타입만으로 현재 나타내는 의미를 알 길이 없음
// 태그 달린 클래스는 장황하고, 오류를 내기 쉽고, 비효율적이다
public class Figure {
    enum Shape { RECTANGLE, CIRCLE };

    // 태그 필드 - 현재 모양을 나타냄
    final Shape shape;

    // 사각형일때만 쓰임
    double length;
    double width;

    // 원 일때만 쓰임
    double radius;

    // 원 생성자
    Figure(double radius){
        this.radius = radius;
    }

    // 사각형 생성자
    Figure(double length, double width){
        shape = Shape.RECTANGLE;
        this.length = length;
        this.width = width;
    }
    double area(){
        switch(shape){
            case RECTANGLE:
                return length * width;
            case CIRCLE:
                return Math.PI * (radius * radius);
            default:
                throw new AssertionError(shape);
        }
    }

}
