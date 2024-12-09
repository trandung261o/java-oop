package example_5.vers2;

public class HinhVuong extends TuGiac {
	public HinhVuong(Diem d1, Diem d2, Diem d3, Diem d4) {
		/* Ở đây do lớp cha TuGiac ko có phương thức khởi tạo mặc định
		 * nên ở phần constructor của lớp con HinhVuong,
		 * ta phải gọi tường mình phương thức khởi tạo của lớp cha TuGiac bằng:
		 * 			super(Danh_sach_tham_so);
		 */
		
		super(d1, d2, d3, d4);
	
		System.out.println("Lop con HinhVuong(d1, d2, d3, d4)");
	}
}
