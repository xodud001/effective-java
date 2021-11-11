package chapter6.item34;

public class Item34 {
    public static final int APPLE_FUJI = 0;
    public static final int APPLE_PIPPIN = 1;
    public static final int APPLE_GRANNY_SMITH = 2;

    public static final int ORANGE_NAVEL = 0;
    public static final int ORANGE_TEMPLE = 0;
    public static final int ORANGE_BLOOD = 0;

    public static void main(String[] args) {
        // APPLE과 ORANGE를 비교해도 아무런 경고가 없음
        int i = (APPLE_FUJI - ORANGE_TEMPLE) / APPLE_PIPPIN;
    }
}
