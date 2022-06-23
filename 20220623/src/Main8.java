import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
 
public class Main8 extends JFrame {
	public static int a, b = 0;
	public static int success = 0;
	public static int fail = 0;
	
    public static void main(String[] args) {
 
        // ������ ����
        JFrame frm = new JFrame("������ ��ġ�ϱ�");
 
        // ������ ũ�� ����
        frm.setSize(350, 300);
 
        // �������� ȭ�� ����� ��ġ
        frm.setLocationRelativeTo(null);
 
        // �������� �ݾ��� �� �޸𸮿��� ���ŵǵ��� ����
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        // ���̾ƿ� ����
        frm.getContentPane().setLayout(null);
 
        // ��ư ����
        JButton btn1 = new JButton("Ȯ��");

 
        // �� ��ư ��ġ�� ũ�� ����
        btn1.setBounds(150, 170, 100, 30);

        JLabel lal1 = new JLabel(random());
        JLabel lal2 = new JLabel("���� ���� : " + String.valueOf(success));
        JLabel lal3 = new JLabel("Ʋ�� ���� : " +  String.valueOf(fail));
        
        lal1.setBounds(100, 50, 100, 30);
        lal2.setBounds(220, 50, 90, 30);
        lal3.setBounds(220, 70, 90, 30);
      
        JTextField text1 =new JTextField();
        text1.setBounds(30, 170, 100, 30);
        // �� �����ӿ��ٰ� ��ư �߰�
        frm.getContentPane().add(btn1);
        frm.getContentPane().add(lal1);
        frm.getContentPane().add(lal2);
        frm.getContentPane().add(lal3);
        frm.getContentPane().add(text1);
        // �������� ���̵��� ����
        
   
        btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int answer = a + b;
				if(answer == Integer.parseInt(text1.getText())) {
					success++;
					lal2.setText("���� ���� : " + String.valueOf(success));
					lal3.setText("Ʋ�� ���� : " +  String.valueOf(fail));
					JOptionPane.showMessageDialog(null, "�����Դϴ�.");
					lal1.setText(random());
					
					System.out.println(e.getActionCommand());
				} else {
					fail++;
					lal2.setText("���� ���� : " + String.valueOf(success));
					lal3.setText("Ʋ�� ���� : " +  String.valueOf(fail));
					JOptionPane.showMessageDialog(null, "��ž�Դϴ�.");
				
				}


				System.out.println(e.getActionCommand());
			}
		});

	   
		
        frm.setVisible(true);
 }
 
    
    
    public static String random() {
    	Random r = new Random();
    	
    	a = 1 + r.nextInt(11);
    	b = 1 + r.nextInt(11);
    	
    	return a + " + " + b + " = ?";
    }
 
}
 
