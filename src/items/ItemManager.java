package items;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class ItemManager implements CheckInable, CheckOutable {
	private ArrayList<Book> bookShelf = new ArrayList<Book>();
	private ArrayList<Map> mapShelf = new ArrayList<Map>();
	private ArrayList<Magazine> magazineShelf = new ArrayList<Magazine>();

	@Override
	public void checkout(LibraryItem item) {
		// find item.
		bookShelf.stream().filter(t -> t.equals(item)).collect(Collectors.toList()).forEach(System.out::print);
		// remove item of the shelf
	}

	@Override
	public void checkin() {
		// TODO Auto-generated method stub

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
