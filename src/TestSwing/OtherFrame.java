package TestSwing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class OtherFrame extends JFrame implements ActionListener{
	
	JLabel label0;
	JButton button1,button2,button3,button4;
	
	
	
	public OtherFrame() {}
	public OtherFrame(String s,int x,int y,int w,int h)
	{
		init(s);
		set();
		setLocation(x,y);
		setSize(w,h);
		setBackground(Color.yellow);
		setVisible(true);
		setResizable(false);//禁用窗口右上角最大化图标
		setIconImage(Toolkit.getDefaultToolkit().getImage("./src/images/g.png"));//替换窗口java的图标
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	void init(String s) {
		setTitle(s);	
	}
	void set() {
		setLayout(null);
		label0 = new JLabel(new ImageIcon("./src/images/qq1.png"));
		label0.setBounds(0, 0, 500, 180);
		add(label0);
		button1 = new JButton(new ImageIcon("./src/images/c.png"));
		button1.setBounds(180, 215, 130, 35);
		add(button1);
		button1.addActionListener(this);
		button2 = new JButton("登陆");
		button2.setBackground(new Color(100,100,255));
		button2.setBounds(145, 300, 200, 35);
		add(button2);
		button3 = new JButton(new ImageIcon("./src/images/d.png"));
		button3.setBounds(0, 325, 40, 40);
		add(button3);
		button3.addActionListener(this);
		button4 = new JButton(new ImageIcon("./src/images/b.png"));
		button4.setBounds(454, 325, 40, 40);
		add(button4);
		button4.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button3) {
			new WindowMenu("",20,30,500,400);
			dispose();
		}
		else if(e.getSource() == button4) {
			new Other1Frame("扫描二维码登陆",20,30,500,400);
			dispose();
		}
		else if(e.getSource() == button1) {
			new Other5Frame("",20,30,500,400);
			dispose();
		}
	}
}
