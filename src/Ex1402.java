import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class Ex1402 {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		frame.setTitle("GUI");
		frame.setSize(600, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		frame.add(panel);
		
		JButton btn1 = new JButton("one");
		JButton btn2 = new JButton("two");
		JButton btn3 = new JButton("three");
		btn1.setSize(64, 64);
		btn2.setSize(64, 64);
		btn3.setSize(64, 64);
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		
		JCheckBox box1 = new JCheckBox("Subscribe to newsletter?");
		JCheckBox box2 = new JCheckBox("Receive SMS marketing?", true);
		JCheckBox box3 = new JCheckBox("Receive email marketing?");
		panel.add(box1);
		panel.add(box2);
		panel.add(box3);
		
		JRadioButton rbox1 = new JRadioButton("1학년");
		JRadioButton rbox2 = new JRadioButton("2학년", true);
		JRadioButton rbox3 = new JRadioButton("3학년");
		JRadioButton rbox4 = new JRadioButton("4학년");
		JRadioButton rbox5 = new JRadioButton("기타");
		panel.add(rbox1);
		panel.add(rbox2);
		panel.add(rbox3);
		panel.add(rbox4);
		panel.add(rbox5);
		
		String email[] = {"naver.com", "google.com", "kakao.com"};
		JComboBox cbox1 = new JComboBox(email);
		panel.add(cbox1);
		
		Vector phone = new Vector();
		phone.add("SKT");
		phone.add("KT");
		phone.add("LG U+");
		JComboBox cbox2 = new JComboBox(phone);
		panel.add(cbox2);
		
		JLabel msg = new JLabel("메시지를 입력하세요: ");
		panel.add(msg);
		JTextArea msgtxt = new JTextArea(5, 10);
		panel.add(msgtxt);
		
		JLabel unameLBl = new JLabel("username: ");
		panel.add(unameLBl);
		JTextField uname = new JTextField(10);
		panel.add(uname);
		
		JLabel upwLBl = new JLabel("password: ");
		panel.add(upwLBl);
		JTextField upw = new JTextField(10);
		panel.add(upw);
		
		frame.setVisible(true);
	}
}