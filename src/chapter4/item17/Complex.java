package chapter4.item17;

public class Complex {
    private final double re;
    private final double im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
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
