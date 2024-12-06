package example_2;

import java.util.ArrayList;
import java.util.List;

public class Polygon {
	private List<Point> corners;
	
	public Polygon() {
		this.corners = new ArrayList<>();
	}
	
	public void addPoint(Point point) {
		corners.add(point);
	}
	
	public void printPolygon() {
		System.out.println("Polygon corners: ");
		for (Point corner : corners) {
			corner.printPoint();
		}
	}
}
