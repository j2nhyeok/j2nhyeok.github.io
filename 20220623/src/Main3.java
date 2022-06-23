import javax.swing.JFrame;

class MyFrame extends JFrame{
	public MyFrame(String title) {
		super(title);
		
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
}
public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new MyFrame("나만의 프레임");
		frame.setVisible(true);
		
	}

}
