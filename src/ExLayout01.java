import javax.swing.*;
import java.awt.*;

public class ExLayout01 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("레이아웃 FlowLayout");
        frame.setSize(400, 200);

        JButton obj1 = new JButton("버튼1");
        JButton obj2 = new JButton("버튼2");
        JButton obj3 = new JButton("버튼3");
        JButton obj4 = new JButton("버튼4");
        JButton obj5 = new JButton("버튼5");

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(obj1);
        panel.add(obj2);
        panel.add(obj3);
        panel.add(obj4);
        panel.add(obj5);

        frame.add(panel);
        frame.setVisible(true);
    }
}
