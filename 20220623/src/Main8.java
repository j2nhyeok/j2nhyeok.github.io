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
 
        // 프레임 생성
        JFrame frm = new JFrame("슬라임 퇴치하기");
 
        // 프레임 크기 설정
        frm.setSize(350, 300);
 
        // 프레임을 화면 가운데에 배치
        frm.setLocationRelativeTo(null);
 
        // 프레임을 닫았을 때 메모리에서 제거되도록 설정
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        // 레이아웃 설정
        frm.getContentPane().setLayout(null);
 
        // 버튼 생성
        JButton btn1 = new JButton("확인");

 
        // ★ 버튼 위치와 크기 설정
        btn1.setBounds(150, 170, 100, 30);

        JLabel lal1 = new JLabel(random());
        JLabel lal2 = new JLabel("맞힌 갯수 : " + String.valueOf(success));
        JLabel lal3 = new JLabel("틀린 갯수 : " +  String.valueOf(fail));
        
        lal1.setBounds(100, 50, 100, 30);
        lal2.setBounds(220, 50, 90, 30);
        lal3.setBounds(220, 70, 90, 30);
      
        JTextField text1 =new JTextField();
        text1.setBounds(30, 170, 100, 30);
        // ★ 프레임에다가 버튼 추가
        frm.getContentPane().add(btn1);
        frm.getContentPane().add(lal1);
        frm.getContentPane().add(lal2);
        frm.getContentPane().add(lal3);
        frm.getContentPane().add(text1);
        // 프레임이 보이도록 설정
        
   
        btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int answer = a + b;
				if(answer == Integer.parseInt(text1.getText())) {
					success++;
					lal2.setText("맞힌 갯수 : " + String.valueOf(success));
					lal3.setText("틀린 갯수 : " +  String.valueOf(fail));
					JOptionPane.showMessageDialog(null, "정답입니다.");
					lal1.setText(random());
					
					System.out.println(e.getActionCommand());
				} else {
					fail++;
					lal2.setText("맞힌 갯수 : " + String.valueOf(success));
					lal3.setText("틀린 갯수 : " +  String.valueOf(fail));
					JOptionPane.showMessageDialog(null, "오탑입니다.");
				
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
 
