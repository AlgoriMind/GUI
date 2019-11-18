package TestSwing;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.util.Random;

import javax.swing.JLabel;

public class Other11Frame extends JFrame {
	
	JLabel label0,label1,label2;
	
	public Other11Frame() {}
	
	public Other11Frame(String s,int x,int y,int w,int h) {
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
		label0 = new JLabel("��ϲ����ע��ɹ�");
		label0.setFont(new Font("����",0,17));
		label0.setForeground(Color.red);
		label0.setBounds(20, 22, 300, 30);
		add(label0);
		label1 = new JLabel(number());
		label1.setFont(new Font("����",0,17));
		label1.setForeground(Color.blue);
		label1.setBounds(130, 60, 300, 30);
		add(label1);
		label2 = new JLabel("�����˺�Ϊ:");
		label2.setFont(new Font("����",0,17));
		label2.setForeground(Color.red);
		label2.setBounds(20, 60, 100, 30);
		add(label2);
	}
	public String number() {
		int[] a = new int[10];
		Random random = new Random();
		String str = new String();
		for(int i=0;i<10;i++) {
			a[i] = random.nextInt(10);
			str = str + String.valueOf(a[i]);
		}
		return str;
	}
}
