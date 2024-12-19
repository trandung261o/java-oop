package hust.soict.hedspi.aims.media;

import java.util.Comparator;

public abstract class Media {
	private int id;
	private String title;
	private String category;
	private float cost;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}

	public Media(int id, String title, String category, float cost) {
		super();
		this.id = id;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	
	public Media(int id, String title) {
		super();
		this.id = id;
		this.title = title;
	}
	@Override
	public boolean equals(Object o) {
	    if (this == o) return true; // Kiểm tra tham chiếu
	    if (o == null || getClass() != o.getClass()) return false; // Kiểm tra null và cùng lớp
	    Media media = (Media) o; // Ép kiểu
	    return title != null && title.equalsIgnoreCase(media.title); // So sánh title (bỏ qua chữ hoa/thường)
	}

	public static final Comparator<Media> COMPARE_BY_TITLE_COST = 
			new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = 
    		new MediaComparatorByCostTitle();
    
    @Override
	public String toString() {
		return "Media - " + title + " - " + category + ": " + cost + " $";
	}

}
