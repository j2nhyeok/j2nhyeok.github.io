import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame2 extends JFrame{
	public MyFrame2() {
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		

		JButton button = new JButton("��ư");
		JButton button2 = new JButton("��ư2");
		
		setLayout(new FlowLayout());
		add(button);
		add(button2);
		setVisible(true);
	}
}

public class MyFrameTest1 {

	public static void main(String[] args) {
		MyFrame2 f = new MyFrame2();

	}

}
