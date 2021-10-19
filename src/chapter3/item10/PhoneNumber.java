package chapter3.item10;

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

    public static void main(String[] args) {
        PhoneNumber p1 = new PhoneNumber( (short)11, (short)11, (short)11);
        PhoneNumber p2 = new PhoneNumber( (short)11, (short)11, (short)11);
        PhoneNumber p3 = new PhoneNumber( (short)11, (short)11, (short)11);
        println("대칭적인가");
        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p1));
        println("");

        println("추이성이 있는가");
        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p3));
        System.out.println(p1.equals(p3));
        println("");
        
        println("일관적인가");
        boolean flag = true;
        for (int i = 0; i < 10; i++)
            flag = flag && p1.equals(p2);

        System.out.println(flag);
    }

    public static void println(String s){
        System.out.println(s);
    }
}
