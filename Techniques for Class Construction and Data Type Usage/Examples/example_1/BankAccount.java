package example_1;

public class BankAccount {
	private String owner;
	private double balance;
	
	//từ khóa this: tự tham chiếu. 
	//Tự tham chiếu đến đối tượng hiện tại 
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	//chồng phương thức khởi tạo
	public BankAccount() {owner = "noname";}
	public BankAccount(String o, double b) {
		owner = o; balance = b;
	}
} 
