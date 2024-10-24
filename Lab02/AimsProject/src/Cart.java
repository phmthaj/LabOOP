
public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered++] = disc;
            System.out.println("This has been added");
        } else {
            System.out.println("The cart is full");
        }
    }


    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].equals(disc)) {
                itemsOrdered[i] = itemsOrdered[--qtyOrdered];
                itemsOrdered[qtyOrdered] = null;
                System.out.println("The item has been deleted");
                
                return;
            }
        }
        System.out.println("The item is not found");
    }


    public float totalCost() {
        float total_cost = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total_cost += itemsOrdered[i].getCost();
        }
        return total_cost;
    }
}
