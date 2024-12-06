package employees;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NhanVien nv1 = new NhanVien("Nguyen Van A", 5000, 2);
		NhanVien nv2 = new NhanVien("Tran Thi B", 7000, 1.5);
		NhanVien nv3 = new NhanVien("Le Van C", 6000, 1.8);
		
		nv1.inTTin();
		nv2.inTTin();
		nv3.inTTin();
		
		System.out.println("So luong nhan vien hien tai: " + NhanVien.getSoLuongNhanVien());
		
		System.out.println("Tang luong cho " + nv1.getTenNhanVien() + ": ");
		nv1.tangLuong(0.5);
		nv1.inTTin();
		
		System.out.println("Tang luong cho " + nv2.getTenNhanVien() + ": ");
		nv2.tangLuong(1);
		nv2.inTTin();
		
		double tongLuong = NhanVien.tinhTongLuong(nv1, nv2, nv3);
		System.out.println("\nTong luong cua tat ca nhan vien: " + tongLuong);
	}

}
