package oop.cnpm;

public class Student {
	private String name;
	
	//phương thức truy vấn phải để public 
	public String getName() { 
		return this.name; //this: tự tham chiếu, this.name là biến name được khai báo ở đầu lớp
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
