package hust.soict.dsai.aims.test.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Store dvdStore = new Store();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animation", "Roger Allers", 87, 19.95f);
        dvdStore.addDVD(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
                "Science Fiction", "George Lucas", 87, 24.95f);
        dvdStore.addDVD(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
                "Animation", 18.99f);
        dvdStore.addDVD(dvd3);
        dvdStore.removeDVD(dvd1);
        dvdStore.removeDVD(dvd2);
        dvdStore.removeDVD(dvd3);
    }

}