package hust.soict.hedspi.aims;
import java.util.Scanner;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Playable;
import hust.soict.hedspi.aims.store.Store;

public class Aims {
	private static final Store store = new Store();
    private static final Cart cart = new Cart();
    
	private static void initializeStore() {
	    // Thêm 12 media vào cửa hàng
	    store.addMedia(new DigitalVideoDisc(1, "Star Wars", "Science Fiction", 19.99f, 120, "George Lucas"));
	    store.addMedia(new DigitalVideoDisc(2, "The Matrix", "Action", 14.99f, 136, "Lana Wachowski"));
	    store.addMedia(new DigitalVideoDisc(3, "The Lord of the Rings", "Fantasy", 29.99f, 180, "Peter Jackson"));
	    store.addMedia(new DigitalVideoDisc(4, "Inception", "Thriller", 24.99f, 148, "Christopher Nolan"));
	    store.addMedia(new DigitalVideoDisc(5, "Jurassic Park", "Adventure", 19.99f, 127, "Steven Spielberg"));
	    
	    store.addMedia(new CompactDisc(6, "The Beatles Album", "Music", 15.99f, 50, "The Beatles", "John Lennon"));
	    store.addMedia(new CompactDisc(7, "Abbey Road", "Music", 18.99f, 45, "The Beatles", "Paul McCartney"));
	    store.addMedia(new CompactDisc(8, "Thriller", "Pop", 20.99f, 42, "Michael Jackson", "Michael Jackson"));
	    store.addMedia(new CompactDisc(9, "Back in Black", "Rock", 17.99f, 40, "AC/DC", "Brian Johnson"));
	    store.addMedia(new CompactDisc(10, "Dark Side of the Moon", "Rock", 22.99f, 43, "Pink Floyd", "David Gilmour"));
	    
	    store.addMedia(new Book(11, "Java Programming", "Education", 29.99f));
	    store.addMedia(new Book(12, "Clean Code", "Technology", 24.99f));
	}
	
	public static void main(String[] args) {
		initializeStore();
	    Scanner scanner = new Scanner(System.in);
	    int choice;
	    do {
	    	showMenu();
	    	choice = scanner.nextInt();
	    	scanner.nextLine();
	    	
	    	switch (choice) {
		    	case 1 -> viewStore(scanner);
		    	case 2 -> updateStore(scanner);
		    	case 3 -> viewCart(scanner);
		    	case 0 -> System.out.println("Exiting... Goodbye!");
		    	default -> System.out.println("Invalid choice! Please choose again.");
	    	}
	    	
	    } while (choice != 0);
	    scanner.close();
	}
	
	public static void showMenu() {
		System.out.println("AIMS: ");
		System.out.println("--------------------------------");
		System.out.println("1. View store");
		System.out.println("2. Update store");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.print("Please choose a number: ");
	}
	
	public static void viewStore(Scanner scanner) {
		store.print();
		int choice;
		
		do {
			storeMenu();
			choice = scanner.nextInt(); scanner.nextLine();
			
			switch(choice) {
				case 1 -> seeMediaDetails(scanner);
				case 2 -> addToCart(scanner);
				case 3 -> playMedia(scanner);
				case 4 -> viewCart(scanner);
				case 0 -> System.out.println("Returning to main menu...");
				default -> System.out.println("Invalid choice! Please choose again.");
			}
			
		} while (choice != 0);
	}
	
