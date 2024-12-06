package example_2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std = new Student("Nam", 1990);
		System.out.println(std.getYear());
		change(std);
		System.out.println(std.getYear());
		
		Point pnt1 = new Point(0, 0);
		Point pnt2 = new Point(0, 0);
		pnt1.printPoint(); pnt2.printPoint();
		System.out.println(); tricky(pnt1, pnt2);
		pnt1.printPoint(); pnt2.printPoint();
		
		System.out.println();
		
		//ví dụ cho truyền tham số tùy ý
		Point p1 = new Point(0, 0);
		Point p2 = new Point(4, 0);
		Point p3 = new Point(4, 3);
		
		Polygon triangle = polygonFrom(p1, p2, p3);
		triangle.printPolygon();
	}
	
	//ví dụ cho truyền tham trị
    public void swap(int var1, int var2) {
    	int temp = var1;
    	var1 = var2;
    	var2 = temp;
    	//chỉ tác động đến bản sao, ko ảnh hưởng đến biến truyền vào
    }
    
    //ví dụ cho truyền tham chiếu
    public static void change(Student std) {
    	std.setYear(2000); //vd1: thay đổi biến gốc, do biến gốc và bản sao đều trỏ đến 1 nơi
    	//std = new Student("Hung", 1995); //vd2: chỉ thay đổi địa chỉ tham chiếu của bảo sao nên biến gốc không thay đổi
    }
    
    public static void tricky(Point arg1, Point arg2) {
    	arg1.setX(100); arg1.setY(200);
    	Point temp = arg1;
    	arg1 = arg2; arg2 = temp;
    }
    
    public static Polygon polygonFrom(Point...corners) {
    	int numberOfSides = corners.length;
    	double squareOfSide1, lengthOfSide1;
    	
    	Polygon polygon = new Polygon();
    	
    	for (Point corner : corners) {
    		polygon.addPoint(corner);
    	}
    	
    	squareOfSide1 = (corners[1].getX() - corners[0].getX())*(corners[1].getX() - corners[0].getX())
    			+ (corners[1].getY() - corners[0].getY())*(corners[1].getY() - corners[0].getY());
    	lengthOfSide1 = Math.sqrt(squareOfSide1);
    	
    	return polygon;
    }
}
