package hust.soict.dsai.garbage;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class GarbageCreator {
    public static void main(String[] args) throws IOException {
        String filename = "largeFile.txt"; // Đọc file văn bản lớn.
        byte[] inputBytes = Files.readAllBytes(Paths.get(filename));
        long startTime = System.currentTimeMillis();

        String outputString = "";
        for (byte b : inputBytes) {
            outputString += (char) b; // Sử dụng toán tử + để nối chuỗi.
        }
        System.out.println("Time taken: " + (System.currentTimeMillis() - startTime) + "ms");
    }
}