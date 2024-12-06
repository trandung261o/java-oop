package example_3;
import javax.swing.JOptionPane;

public class HelloNameDialog {
	public static void main(String args[]) {
		String result;
		//result = javax.swing.JOptionPane.showInputDialog("Hay nhap ten ban:");
		//javax.swing.JOptionPane.showMessageDialog(null, "Xin chao " + result + "!");
		
		//sử dụng import
		//result = JOptionPane.showInputDialog("Hay nhap ten ban:");
		//JOptionPane.showMessageDialog(null, "Xin chao " + result + "!");
		/*các package cơ bản
		 * java.lang, java.util, java.io, java.math, java.sql, javax.swing, ...
		 */
		
		//Wrapper class
		//toString: giá trị số -> xâu
		//<type>Value: đối tượng wrapper class -> giá trị nguyên thủy
		Float objF = new Float("4.67");
		float f = objF.floatValue(); // f = 4.67
		int i = objF.intValue(); //i = 4
		
		//parse<type>() / valueOf(): xâu -> giá trị số
		i = Integer.parseInt("123"); //i = 123
		double d = Double.parseDouble("1.5"); //d = 1.5
		Double objF2 = Double.valueOf("-36.12");
		long l = objF2.longValue(); //l = -36L
		
		//String
		//String name = new String("Joe Smith"); khởi tạo gây lãng phí bộ nhớ
		String name = "Joe Smith"; //khởi tạo tiết kiệm bộ nhớ
		
		name.toLowerCase(); // "joe smith"
		name.toUpperCase(); // "JOE SMITH"
		"Joe Smith ".trim(); // "Joe Smith"
		"Joe Smith".indexOf('e'); // 2
		"Joe Smith".length(); // 9
		"Joe Smith".charAt(5); // 'm'
		"Joe Smith".substring(5); // "mith"
		"Joe Smith".substring(2,5); // "e S"
		
		// so sánh 2 xâu
		name = "joe";
		if("Joe".equals(name)) // true/false
			name += " Smith";
		
		//không xét kí tự hoa/thường
		boolean same = "Joe".equalsIgnoreCase("joe"); //same = true
		
		//String bất biến, StringBuffer khả biến
		StringBuffer sb = new StringBuffer("hi");
		StringBuffer tb = sb; //tb = "hi"
		tb.append("gh"); //tb = "high"
		System.out.println(tb); 
		
		//tạo xâu thông qua vòng lặp -> sử dụng StringBuffer
		StringBuffer buffer = new StringBuffer(15);
		buffer.append("This is ") ; //This is
		buffer.append("String") ; //This is String
		buffer.insert(7," a") ; //This is a String 
		buffer.append('.'); //This is a String.
		System.out.println(buffer.length()); // 17
		System.out.println(buffer.capacity()); // 32
		String output = buffer.toString() ;
		System.out.println(output); // "This is a String."
		
		//Math class
		System.out.print(Math.pow(Math.E, Math.sqrt(2.0*Math.PI)));
		System.out.print(Math.exp(Math.sqrt(2.0*Math.PI)));
		
		//System class
		System.out.println(System.getProperty("path.separator"));
		System.out.println(System.getProperty("file.separator"));
		System.out.println(System.getProperty("java.class.path"));
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("os.version"));
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.getProperty("user.home"));
		System.out.println(System.getProperty("user.name"));
	}
}
