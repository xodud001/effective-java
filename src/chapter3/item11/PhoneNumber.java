package chapter3.item11;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PhoneNumber {
    private int hashCode; // 0으로 자동 초기화
    private final short areaCode, prefix, lineNum;

    public PhoneNumber(short areaCode, short prefix, short lineNum) {
        this.areaCode = rangeCheck(areaCode, 999, "지역코드") ;
        this.prefix = rangeCheck(prefix, 999, "프리픽스");
        this.lineNum = rangeCheck(lineNum, 999, "가입자 번호");;
    }
    private short rangeCheck(int val, int max, String arg) {
        if(val < 0 || val > max)
            throw new IllegalArgumentException(arg + ": " + val);
        return (short) val;
    }

    @Override
    public boolean equals(Object obj) {
        // == 연산자를 사용해 입력이 자기 자신이 참조인지 확인
        // 단순한 성능 최적화용
        if(obj == this) return true;
        // instanceof 연산자로 입력이 올바른 타입인지 확인
        if(!(obj instanceof PhoneNumber)) return false;
        // 입력을 올바른 타입으로 형변환
        PhoneNumber phoneNumber = (PhoneNumber) obj;
        return phoneNumber.areaCode == areaCode &&
                phoneNumber.prefix == prefix &&
                phoneNumber.lineNum == lineNum;

    }

    @Override
    public int hashCode() {
        // 클래스가 불변이고 해시코드를 계산하는 비용이 크다면 캐싱 방식을 고려
        // hashCode가 처음 불릴 때 계산하는 지연 초기화 전략 사용
        // 이때 지연 초기화를 하려면 클래스를 스레드 안전하게 만들도록 신경 써야 한다.
        int result = hashCode;
        if(result != 0){
            result = Short.hashCode(areaCode);
            result = 31 * result + Short.hashCode(prefix);
            result = 31 * result + Short.hashCode(lineNum);
            hashCode = result;
        }
        return result;
    }

    public static void main(String[] args) {
        Map<PhoneNumber, String> map = new HashMap<>();
        map.put(new PhoneNumber((short)111, (short)111, (short)111), "Hello");
        PhoneNumber finder = new PhoneNumber((short)111, (short)111, (short)111);
        System.out.println(map.get(finder));
    }

    public static void println(String s){
        System.out.println(s);
    }
}
