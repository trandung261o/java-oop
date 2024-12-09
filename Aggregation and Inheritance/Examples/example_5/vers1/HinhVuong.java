package example_5.vers1;

public class HinhVuong extends TuGiac {
	public HinhVuong() {
		/* Ở đây do lớp cha TuGiac ko có phương thức khởi tạo mặc định
		 * nên ở phần constructor của lớp con HinhVuong,
		 * ta phải gọi tường mình phương thức khởi tạo của lớp cha TuGiac bằng:
		 * 			super(Danh_sach_tham_so);
		 */
		
		super(new Diem(0, 0), new Diem(0, 1), 
				new Diem(1, 1), new Diem(1,0));
		
		
		System.out.println("Lop con HinhVuong()");
	}
}
