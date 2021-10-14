package chapter2.item9;

import java.io.*;

public class Try {
    public static void main(String[] args) throws IOException {
        copy("test.txt", "dst.txt");
        String result = firstLineOfFile("dst.txt");
        System.out.println(result);
    }

    public static String firstLineOfFile(String path) throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            return br.readLine();
        }
    }

    public static void copy(String src, String dst) throws IOException {

        try(InputStream in = new FileInputStream(src);
            OutputStream out = new FileOutputStream(dst)) {
            byte[] buf = new byte[255];
            int n;
            while ((n = in.read(buf)) >= 0)
                out.write(buf, 0, n);
        }
    }
}
