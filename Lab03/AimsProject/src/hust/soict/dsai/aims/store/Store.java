package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
    public static final int MAX_NUMBERS_IN_STORE = 100;
    private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[MAX_NUMBERS_IN_STORE];
    private int qtyInStore = 0;

    // Phương thức thêm DVD vào cửa hàng
    public void addDVD(DigitalVideoDisc disc) {
        if (qtyInStore < MAX_NUMBERS_IN_STORE) {
            itemsInStore[qtyInStore++] = disc;
            System.out.println("This DVD has been added to the store: " + disc.getTitle());
        } else {
            System.out.println("The store is full. Cannot add " + disc.getTitle());
        }
    }

    // Phương thức xóa DVD khỏi cửa hàng
    public void removeDVD(DigitalVideoDisc disc) {
        boolean found = false;
        for (int i = 0; i < qtyInStore; i++) {
            if (itemsInStore[i].equals(disc)) {
                itemsInStore[i] = itemsInStore[--qtyInStore];
                itemsInStore[qtyInStore] = null;
                System.out.println("The DVD has been removed from the store: " + disc.getTitle());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("The DVD is not found in the store: " + disc.getTitle());
        }
    }

    // Phương thức in danh sách DVD trong cửa hàng
    public void printStore() {
        System.out.println("***********************STORE***********************");
        System.out.println("Items in store:");
        for (int i = 0; i < qtyInStore; i++) {
            System.out.println((i + 1) + ". " + itemsInStore[i].toString());
        }
        System.out.println("***************************************************");
    }
}

