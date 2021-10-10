package chapter2.item6;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class RomanNumerals {
    private static final Pattern ROMAN = Pattern.compile("^(?=.)M*(C[MD]|D?C{0,3})"
            + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

    static boolean isRomanNumeral(String s){
        return ROMAN.matcher(s).matches();
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 10000000; i++)
            strings.add("test");

        strings.forEach(s -> isRomanNumeral(s));

        System.out.println(System.currentTimeMillis() - start);

    }
}
