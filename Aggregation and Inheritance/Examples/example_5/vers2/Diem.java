package example_5.vers2;

public class Diem {	
	private int x, y;
	public Diem() {};
	public Diem(int x, int y) {
		this.x = x; this.y = y;
	}
	
	public void setX(int x) { this.x = x; }
	public int getX() { return this.x; }
	
	public void printDiem() {
		System.out.print("(" + x + ", " + y + ")");
	}
}
