package employees;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NhanVien nv1 = new NhanVien("Nguyen Van A", 5000, 2);
		NhanVien nv2 = new NhanVien("Tran Thi B", 7000, 1.5);
		
		nv1.inTTin();
		nv2.inTTin();
		
		System.out.println("Tang luong cho " + nv1.getTenNhanVien() + ": ");
		nv1.tangLuong(0.5);
		nv1.inTTin();
		
		System.out.println("Tang luong cho " + nv2.getTenNhanVien() + ": ");
		nv2.tangLuong(1);
		nv2.inTTin();
	}

}
