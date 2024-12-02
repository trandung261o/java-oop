package employees;

public class NhanVien {
	private String tenNhanVien;
	private double luongCoBan;
	private double heSoLuong;
	public double LUONG_MAX = 20000;
	
	public boolean tangLuong(double tangHeSo) {
		if ((heSoLuong + tangHeSo) * luongCoBan > LUONG_MAX) {
			System.out.println("Khong the tang luong vi vuot muc toi da!");
			return false;
		}
		heSoLuong += tangHeSo;
		return true;
	}
	
	public double tinhLuong() {
		return luongCoBan * heSoLuong;
	}
	
	public void inTTin() {
		System.out.println("Ten nhan vien: " + tenNhanVien);
		System.out.println("Luong co ban: " + luongCoBan);
		System.out.println("He so luong: " + heSoLuong);
		System.out.println("Luong: " + tinhLuong());
	}
	
	public NhanVien(String tenNhanVien, double luongCoBan, double heSoLuong) {
		this.tenNhanVien = tenNhanVien;
		this.luongCoBan = luongCoBan;
		this.heSoLuong = heSoLuong;
		
	}
	
	public String getTenNhanVien() {
		return tenNhanVien;
	}
	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}
	public double getLuongCoBan() {
		return luongCoBan;
	}
	public void setLuongCoBan(double luongCoBan) {
		this.luongCoBan = luongCoBan;
	}
	public double getHeSoLuong() {
		return heSoLuong;
	}
	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
	
}
