package chapter7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LamdaTest1 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();

        Collections.sort(words, Comparator.comparingInt(String::length));
    }
}
