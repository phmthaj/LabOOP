package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;
import java.util.Comparator;

public class Cart {
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

    public void addMedia(Media media) {
        if (!itemsOrdered.contains(media)) {
            itemsOrdered.add(media);
            System.out.println("Added: " + media.getTitle());
        } else {
            System.out.println("The item is already in the cart.");
        }
    }

    public void removeMedia(Media media) {
        if (itemsOrdered.contains(media)) {
            itemsOrdered.remove(media);
            System.out.println("Removed: " + media.getTitle());
        } else {
            System.out.println("The item is not in the cart.");
        }
    }

    public void print() {
        System.out.println("********************CART********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < itemsOrdered.size(); i++) {
            System.out.println((i + 1) + ". " + itemsOrdered.get(i).toString());
        }
        System.out.println("Total cost: " + totalCost() + " $");
        System.out.println("*********************************************");
    }

    public float totalCost() {
        float total = 0;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }

    public void filterMedia(int filterChoice) {
        switch (filterChoice) {
            case 1:
                itemsOrdered.stream()
                    .sorted((m1, m2) -> Integer.compare(m1.getId(), m2.getId()))
                    .forEach(media -> System.out.println(media.toString()));
                break;
            case 2:
                itemsOrdered.stream()
                    .sorted((m1, m2) -> m1.getTitle().compareToIgnoreCase(m2.getTitle()))
                    .forEach(media -> System.out.println(media.toString()));
                break;
            default:
                System.out.println("Invalid filter choice.");
        }
    }

    public void sortMedia(int sortChoice) {
        switch (sortChoice) {
            case 1:
                itemsOrdered.sort(Comparator.comparing(Media::getTitle));
                System.out.println("Cart sorted by title.");
                break;
            case 2:
                itemsOrdered.sort(Comparator.comparing(Media::getCost).reversed());
                System.out.println("Cart sorted by cost.");
                break;
            default:
                System.out.println("Invalid sort choice.");
        }
    }

    public Media searchByTitle(String title) {
        for (Media media : itemsOrdered) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                return media;
            }
        }
        System.out.println("Media not found with title: " + title);
        return null;
    }

    public void clear() {
        itemsOrdered.clear();
        System.out.println("Cart has been cleared.");
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1) {
        // Kiểm tra xem DVD đã có trong giỏ hàng chưa (kiểm tra sự giống nhau dựa trên equals)
        if (!itemsOrdered.contains(dvd1)) {
            itemsOrdered.add(dvd1);  // Nếu chưa có, thêm vào giỏ
            System.out.println(dvd1.getTitle() + " has been added to the cart.");
        } else {
            System.out.println(dvd1.getTitle() + " is already in the cart.");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc dvd2) {
        // Kiểm tra xem DVD có tồn tại trong giỏ hàng không
        if (itemsOrdered.contains(dvd2)) {
            itemsOrdered.remove(dvd2);  // Loại bỏ DVD khỏi giỏ
            System.out.println(dvd2.getTitle() + " has been removed from the cart.");
        } else {
            System.out.println(dvd2.getTitle() + " is not in the cart.");
        }
    }
}



