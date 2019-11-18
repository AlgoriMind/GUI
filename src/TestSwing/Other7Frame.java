package TestSwing;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JLabel;

public class Other7Frame extends JFrame {
	
	JLabel label0;
	
	public Other7Frame() {}

	public Other7Frame(String s,int x,int y,int w,int h) {
		
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
		label0 = new JLabel("请您输入密码后再进行注册");
		label0.setFont(new Font("宋体",0,17));
		label0.setBounds(20, 32, 250, 30);
		add(label0);
	}
}