	public static void storeMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. See a media’s details");
		System.out.println("2. Add a media to cart");
		System.out.println("3. Play a media");
		System.out.println("4. See current cart");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.print("Please choose a number: ");
	}
	
	public static void seeMediaDetails(Scanner scanner) {
		System.out.print("Enter the title of the media: ");
		String title = scanner.nextLine();
		Media media = store.searchByTitle(title);
		
		if (media != null) {
			System.out.println(media);
			int choice;
			
			do {
				mediaDetailsMenu();
				choice = scanner.nextInt(); scanner.nextLine();
				
				switch (choice) {
					case 1 -> cart.addMedia(media);
					case 2 -> {
						if (media instanceof Playable) {
							((Playable) media).play();
						} else {
							System.out.println("This media cannot be played.");
						}
					}
					case 0 -> System.out.println("Returning to store menu...");
					default -> System.out.println("Invalid choice! Please choose again");
				}
				
			} while (choice != 0);
		} else {
			System.out.println("Media not found.");
		}
	}
	
	public static void mediaDetailsMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Add to cart");
		System.out.println("2. Play");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.print("Please choose a number: ");
	}
	
	public static void addToCart(Scanner scanner) {
		System.out.print("Enter the title of the media: ");
		String title = scanner.nextLine();
		Media media = store.searchByTitle(title);
		
		if (media != null) {
			cart.addMedia(media);
		} else {
			System.out.println("Media not found.");
		}
	}
	
	public static void playMedia(Scanner scanner) {
		System.out.print("Enter the title of the media: ");
		String title = scanner.nextLine();
		Media media = store.searchByTitle(title);
		if (media instanceof Playable) {
			((Playable) media).play();
		} else {
			System.out.println("Media not found or cannot be played.");
		}
	}
	
	public static void updateStore(Scanner scanner) {
		System.out.println("Choose an option:");
		System.out.println("1. Add media to store");
		System.out.println("2. Remove media from store");
		int choice = scanner.nextInt(); scanner.nextLine();
		
		switch (choice) {
			case 1:
				addMediaToStore(scanner); break;
			case 2:
				removeMediaFromStore(scanner); break;
			default:
				System.out.println("Invalid choice.");
				break;
		}
	}
	
	public static void addMediaToStore(Scanner scanner) {
		System.out.println("Enter media details to add: ");
		System.out.print("ID: "); int id = scanner.nextInt(); scanner.nextLine();
		System.out.print("Title: "); String title = scanner.nextLine(); 
		System.out.print("Category: "); String category = scanner.nextLine();
		System.out.print("Cost: "); float cost = scanner.nextFloat(); scanner.nextLine(); 
		
		System.out.print("Type (CD/DVD/Book): "); String type = scanner.nextLine(); 
		
		int t = 0;
		if (type.equals("CD")) t = 1;
		else if (type.equals("DVD")) t = 2;
		else if (type.equals("Book")) t = 3;
		else t = 0;
		
		Media media = null;
		switch (t) {
			case 1:
				System.out.print("Director: "); String cddirector = scanner.nextLine();
				System.out.print("Length: "); int cdlength = scanner.nextInt(); scanner.nextLine();
				System.out.print("Artist: "); String cdartist = scanner.nextLine();
				
				media = new CompactDisc(id, title, category , cost, cdlength, cddirector, cdartist);
				break;
			case 2:
				System.out.print("Director: "); String dvddirector = scanner.nextLine();
				System.out.print("Length: "); int dvdlength = scanner.nextInt(); scanner.nextLine();
				
				media = new DigitalVideoDisc(id, title, category, cost, dvdlength, dvddirector);
				break;
			case 3:
				media = new Book(id, title, category, cost);
				break;
			default:
				System.out.println("Invalid type selection. No media added.");
				return;
		}
		
		if (media != null) {
			store.addMedia(media);
			System.out.println("Media added to store: " + media.getTitle());
		}
	}
	
	private static void removeMediaFromStore(Scanner scanner) {
		System.out.print("Enter the title of the media to remove from store: ");
		String title = scanner.nextLine();
		Media media = store.searchByTitle(title);
		if (media != null) {
			store.removeMedia(media);
		} else {
			System.out.println("Media not found.");
		}
	}
	
	public static void viewCart(Scanner scanner) {
		cart.print();
		int choice;
		do {
			cartMenu();
			choice = scanner.nextInt(); scanner.nextLine();
			
			switch (choice) {
				case 1 -> {
					filterMediaInCart(scanner); break;
				}
				case 2 -> {
					sortMediaInCart(scanner); break;
				}
				case 3 -> {
					removeMediaFromCart(scanner); break;
				}
				case 4 -> {
					playMedia(scanner); break;
				}
				case 5 -> {
					placeOrder(scanner); break;
				}
				case 0 -> System.out.println("Returning to main menu...");
				default -> System.out.println("Invalid choice! Please choose again.");
				
			}
		} while (choice != 0);
	}
	
	public static void cartMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Filter medias in cart");
		System.out.println("2. Sort medias in cart");
		System.out.println("3. Remove media from cart");
		System.out.println("4. Play a media");
		System.out.println("5. Place order");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.print("Please choose a number: ");
	}
	
	public static void filterMediaInCart(Scanner scanner) {
		System.out.println("Choose a filter option:");
		System.out.println("1. Filter by ID");
		System.out.println("2. Filter by Title");
		int choice = scanner.nextInt(); scanner.nextLine();
		
		switch (choice) {
			case 1:
				System.out.print("Enter the ID to filter by: "); 
				int id = scanner.nextInt(); scanner.nextLine();
				System.out.println("Media with ID: " + id + ": " + cart.filterById(id));
				break;
			case 2:
				System.out.print("Enter the Title to filter by: "); 
				String title = scanner.nextLine(); 
				System.out.println("Media with Title: " + title + ": " + cart.filterByTitle(title));
				break;
			default:
				System.out.println("Invalid choice.");
				break;
		}
	}
	
	public static void sortMediaInCart(Scanner scanner) {
		System.out.println("Choose a sort option:");
		System.out.println("1. Sort by Title");
		System.out.println("2. Sort by Cost");
		int choice = scanner.nextInt(); scanner.nextLine();
		
		switch (choice) {
			case 1:
				cart.sortByTitle(); break;
			case 2:
				cart.sortByCost(); break;
			default:
				System.out.println("Invalid choice.");
				break;
		}
	}
	
	public static void removeMediaFromCart(Scanner scanner) {
		System.out.print("Enter the title of the media you want to remove from the cart: ");
		String title = scanner.nextLine();
		Media media = cart.searchByTitle(title);
		
		if (media != null) {
			cart.removeMedia(media);
		} else {
			System.out.println("Media not found in the cart.");
		}
	}
	
	public static void placeOrder(Scanner scanner) {
		System.out.println("Placing your order...");
		cart.emptyCart();
		System.out.println("Your order has been placed and the cart is now empty.");
	}
}
