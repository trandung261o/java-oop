package example_1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Diem d1 = new Diem(2, 3);
		Diem d2 = new Diem(4, 1);
		Diem d3 = new Diem(5, 1);
		Diem d4 = new Diem(8, 4);
		
		TuGiac tg1 = new TuGiac(d1, d2, d3, d4);
		TuGiac tg2 = new TuGiac();
		tg1.printTuGiac();
		tg2.printTuGiac();
	}

}
