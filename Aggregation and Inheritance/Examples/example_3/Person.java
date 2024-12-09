package example_3;

import java.sql.Date;

public class Person {
	//private String name; 
	//private Date birthday;
	/*do chỉ định truy cập của các thuộc tính là private nên
	 * các lớp con kế thừa ko thể sử dụng được các thuộc tính này
	 * -> phải sửa thành protected
	 */
	
	protected String name;
	protected Date birthday;
	
	
	/*chú ý: nếu lớp cha Person và lớp con Employee đều ở cùng 1 package
	 * ta có thể khai báo chỉ định truy cập default cho các thuộc tính, VD
	 * 	String name;
	 * 	Date birthday;
	 * 
	 * nhưng nếu ở khác gói, ta phải import gói chứa class cha
	 * và khai báo các thuộc tính là protected
	 */
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
}


