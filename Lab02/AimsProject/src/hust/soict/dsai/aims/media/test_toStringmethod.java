package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class test_toStringmethod {
    public static void main(String[] args) {
        List<Media> mediae = new ArrayList<Media>();

        Media cd = new CompactDisc("Album A", "Music", "Artist A", "Director A", 15.0f);
        Media dvd = new DigitalVideoDisc("Movie B", "Action", "Director B", 120, 20.0f);
        Media book = new Book("Book C", "Fiction", 10.0f);

        mediae.add(cd);
        mediae.add(dvd);
        mediae.add(book);

        for (Media m : mediae) {
            System.out.println(m.toString());
        }
    }
}
