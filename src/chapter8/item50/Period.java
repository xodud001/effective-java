package chapter8.item50;

import java.util.Date;

public class Period {

    private final Date start;
    private final Date end;

    // 방어적 복사를 이용해서 원본을 노출 시키지 않아 변경을 막기
    public Period(Date start, Date end) {
        this.start = new Date(start.getTime());
        this.end = new Date(end.getTime());
    }

    public Date getStart() {
        return new Date(start.getTime());
    }

    public Date getEnd() {
        return new Date(end.getTime());
    }
}
