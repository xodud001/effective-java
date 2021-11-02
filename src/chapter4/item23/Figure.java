package chapter4.item23;

// 태그 달린 클래스를 계층구조로 변환
abstract class Figure {
    abstract double area();
}

class Circle extends Figure{
    final double radius;
    Circle(double radius){
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * (radius * radius);
    }
}

class Rectangle extends Figure{
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}

// 기존 클래스를 상속받아 유연한게 확장
class Square extends Rectangle{
    Square(double side){
        super(side, side);
    }
}
