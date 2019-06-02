package logic;

import items.Book;
import items.ItemManager;
import items.Magazine;
import items.Map;
// import package.class;

public class Runner {

	public static void main(String[] args) {

		Book book1 = new Book(1, "Stolen", "Young adult fiction", "Lucy Christopher");
		Book book2 = new Book(2, "The Handmaid's Tale", "Novel", "Margaret Atwood");
		Book book3 = new Book(7, "Gone Girl", "Thriller", "Gillian Flynn");

		ItemManager bookManager = new ItemManager();
		bookManager.addToBookShelf(book1);
		// System.out.println(bookManager.addToBookShelf(book1));
		bookManager.addToBookShelf(book2);
		bookManager.addToBookShelf(book3);

		Map map1 = new Map(3, "Your guide to London", "London");
		Map map2 = new Map(4, "Paris Map", "Paris");

		ItemManager mapManager = new ItemManager();

		System.out.println(mapManager.addToMapShelf(map1));
		System.out.println(mapManager.addToMapShelf(map2));

		Magazine mag1 = new Magazine(5, "Forbes", "business");
		Magazine mag2 = new Magazine(6, "Vogue", "Fashion");

		ItemManager magManager = new ItemManager();

		System.out.println(magManager.addToMagazineShelf(mag1));
		System.out.println(magManager.addToMagazineShelf(mag2));

		bookManager.checkout(book1);
		bookManager.checkin(book1);
	}

}
