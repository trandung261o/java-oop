package example_1;

class MyDate {
    int year, month, day;
    
    //ví dụ về chồng phương thức: setMonth
    public boolean setMonth(int m) {
        if (m >= 1 && m <= 12) {
            this.month = m;
            return true; 
        } else {
            System.out.println("Tháng không hợp lệ: " + m);
            return false; 
        }
    }

    public boolean setMonth(String s) {
        String[] monthNames = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };

        for (int i = 0; i < monthNames.length; i++) {
            if (monthNames[i].equalsIgnoreCase(s)) {
                this.month = i + 1; 
                return true; 
            }
        }
        System.out.println("Tên tháng không hợp lệ: " + s);
        return false; 
    }
}
