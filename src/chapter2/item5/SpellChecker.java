package chapter2.item5;

import java.util.ArrayList;
import java.util.List;

// 정적 유틸리티를 잘못 사용한 예 - 유연하지 않고 테스트하기 어렵다.
public class SpellChecker {
    private static final Lexicon dictionary = new Lexicon();

    private SpellChecker(){}

    public static boolean isValid(String word){ return true; }
    public static List<String> suggestions(String typo){ return new ArrayList<String>();}
}
