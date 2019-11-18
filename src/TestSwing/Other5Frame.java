package TestSwing;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Other5Frame extends JFrame implements ActionListener{
	
	JLabel label0;
	JTextField textfield1;
	JPasswordField passwdfield;
	JButton button1,button2;
	
	public Other5Frame() {}
	
	public Other5Frame(String s,int x,int y,int w,int h) {
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
		textfield1 = new JTextField();
		textfield1.setBounds(170, 195, 200, 35);
		add(textfield1);
		passwdfield = new JPasswordField();
		passwdfield.setBounds(170, 235, 200, 35);
		add(passwdfield);
		button1 = new JButton(new ImageIcon("./src/images/h.png"));
		button1.setBounds(170, 280, 90, 30);
		add(button1);
		button2 = new JButton(new ImageIcon("./src/images/i.png"));
		button2.setBounds(280, 280, 90, 30);
		add(button2);
		button2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		new OtherFrame("多账号登录",20,30,500,400);
		dispose();
	}
}
