package TestSwing;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JLabel;

public class Other9Frame extends JFrame {

	JLabel label0;
	
	public Other9Frame() {}

	public Other9Frame(String s,int x,int y,int w,int h) {
		
		init(s);
		set();
		setLocation(x,y);
		setSize(w,h);
		setBackground(Color.yellow);
		setVisible(true);
		setResizable(false);//���ô������Ͻ����ͼ��
		setIconImage(Toolkit.getDefaultToolkit().getImage("./src/images/g.png"));//�滻����java��ͼ��
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	void init(String s) {
		setTitle(s);
	}
	void set() {
		setLayout(null);
		label0 = new JLabel("��ѡ���·����Ķ�������ٽ���ע��");
		label0.setFont(new Font("����",0,17));
		label0.setBounds(20, 32, 300, 30);
		add(label0);		
	}
}
