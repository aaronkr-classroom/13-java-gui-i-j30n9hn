import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    public Frame() {
        setTitle("프레임 아이콘");
        setSize(400, 200);

        JPanel panel = new JPanel();
        panel.setBackground(Color.PINK);
        add(panel);

        setIconImage(new ImageIcon("cat.png").getImage());
        setVisible(true);

    }

    public static void main(String[] args) {
        new Frame();
    }
}
