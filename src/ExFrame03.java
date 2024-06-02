import javax.swing.*;
import java.awt.*;

public class ExFrame03 extends JFrame {
    public ExFrame03() {
        setTitle("프레임 생성3");
        setSize(400, 200);
        setVisible(true);

        JPanel panel = new JPanel();
        panel.setBackground(Color.PINK);
        add(panel);
    }

    public static void main(String[] args) {
        new ExFrame03();
    }
}