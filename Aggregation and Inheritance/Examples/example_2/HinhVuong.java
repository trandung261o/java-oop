package example_2;

public class HinhVuong extends TuGiac {
	public HinhVuong() {
		
		//sử dụng các thuộc tính protected của lớp cha TuGiac
		d1 = new Diem(0, 0); 
		d2 = new Diem(0, 1);
		d3 = new Diem(1, 0);
		d4 = new Diem(1, 1);
	}
}
