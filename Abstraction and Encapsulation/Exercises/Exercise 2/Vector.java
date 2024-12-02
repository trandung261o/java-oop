
public class Vector {
	private double x, y, z;
	
	//gán giá trị cho vector
	public Vector(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	//cộng với Vector v
	public Vector add(Vector v) {
		return new Vector(this.x + v.x, this.y - v.y, this.z - v.z);
	}
	
	//trừ đi Vector v
	public Vector subtract(Vector v) {
		return new Vector(this.x - v.x, this.y - v.y, this.z - v.z);
	}
	
	//nhân với một hằng số
	public Vector scale(double scalar) {
		return new Vector(this.x * scalar, this.y * scalar, this.z * scalar);
	}
	
	//nhân vô hướng 2 vector
	public double dotProduct(Vector v) {
		return this.x * v.x + this.y * v.y + this.z * v.z;
	}
	
}
