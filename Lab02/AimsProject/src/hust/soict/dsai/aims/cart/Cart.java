package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered++] = disc;
            System.out.println("This DVD has been added.");
        } else {
            System.out.println("The cart is full.");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        for (DigitalVideoDisc disc : dvdList) {
            if (qtyOrdered < MAX_NUMBERS_ORDERED) {
                itemsOrdered[qtyOrdered++] = disc;
                System.out.println("This DVD has been added: " + disc.getTitle());
            } else {
                System.out.println("The cart is full. Cannot add " + disc.getTitle());
                break;
            }
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered++] = dvd1;
            System.out.println("This DVD has been added: " + dvd1.getTitle());
        } else {
            System.out.println("The cart is full. Cannot add " + dvd1.getTitle());
        }

        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered++] = dvd2;
            System.out.println("This DVD has been added: " + dvd2.getTitle());
        } else {
            System.out.println("The cart is full. Cannot add " + dvd2.getTitle());
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].equals(disc)) {
                itemsOrdered[i] = itemsOrdered[--qtyOrdered];
                itemsOrdered[qtyOrdered] = null;
                System.out.println("The item has been deleted.");
                return;
            }
        }
        System.out.println("The item is not found.");
    }

    public float totalCost() {
        float totalCost = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            totalCost += itemsOrdered[i].getCost();
        }
        return totalCost;
    }

    // Phương thức in danh sách các sản phẩm trong giỏ hàng
    public void print() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println((i + 1) + ". " + itemsOrdered[i].toString());
        }
        System.out.println("Total cost: " + totalCost() + " $");
        System.out.println("**************************************************");
    }

    // Tìm kiếm DVD theo ID
    public void searchById(int id) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getId() == id) {
                System.out.println("Found: " + itemsOrdered[i].toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No DVD found with ID: " + id);
        }
    }

    // Tìm kiếm DVD theo tiêu đề
    public void searchByTitle(String title) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].isMatch(title)) {
                System.out.println("Found: " + itemsOrdered[i].toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No DVD found with title: " + title);
        }
    }
}


