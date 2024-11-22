package hust.soict.dsai.garbage;

public class GarbageCreator {
    public static void main(String[] args) {
        while (true) {
            String garbage = new String(new char[1000000]); // Creating a large string
        }
    }
}
