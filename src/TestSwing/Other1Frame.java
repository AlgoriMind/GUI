package TestSwing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Other1Frame extends JFrame implements ActionListener{
	
	JLabel label0,label1;
	JButton button0,button1,button2;
	
	public Other1Frame() {}
	public Other1Frame(String s,int x,int y,int w,int h) {
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
		label0 = new JLabel("��");
		label0.setFont(new Font("����",0,17));
		label0.setBounds(115, 35, 100, 50);
		add(label0);
		button0 = new JButton(new ImageIcon("./src/images/e.png"));
		button0.setBounds(132, 51, 86, 18);
		add(button0);
		label1 = new JLabel("ɨ���ά�밲ȫ��½");
		label1.setFont(new Font("����",0,17));
		label1.setBounds(218, 34, 170, 55);
		add(label1);
		button1 = new JButton(new ImageIcon("./src/images/f.png"));
		button1.setBounds(152, 100, 150, 150);
		add(button1);
		button2 = new JButton("����");
		button2.setBackground(new Color(100,100,255));
		button2.setBounds(128, 300, 200, 35);
		add(button2);
		button2.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button2) {
			new WindowMenu("",20,30,500,400);
			dispose();
		}
		else if(e.getSource()==button1) {
			
		}
	}
}
