package chapter7.item46;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class Item46 {


    public static void main(String[] args) throws FileNotFoundException {
        InputStream file = new FileInputStream("dst.txt");
        // 스트림 패러다임을 이해하지 못한 채 API만 사용
        Map<String, Long> freq = new HashMap<>();
        try(Stream<String> words = new Scanner(file).tokens()){
            words.forEach(word -> {
                freq.merge(word.toLowerCase(), 1L, Long::sum);
            });
        }
    }
}
