package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();

    public void addMedia(Media media) {
        if (!itemsInStore.contains(media)) {
            itemsInStore.add(media);
            System.out.println("Added to the store: " + media.getTitle());
        } else {
            System.out.println("The item is already in the store.");
        }
    }

    public void removeMedia(Media media) {
        if (itemsInStore.contains(media)) {
            itemsInStore.remove(media);
            System.out.println("Removed from the store: " + media.getTitle());
        } else {
            System.out.println("The item is not found in the store.");
        }
    }

    public void print() {
        System.out.println("********************STORE********************");
        System.out.println("Items in Store:");
        for (int i = 0; i < itemsInStore.size(); i++) {
            System.out.println((i + 1) + ". " + itemsInStore.get(i).toString());
        }
        System.out.println("*********************************************");
    }

    public Media searchByTitle(String title) {
        for (Media media : itemsInStore) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                return media;
            }
        }
        System.out.println("Media not found with title: " + title);
        return null;
    }

    // Phương thức thêm DVD vào cửa hàng
    public void addDVD(DigitalVideoDisc dvd1) {
        // Kiểm tra DVD có trong cửa hàng không
        if (!itemsInStore.contains(dvd1)) {
            itemsInStore.add(dvd1);
            System.out.println(dvd1.getTitle() + " has been added to the store.");
        } else {
            System.out.println(dvd1.getTitle() + " is already in the store.");
        }
    }

    // Phương thức loại bỏ DVD khỏi cửa hàng
    public void removeDVD(DigitalVideoDisc dvd1) {
        // Kiểm tra DVD có trong cửa hàng không
        if (itemsInStore.contains(dvd1)) {
            itemsInStore.remove(dvd1);
            System.out.println(dvd1.getTitle() + " has been removed from the store.");
        } else {
            System.out.println(dvd1.getTitle() + " is not in the store.");
        }
    }
}