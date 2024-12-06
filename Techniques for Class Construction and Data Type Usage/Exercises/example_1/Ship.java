package example_1;

public class Ship {
	private double x = 0.0, y = 0.0;
	private double speed = 1.0, direction = 0.0;
	public String name;
	
	public Ship(String name) {
		this.name = name;
	}
	
	public Ship(String name, double x, double y) {
		this(name); //từ khóa 'this' còn gọi đến phương thức khởi tạo khác của lớp
		this.x = x; this.y = y;
	}
	
	public Ship(String name, double x, double y, double speed, double direction) {
		this(name, x, y); //từ khóa 'this' còn gọi đến phương thức khởi tạo khác của lớp
		this.speed = speed;
		this.direction = direction;
	}
}
