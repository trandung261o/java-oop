- Mỗi khi thực hiện phép cộng `result += "a"`, một đối tượng `String` mới được tạo ra do 
`String` là bất biến. Điều này làm tốn thêm bộ nhớ và thời gian.  
- `StringBuffer` là một lớp có thể thay đổi (khả biến). Phương thức `append()` thêm nội dung
vào cùng một đối tượng, ko tạo ra các đối tượng mới, giúp tiết kiệm bộ nhớ và thời gian.
