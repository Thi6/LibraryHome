package items;

public class Map extends LibraryItem {
	private String area;

	public Map(int id, String title, String area) {
		super(id, title);
		this.area = area;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

}
