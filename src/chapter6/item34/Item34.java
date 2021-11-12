package chapter6.item34;

public class Item34 {
    public enum Apple{ FUJI, PIPPIN, GRANNY_SMITH}
    public enum Orange{ NAVEL, TEMPLE, BLOOD}

    public static void main(String[] args) {
        // Apple에 Orange를 넣을 수 없음음
       Apple apple = Orange.NAVEL;
    }
}
