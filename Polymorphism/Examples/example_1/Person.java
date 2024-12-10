package example_1;

import java.sql.Date;

public class Person {
	protected String name;
	protected Date birthday;
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public void setBirthday(Date birthday) { this.birthday = birthday; }
	public String getDetails() {
		String s = name + ", " + birthday;
		return s;
	}
}


