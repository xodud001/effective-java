package chapter6.item35;

// 동작은 하지만 유지보수가 좋지 못한 코드. 상수 순서에 메소드가 의존적임
// 8중주(OCTET) 상수가 이미 있어, 똑같이 8명이 연주하는 복4중주(double quartet)는 추가 할 수 없다.
// 12명이 연주하는 3중 4중주를 추가하려면 11명으로 구성된 연주를 일컫는 말이 없어 더미 상수를 추가해야 한다.
public enum Ensemble {
    SOLO,
    DUET,
    TRIO,
    QUARTET,
    QUINTET,
    SEXTET,
    SEPTET,
    OCTET,
    NONET,
    DECTET;

    public int numberOfMusicians(){
        return  ordinal() + 1;
    }
}

