/*khai báo gói
sử dụng ký tự thường để đặt tên
phải được viết trên cùng sourcecode 
chỉ được phép có 1 câu khai báo gói
một gói có thể được đặt trong một gói khác*/
package com.megabank.models; 

public class BankAccount {
	//khai báo thuộc tính: chiDinhTruyCap KieuDL tenThuocTinh;
	private String owner;
	private double balance = 0.0;
	
	//khai báo phương thức: chiDinhTruyCap kieuTraVe tenPhuongThuc (ds thamso) {}
	public boolean debit(double amount) {
		//method body 
		//Java code that implements method behavior
		if (amount > balance) {
			return false;
		} else {
			balance -= amount;
			return true;
		}
	}
	
	public void credit(double amount) {
		balance += amount;
	}
}
