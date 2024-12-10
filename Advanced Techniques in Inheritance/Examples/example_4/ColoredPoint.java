package example_4;

public abstract class ColoredPoint extends Point {
	int color;
	public ColoredPoint(int x, int y, int color) {
		super(x, y);
		this.color = color;
	}
	
	/*khi một lớp con ko override phương thức trừu tượng của lớp cha
	 * chúng sẽ trở thành một lớp trừu tượng
	 */
}
