import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyCounter extends JFrame {
	private int number = 0;
	
	public MyCounter() {
		super("카운터");
		
		JPanel pnl = new JPanel();
		JLabel lbl = new JLabel("0");
		
		JButton btn = new JButton("증가");
		JButton btn2 = new JButton("감소");
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
					number++;// TODO Auto-generated method stub
				lbl.setText(String.valueOf(number));
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
					number--;// TODO Auto-generated method stub
				lbl.setText(String.valueOf(number));
			}
		});
		pnl.add(lbl);
		pnl.add(btn);
		pnl.add(btn2);
		
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyCounter().setVisible(true);
	}

}
