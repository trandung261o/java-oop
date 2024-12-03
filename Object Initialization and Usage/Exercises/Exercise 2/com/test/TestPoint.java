package com.test;
import com.bean;
import com.bean.Point;

public class TestPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Gọi hàm khởi tạo không tham số
		Point obj1 = new Point();
		
		obj1.hienThi();
		
		//
		Point obj2 = new Point(-12.8, 13);
		obj2.hienThi();
		
		Point obj3 = new Point("B", 3.5, 4.5);
		obj3.hienThi();
		
		Point obj4 = new Point();
		obj4.nhap();
		obj4.hienThi();
	}

}
