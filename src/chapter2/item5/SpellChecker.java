package chapter2.item5;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// 의존 객체 주입을 통해 유연성을 높이고 테스트를 용이하게 해준다.
public class SpellChecker {
    private final Lexicon dictionary;

    public SpellChecker(Lexicon dictionary){
        this.dictionary = Objects.requireNonNull(dictionary);
    }

    public static boolean isValid(String word){ return true; }
    public static List<String> suggestions(String typo){ return new ArrayList<String>();}
}
