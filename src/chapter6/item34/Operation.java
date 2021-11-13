package chapter6.item34;

public enum Operation {
    PLUS,
    MINUS,
    TIMES,
    DIVIDE;

    // 새로운 상수를 추가하면 아래 switch 문에 case도 추가해야 됨
    // 깜빡 한다면 에러가 남
    public double apply(double x, double y){
        switch (this){
            case PLUS:
                return x + y;
            case MINUS:
                return x - y;
            case TIMES:
                return x * y;
            case DIVIDE:
                return x / y;
        }
        // 실제로는 도달 할 수 없지만 기술적으로 도달 가능
        throw new AssertionError("알 수 없는 연산 : " + this);
    }
}
