package hust.soict.dsai.garbage;


import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class NoGarbage {
    public static void main(String[] args) throws IOException {
        String filename = "largeFile.txt"; // Đọc file văn bản lớn.
        byte[] inputBytes = Files.readAllBytes(Paths.get(filename));
        long startTime = System.currentTimeMillis();

        StringBuilder outputBuilder = new StringBuilder();
        for (byte b : inputBytes) {
            outputBuilder.append((char) b); // Sử dụng StringBuilder.
        }
        String outputString = outputBuilder.toString();
        System.out.println("Time taken: " + (System.currentTimeMillis() - startTime) + "ms");
    }
}
