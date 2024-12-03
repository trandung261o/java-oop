package com.bean;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Point {	
	private String tenDiem;
	private double tungDo;
	private double hoanhDo;
	
	//khởi tạo không nhận tham số
	public Point() {
		setTenDiem("A");
		setTungDo(0.0);
		setHoanhDo(0.0);
	}
	
	//khởi tạo nhận 2 số thực làm tham số
	public Point(double tungDo, double hoanhDo) {
		super();
		setTenDiem("Noname");
		this.tungDo = tungDo;
		this.hoanhDo = hoanhDo;
	}
	
	//khởi tạo nhận 1 xâu kí tự và 2 số thực làm tham số
	public Point(String tenDiem, double tungDo, double hoanhDo) {
		super();
		this.tenDiem = tenDiem;
		this.tungDo = tungDo;
		this.hoanhDo = hoanhDo;
	}
	
	public String getTenDiem() {
		return tenDiem;
	}
	public void setTenDiem(String tenDiem) {
		this.tenDiem = tenDiem;
	}
	public double getTungDo() {
		return tungDo;
	}
	public void setTungDo(double tungDo) {
		this.tungDo = tungDo;
	}
	public double getHoanhDo() {
		return hoanhDo;
	}
	public void setHoanhDo(double hoanhDo) {
		this.hoanhDo = hoanhDo;
	}
	
	//phương thức nhập 1 điểm từ bàn phím
	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhap ten diem: ");
		this.tenDiem = scanner.next();
		System.out.print("Nhap tung do: ");
		this.tungDo = scanner.nextDouble();
		System.out.print("Nhap hoanh do: ");
		this.hoanhDo = scanner.nextDouble();
	}
	
	//phương thức in thông tin
	public void hienThi() {
		JOptionPane.showMessageDialog(null, 
				"Point: " + getTenDiem() + "(" + getTungDo() + ", " + getHoanhDo() + ")");
	}
}
