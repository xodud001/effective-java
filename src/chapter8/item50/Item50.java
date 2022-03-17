package chapter8.item50;

import java.util.Date;

public class Item50 {

    public static void main(String[] args) {
        // Period 내부에서 Getter만 허용했음에도 필드로 정의된 Date가
        // 가변이기 때문에 Period의 불변이 깨진다.
        Period period = new Period(new Date(), new Date());
        Date start = period.getStart();
        start.setYear(2022);
    }
}
