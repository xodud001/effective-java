package chapter2.item1;

public class Item1 {
    public static void main(String[] args) {
        boolean b = true;
        Boolean b1 = Boolean.valueOf(b);
        Boolean b2 = Boolean.valueOf(b);
        System.out.println(b1.equals(b2));
        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());
    }


}

//호출될 때마다 인스턴스를 새로 생성하지 않아도 된다.
class Boolean{
    boolean b;

    public static final Boolean TRUE = new Boolean(true);
    public static final Boolean FALSE = new Boolean(false);

    public Boolean(boolean b){
        this.b = b;
    }
    public static Boolean valueOf(boolean b){
        return b ? Boolean.TRUE : Boolean.FALSE;
    }
}
