package hust.soict.dsai.aims.media;

import hust.soict.dsai.aims.store.*;
import hust.soict.dsai.aims.cart.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        Cart cart = new Cart();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();  
            switch (choice) {
                case 1:
                    viewStore(store, cart, scanner);
                    break;
                case 2:
                    updateStore(store, scanner);
                    break;
                case 3:
                    seeCurrentCart(cart, scanner);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("------------------------------");
        System.out.print("Please choose a number: 0-1-2-3: ");
    }

    public static void viewStore(Store store, Cart cart, Scanner scanner) {
        while (true) {
            store.print();
            storeMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();  
            switch (choice) {
                case 1:
                    System.out.print("Enter the title of the media: ");
                    String title = scanner.nextLine();
                    Media media = store.searchByTitle(title);
                    if (media != null) {
                        System.out.println(media.toString());
                        mediaDetailsMenu(cart, media, scanner);
                    } else {
                        System.out.println("Media not found.");
                    }
                    break;
                case 2:
                    System.out.print("Enter the title of the media to add to cart: ");
                    title = scanner.nextLine();
                    media = store.searchByTitle(title);
                    if (media != null) {
                        cart.addMedia(media);
                        System.out.println("Media added to cart.");
                    } else {
                        System.out.println("Media not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter the title of the media to play: ");
                    title = scanner.nextLine();
                    media = store.searchByTitle(title);
                    if (media != null && media instanceof Playable) {
                        ((Playable) media).play();
                    } else {
                        System.out.println("Media not found or cannot be played.");
                    }
                    break;
                case 4:
                    seeCurrentCart(cart, scanner);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void storeMenu() {
        System.out.println("Options: ");
        System.out.println("------------------------------");
        System.out.println("1. See a media's details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("------------------------------");
        System.out.print("Please choose a number: 0-1-2-3-4: ");
    }

    public static void mediaDetailsMenu(Cart cart, Media media, Scanner scanner) {
        while (true) {
            System.out.println("Options: ");
            System.out.println("------------------------------");
            System.out.println("1. Add to cart");
            System.out.println("2. Play");
            System.out.println("0. Back");
            System.out.println("------------------------------");
            System.out.print("Please choose a number: 0-1-2: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  
            switch (choice) {
                case 1:
                    cart.addMedia(media);
                    System.out.println("Media added to cart.");
                    break;
                case 2:
                    if (media instanceof Playable) {
                        ((Playable) media).play();
                    } else {
                        System.out.println("This media cannot be played.");
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void updateStore(Store store, Scanner scanner) {
        System.out.println("Update store: ");
        System.out.println("1. Add media");
        System.out.println("2. Remove media");
        System.out.print("Please choose a number: 1-2: ");
        int choice = scanner.nextInt();
        scanner.nextLine();  
        System.out.print("Enter the title of the media: ");
        String title = scanner.nextLine();
        if (choice == 1) {
            Media media = new Book(title, title, choice);  
            media.setTitle(title);
            store.addMedia(media);
            System.out.println("Media added to store.");
        } else if (choice == 2) {
            Media media = store.searchByTitle(title);
            if (media != null) {
                store.removeMedia(media);
                System.out.println("Media removed from store.");
            } else {
                System.out.println("Media not found.");
            }
        } else {
            System.out.println("Invalid choice.");
        }
    }

    public static void seeCurrentCart(Cart cart, Scanner scanner) {
        while (true) {
            cart.print();
            cartMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();  
            switch (choice) {
                case 1:
                    System.out.println("Filter medias in cart by:");
                    System.out.println("1. ID");
                    System.out.println("2. Title");
                    int filterChoice = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    cart.filterMedia(filterChoice);
                    break;
                case 2:
                    System.out.println("Sort medias in cart by:");
                    System.out.println("1. Title");
                    System.out.println("2. Cost");
                    int sortChoice = scanner.nextInt();
                    scanner.nextLine();  
                    cart.sortMedia(sortChoice);
                    break;
                case 3:
                    System.out.print("Enter the title of the media to remove: ");
                    String title = scanner.nextLine();
                    Media media = cart.searchByTitle(title);
                    if (media != null) {
                        cart.removeMedia(media);
                        System.out.println("Media removed from cart.");
                    } else {
                        System.out.println("Media not found in cart.");
                    }
                    break;
                case 4:
                    System.out.print("Enter the title of the media to play: ");
                    title = scanner.nextLine();
                    media = cart.searchByTitle(title);
                    if (media != null && media instanceof Playable) {
                        ((Playable) media).play();
                    } else {
                        System.out.println("Media not found or cannot be played.");
                    }
                    break;
                case 5:
                    System.out.println("Order placed. Thank you!");
                    cart.clear();
                    return;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void cartMenu() {
        System.out.println("Options: ");
        System.out.println("------------------------------");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("------------------------------");
        System.out.print("Please choose a number: 0-1-2-3-4-5: ");
    }
}