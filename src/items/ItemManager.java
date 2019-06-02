package items;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class ItemManager implements CheckInable, CheckOutable {
	private ArrayList<Book> bookShelf = new ArrayList<Book>();
	private ArrayList<Map> mapShelf = new ArrayList<Map>();
	private ArrayList<Magazine> magazineShelf = new ArrayList<Magazine>();

	@Override
	public void checkout(LibraryItem item) {
		LocalDateTime checkOutDate = LocalDateTime.now();
		// removes item from a shelf
		// add a checkout date
		System.out.println(item.getTitle() + " has been checked out on " + checkOutDate);
		bookShelf.remove(item);
		System.out.println(bookShelf);
	}

	@Override
	public void checkin(LibraryItem item) {
		LocalDateTime checkInDate = LocalDateTime.now();
		// adds item back into shelf
		System.out.println(item.getTitle() + " has been checked in on " + checkInDate);
		bookShelf.add((Book) item);
		System.out.println(bookShelf);
	}

	public ArrayList<Book> addToBookShelf(Book newBook) {
		bookShelf.add(newBook);
		return bookShelf;
	}

	public ArrayList<Map> addToMapShelf(Map newMap) {
		mapShelf.add(newMap);
		return mapShelf;
	}

	public ArrayList<Magazine> addToMagazineShelf(Magazine newMagazine) {
		magazineShelf.add(newMagazine);
		return magazineShelf;
	}

	public ArrayList<Book> removeFromBookShelf(Book aBook) {
		bookShelf.remove(aBook);
		return bookShelf;
	}

	public ArrayList<Map> removeFromMapShelf(Map aMap) {
		mapShelf.remove(aMap);
		return mapShelf;
	}

	public ArrayList<Magazine> removeFromMagShelf(Magazine aMag) {
		magazineShelf.remove(aMag);
		return magazineShelf;
	}

}
