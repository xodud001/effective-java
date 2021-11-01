package chapter4.item22;

// 클래스가 어떤 인터페이스를 구현한다는 것은
// 자신의 인스턴스로 무엇을 할 수 있는지를 클라이언트에 얘기해 주는것.
// 예로, 상수 인터페이스(메소드 없이 상수 필드로만 이루어진 인터피에스)는 잘못된 사용예이다.
public interface PhysicalConstants {
    static final double AVOGADROS_NUMBER = 6.022_140_857e23;
    static final double BOLTZMANN_CONSTANT = 1.380_648_52e-23;
    static final double ELECTRON_MASS = 9.109_383_56e-31;
}
