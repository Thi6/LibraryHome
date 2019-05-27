package items;

public class Magazine extends LibraryItem {
	private String category;

	public Magazine(int id, String title, String category) {
		super(id, title);
		this.category = category;

	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
}
