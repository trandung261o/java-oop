package example_2;

public class TuGiac {
	protected Diem d1, d2, d3, d4;
	
	public void setD1(Diem _d1) { d1 = _d1; }
	public Diem getD1() { return d1;}
	
	
	public TuGiac(Diem p1, Diem p2, Diem p3, Diem p4) {
		d1 = p1; d2 = p2; d3 = p3; d4 = p4;
	}
	
	public TuGiac() {
		d1 = new Diem();
		d2 = new Diem(0, 1);
		d3 = new Diem(1, 2);
		d4 = new Diem(1, 0);
	}
	
	public void printTuGiac() {
		d1.printDiem();
		d2.printDiem();
		d3.printDiem();
		d4.printDiem();
		System.out.println();
	}
}
