import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main6 extends JFrame {

	public Main6() {
		JPanel pnl = new JPanel();
//		FlowLayout flow = new FlowLayout(FlowLayout.RIGHT);
//		pnl.setLayout(flow);
		BorderLayout border = new BorderLayout();
		pnl.setLayout(border);
		
		JButton btn1 = new JButton("버튼 1");
		JButton btn2 = new JButton("버튼 2");
		JButton btn3 = new JButton("버튼 3");
		

		pnl.add(btn1,"North");
		pnl.add(btn2, BorderLayout.CENTER);
		pnl.add(btn3, BorderLayout.SOUTH);
		
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Main6().setVisible(true);

	}

}
