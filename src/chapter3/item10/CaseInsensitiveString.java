package chapter3.item10;

import java.util.ArrayList;
import java.util.List;

public final class CaseInsensitiveString {
    private final String s;


    public CaseInsensitiveString(String s){
        this.s = s;
    }

    @Override
    public boolean equals(Object obj) {
        //CaseInsentiveString의 equals를 Stirng과 연동하겠다는 생각은 버려야 한다.
        return obj instanceof CaseInsensitiveString &&
                ((CaseInsensitiveString)obj).s.equalsIgnoreCase(s);
    }

    public static void main(String[] args) {
        CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
        String s = "polish";

        // x.equals(y) = true 일 경우 y.equals(x)도 true 여야 한다
        // 하지만 cis.equals(s)는 true인데 s.equals(cis)가 false이기 때문에 대칭성을 위반했다.
        System.out.println(cis.equals(s));
        System.out.println(s.equals(cis));

        List<CaseInsensitiveString> list = new ArrayList<>();
        list.add(cis);
        // 현재 JDK에서는 false를 반환하지만 다른 버전에서는 어떻게 동작될지 모름.
        // equals 규약을 어기면 그 객체를 사용하는 다른 객체들이 어떻게 반응할지 할 수 없다.
        System.out.println(list.contains(s));
    }
}
