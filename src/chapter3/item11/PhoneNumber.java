package chapter3.item11;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PhoneNumber {
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
        //한줄로 간단하게 할 수 있지만 성능이 살짝 아쉽다.
        // 입력 입수를 받기 위해 배열이 만들어지고
        // 입력 중 기본 타입이 있다면 박싱과 언박싱이 이루어짐
        // 성능이 민감하지 않은 경우에만 사용
        return Objects.hash(areaCode, prefix, lineNum);
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
