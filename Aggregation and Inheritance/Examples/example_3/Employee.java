package example_3;

public class Employee extends Person {
	private double salary;
	public boolean setSalary(double sal) {
		salary = sal;
		return true;
	}
	
	public String getDetail() {
		String s = name + ", " + birthday + ", " + salary; 
		/* Ta thấy ở lớp cha Person
		 * nếu thuộc tính 'name' và 'birthday' có chỉ định truy cập là private thì
		 * sẽ xuất hiện lỗi là: "the field Person.birthday is not visible"
		 * điều này là do lớp con không thể kế thừa các thuộc tính private của lớp cha
		 * để sửa lỗi này, ta có thể sử dụng phương thức getName() (public) thay vì 
		 * sử dụng trực tiếp biến name (private)
		 * hoặc thay đổi chỉ định truy cập của các thuộc tính ở lớp cha từ private -> public
		 */
		
		return s;
	}
}
