package chapter3.item10;

public final class CaseInsensitiveString {
    private final String s;


    public CaseInsensitiveString(String s){
        this.s = s;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof CaseInsensitiveString)
            return s.equalsIgnoreCase( ((CaseInsensitiveString) obj).s);
        if(obj instanceof String)
            return s.equalsIgnoreCase((String)obj);
        return false;
    }

    public static void main(String[] args) {
        CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
        String s = "polish";

        // x.equals(y) = true 일 경우 y.equals(x)도 true 여야 한다
        // 하지만 cis.equals(s)는 true인데 s.equals(cis)가 false이기 때문에 대칭성을 위반했다.
        System.out.println(cis.equals(s));
        System.out.println(s.equals(cis));
    }
}
