package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
    public static final int MAX_NUMBER_OF_AVAILABLE_DISC = 21;
    private DigitalVideoDisc itemsInStore[] =
            new DigitalVideoDisc[MAX_NUMBER_OF_AVAILABLE_DISC];
    private int nbAvailableDisc = 0;
    public void addDVD(DigitalVideoDisc dvd) {
        if (nbAvailableDisc == MAX_NUMBER_OF_AVAILABLE_DISC) {
            System.out.println("Unable to push more discs!");
        } else {
            itemsInStore[nbAvailableDisc] = dvd;
            nbAvailableDisc += 1;
            System.out.println("The disc has been added.");
        }
    }
    public void removeDVD(DigitalVideoDisc dvd) {
        if (nbAvailableDisc == 0) {
            System.out.println("Unable to remove discs!");
        } else {
            int index = 0;
            for(int i = 0; i < nbAvailableDisc; i++) {
                if (itemsInStore[i] == dvd) {
                    itemsInStore[i] = null;
                    index = i;
                    break;
                }
            }
            for(int j = index + 1; j < nbAvailableDisc; j++) {
                itemsInStore[j-1] = itemsInStore[j];
            }
            nbAvailableDisc -= 1;
            System.out.println("The disc has been removed.");
        }
    }
}