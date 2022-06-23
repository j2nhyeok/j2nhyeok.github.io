import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyActionListener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("사용자가 클릭 했네요~~");
	}
}
public class MyColorFrame extends JFrame{
	public MyColorFrame() {
		super("색깔 있는 프레임");
		
		JPanel pnl = new JPanel();
		pnl.setBackground(Color.RED);
		
		
		
		JButton btn = new JButton("컨테이너안의 버튼");
		

		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				pnl.setBackground(Color.BLUE);
				
			}
		});
		
		pnl.add(btn);
		add(pnl);
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		MyColorFrame f = new MyColorFrame();
		f.setVisible(true);

	}

}
