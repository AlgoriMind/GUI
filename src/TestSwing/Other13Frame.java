package TestSwing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Other13Frame extends JFrame{
	
	JLabel label0;
	
	public Other13Frame() {}
	public Other13Frame(String s,int x,int y,int w,int h) {
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
		label0 = new JLabel("��������˺Ų�����,��ע����ٵ�¼");
		label0.setFont(new Font("����",0,17));
		label0.setForeground(Color.red);
		label0.setBounds(20, 32, 340, 30);
		add(label0);
	}
}