package example_5;

import javax.swing.*;
import java.awt.*;

public class Test extends JPanel {
    private Circle circle;

    public Test() {
        // Tạo một Circle với tên, tọa độ (x, y) và bán kính
        circle = new Circle("My Circle", 100, 100, 50);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Vẽ và tô màu Circle
        circle.draw(g);
        circle.fill(g);
    }

    public static void main(String[] args) {
        // Tạo JFrame
        JFrame frame = new JFrame("Test Shape and Circle");
        Test panel = new Test();

        frame.add(panel);
        frame.setSize(400, 400); // Kích thước cửa sổ
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Di chuyển Circle sau 2 giây
        try {
            Thread.sleep(2000); // Chờ 2 giây
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        Graphics g = panel.getGraphics();
        panel.circle.moveTo(g, 200, 200); // Di chuyển đến vị trí mới
    }
}
