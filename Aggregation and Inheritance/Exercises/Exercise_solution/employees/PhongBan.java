package employees;

public class PhongBan {
	private String tenPhongBan;
	private byte soNhanVien;
	public static final byte SO_NV_MAX = 100;
	
	private NhanVien[] dsnv;
	
	public boolean themNhanVien(NhanVien nv) {
		if (soNhanVien < SO_NV_MAX){ 
			dsnv[soNhanVien] = nv;
			soNhanVien++;
			return true;
		} else return false;
	}
	
	public NhanVien xoaNhanVien() {
		if (soNhanVien > 0) {
			NhanVien tmp = dsnv[soNhanVien - 1];
			dsnv[soNhanVien - 1] = null; soNhanVien--;
			return tmp;
		} else return null;
	}
	
	public PhongBan(String tenPB) {
		dsnv = new NhanVien[SO_NV_MAX];
		tenPhongBan = tenPB; 
		soNhanVien = 0;
	}
	
	public double tongLuong() {
		double tong = 0.0;
		for (int i = 0; i < soNhanVien; i++) {
			tong += dsnv[i].tinhLuong();
		}
		return tong;
	}
	
	public void inTTin() {
		System.out.println("Ten phong: " + tenPhongBan);
		System.out.println("So NV: " + soNhanVien);
		System.out.println("Thong tin cac NV");
		for (int i = 0; i < soNhanVien; i++) {
			dsnv[i].inTTin();
		}
	}
}
