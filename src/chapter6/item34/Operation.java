package chapter6.item34;

// 상수별 메소드 구현에 데이터를 활용
public enum Operation {
    PLUS("+"){
        public double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS("-"){
        public double apply(double x, double y) {
            return x - y;
        }
    },
    TIMES("*"){
        public double apply(double x, double y) {
            return x * y;
        }
    },
    DIVIDE("/"){
        public double apply(double x, double y) {
            return x / y;
        }
    };
    private final String symbol;

    Operation(String symbol) {
        this.symbol = symbol;
    }
    
   public abstract double apply(double x, double y);

    @Override
    public String toString() {
        return symbol;
    }

    public static void main(String[] args) {
        double x = 2;
        double y = 4;
        for(Operation op : Operation.values())
            System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
    }
}
