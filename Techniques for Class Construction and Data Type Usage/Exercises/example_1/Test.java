package example_1;

public class Test {
    public static void main(String args[]) {
        
    	//test chồng phương thức của lớp MyDate
    	MyDate d = new MyDate();
        if (d.setMonth(13)) 
        	System.out.println("Tháng được thiết lập là: " + d.month);
        if (d.setMonth("September")) 
        	System.out.println("Tháng được thiết lập là: " + d.month);
        
        //------------------------------------------------------------------
        //test chồng phước thức của lớp MyClass
        MyClass m = new MyClass();
        //m.myMethod(); //error do không có method phù hợp
        //m.myMethod(9, 10); //error do có 2 phiên bản method phù hợp
        m.myMethod(9L, 10); //correct do chỉ có duy nhất 1 method phù hợp
        m.myMethod(8, 34L);
        
        //test chồng phương thức khởi tạo của lớp BankAccount
        BankAccount acc1 = new BankAccount(); 
        BankAccount acc2 = new BankAccount("Thuy", 100);
    }
}
