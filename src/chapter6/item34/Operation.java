package chapter6.item34;

// 상수별 메소드 구현을 활용
public enum Operation {
    PLUS{
        public double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS{
        public double apply(double x, double y) {
            return x - y;
        }
    },
    TIMES{
        public double apply(double x, double y) {
            return x * y;
        }
    },
    DIVIDE{
        public double apply(double x, double y) {
            return x / y;
        }
    };

    // 상수별 함수를 정의하기 위한 추상 메서드
    public abstract double apply(double x, double y);
}
