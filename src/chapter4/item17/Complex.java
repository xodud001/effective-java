package chapter4.item17;

// 불변 객체는 근본적으로 스레드 안전하여 따로 동기화할 필요 없다.
// 불변 객체는 안심하고 공유할 수 있다.
public class Complex {
    private final double re;
    private final double im;

    // 불변 클래스라면 한번 만든 인스턴스를 최대한 재활용하고
    // 재활용을 쉽게 하려면 자주 쓰이는 값들을 상수로 제공하는 것이다.
    public static final Complex ZERO = new Complex(0, 0);
    public static final Complex ONE = new Complex(1, 0);
    public static final Complex I = new Complex(0, 1);

    // 클래스가 불변임을 보장하려면 자신을 상속하지 못하게 해야함.
    // 모든 생성자를 private or package-private로 만들고
    // public 정적 팩터리를 제공하는 방법이다
    private Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public static Complex valueOf(double re, double im){
        return new Complex(re, im);
    }

    public double realPart() { return re; }
    public double imaginaryPart() { return im; }

    // 연산 결과로 자신을 수정하는 것이 아니라 새로운 인스턴스를 만들어 반환한다
    public Complex plus(Complex c){
        return new Complex(re + c.re, im + c.im);
    }
    public Complex minus(Complex c){
        return new Complex(re - c.re, im - c.im);
    }
    public Complex times(Complex c){
        return new Complex(re * c.re - im * c.im,
                            re * c.re + im * c.im);
    }
    public Complex divideBy(Complex c){
        double tmp = c.re * c.re + c.im * c.im;
        return new Complex((re * c.re + im * c.im) / tmp,
                            (re * c.re - im * c.im) / tmp);
    }

    @Override
    public int hashCode() {
        return 31 * Double.hashCode(re) + Double.hashCode(im);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this)
            return true;
        if( !(obj instanceof Complex))
            return false;
        Complex c = (Complex) obj;

        return Double.compare(c.re, re) == 0
                && Double.compare(c.im, im) == 0;
    }

    @Override
    public String toString() {
        return String.format("(%f+%fi)", re, im);
    }

    public static void main(String[] args) {
        Complex c = new Complex(1, 1);
        System.out.println(c.toString());
    }
}
