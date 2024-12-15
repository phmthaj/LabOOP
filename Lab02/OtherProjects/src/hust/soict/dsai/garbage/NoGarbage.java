package hust.soict.dsai.garbage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class NoGarbage {

    public static void main(String[] args) throws IOException {
        long startTime, endTime;

        InputStreamReader inputStream = new InputStreamReader(Objects.requireNonNull(GarbageCreator.class.getResourceAsStream("/test.txt")));
        BufferedReader reader = new BufferedReader(inputStream);

        startTime = System.currentTimeMillis();
        StringBuilder outputString = new StringBuilder();
        int character;
        while ((character = reader.read()) != -1) {
            outputString.append((char) character);
        }
        endTime = System.currentTimeMillis();
        reader.close();

        System.out.println(endTime - startTime);
    }
}