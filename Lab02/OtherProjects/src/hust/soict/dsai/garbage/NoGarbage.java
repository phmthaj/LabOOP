package hust.soict.dsai.garbage;

public class NoGarbage {
    public static void main(String[] args) {
        StringBuilder reusableStringBuilder = new StringBuilder(); // Reusable StringBuilder
        while (true) {
            reusableStringBuilder.setLength(0);
            // Generate some data using the StringBuilder
            reusableStringBuilder.append("Some data");
            // Continue processing without creating additional garbage
        }
    }
}
