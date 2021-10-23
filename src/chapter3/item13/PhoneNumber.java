package chapter3.item13;

public class PhoneNumber implements Cloneable{
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
        if(obj == this) return true;
        if(!(obj instanceof PhoneNumber)) return false;
        PhoneNumber phoneNumber = (PhoneNumber) obj;
        return phoneNumber.areaCode == areaCode &&
                phoneNumber.prefix == prefix &&
                phoneNumber.lineNum == lineNum;

    }

    @Override
    public int hashCode() {
        int result = hashCode;
        if(result != 0){
            result = Short.hashCode(areaCode);
            result = 31 * result + Short.hashCode(prefix);
            result = 31 * result + Short.hashCode(lineNum);
            hashCode = result;
        }
        return result;
    }

    @Override
    public String toString() {
        return String.format("%03d-%03d-%03d", areaCode, prefix, lineNum);
    }

    @Override
    public PhoneNumber clone(){
        try{
            return (PhoneNumber) super.clone();
        }catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }

    public static void main(String[] args) {
        PhoneNumber p1 = new PhoneNumber((short)111,(short)111,(short)111);
        PhoneNumber p2 = p1.clone();

        println("" + p1.equals(p2));
    }

    public static void println(String s){
        System.out.println(s);
    }
}
