package chapter4.item19;

public class Super {
    public Super() {
        // 잘못된 예 - 생성자가 재정의 가능 메서드를 호출한다.
        overrideMe();
    }

    public void overrideMe(){
        System.out.println("Super overrideMe");
    }
}
