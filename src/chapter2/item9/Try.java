package chapter2.item9;

import java.io.*;

public class Try {
    public static void main(String[] args) throws IOException {
        String firstLine = firstLineOfFile("test.txt");
        System.out.println(firstLine);
    }

    public static String firstLineOfFile(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        try{
            return br.readLine();
        }finally {
            br.close();
        }
    }
}
