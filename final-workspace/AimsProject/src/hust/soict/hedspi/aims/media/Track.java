package hust.soict.hedspi.aims.media;

public class Track implements Playable {
	private String title;
	private int length;
	
	public String getTitle() {
		return title;
	}

	public int getLength() {
		return length;
	}

	public Track(String title, int length) {
		super();
		this.title = title;
		this.length = length;
	}

	public Track(String title) {
		super();
		this.title = title;
	}

	public Track(int length) {
		super();
		this.length = length;
	}

	public void play() {
		System.out.println("Playing Track: " + this.getTitle());
		System.out.println("Track length: " + this.getLength());
	}
	
	@Override
	public boolean equals(Object o) {
	    if (this == o) return true; // Kiểm tra tham chiếu
	    if (o == null || getClass() != o.getClass()) return false; // Kiểm tra null và cùng lớp
	    Track track = (Track) o; // Ép kiểu
	    return length == track.length && 
	           (title != null && title.equalsIgnoreCase(track.title)); // So sánh title và length
	}

}
