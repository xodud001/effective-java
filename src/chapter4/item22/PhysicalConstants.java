package chapter4.item22;

// 상수를 공개하는 몇 가지 방법
// 특정 클래스나 인터페이스와 강하게 연관된 상수라면 자체에 추가해야 한다.
// 열거 타입으로 나타낸다
// 인스턴스화할 수 없는 유틸리티 클래스에 담아 공개
public class PhysicalConstants {
    private PhysicalConstants(){} // 인스턴스화 방지
    public static final double AVOGADROS_NUMBER = 6.022_140_857e23;
    public static final double BOLTZMANN_CONSTANT = 1.380_648_52e-23;
    public static final double ELECTRON_MASS = 9.109_383_56e-31;
}
