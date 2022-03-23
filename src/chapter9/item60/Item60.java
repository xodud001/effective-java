package chapter9.item60;

public class Item60 {

    public static void main(String[] args) {
        // 실수 계산은 정확한 답을 구하는 곳에서는 피해야 한다.
        System.out.println(1.03 - 0.42);
        // 0.6100000000000001
        System.out.println(1.00 - 9 * 0.10);
        // 0.09999999999999998
    }
}
