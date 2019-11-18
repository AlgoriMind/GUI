package TestSwing;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;

import static javax.swing.JFrame.*; 
public class WindowMenu extends JFrame implements ActionListener {

	JMenuBar menubar;
	JMenu menu1,menu2,menu3,menu4,menu5,menu6,menu7,menu8,menu9,menu10,subMenu;
	JMenuItem item1,item2,item3,item4,item5,item6,item7,item8;
	JLabel label0,label1,label2,label3,label4;
	JTextField textfield1;
	JButton button1,button2,button3,button4,button5;
	JPasswordField passwdfield;
	JCheckBox checkbox1,checkbox2;
	ButtonGroup group;
	//ActionListener listener;
	public WindowMenu() {}
	public WindowMenu(String s,int x,int y,int w,int h) {
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
		menubar = new JMenuBar();
		menu1 = new JMenu("File");
		menu2 = new JMenu("Edit");
		menu3 = new JMenu("Source");
		menu4  = new JMenu("Refactor");
		menu5  = new JMenu("Navigate");
		menu6  = new JMenu("Search");
		menu7  = new JMenu("Project");
		menu8  = new JMenu("Run");
		menu9  = new JMenu("Window");
		menu10 = new JMenu("Help");
		subMenu = new JMenu("New");
		item1 = new JMenuItem("Save",new ImageIcon("save.jpg"));
		item2 = new JMenuItem("Save As",new ImageIcon("save_as.jpg"));
		item3 = new JMenuItem("Save All");
		item4 = new JMenuItem("Revert");
		item5 = new JMenuItem("Close");
		item6 = new JMenuItem("Close All");
		item7 = new JMenuItem("Open File..");
		item8 = new JMenuItem("Exit");
		item1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,InputEvent.CTRL_MASK));
		item2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,InputEvent.CTRL_MASK));
		item3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,InputEvent.CTRL_MASK));
		item8.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,InputEvent.CTRL_MASK));
		item4.setAccelerator(KeyStroke.getKeyStroke('A'));
		item5.setAccelerator(KeyStroke.getKeyStroke('B'));
		item6.setAccelerator(KeyStroke.getKeyStroke('C'));
		item7.setAccelerator(KeyStroke.getKeyStroke('D'));
		menu1.add(item1);
		menu1.addSeparator();
		menu1.add(item2);
		menu1.add(item3);
		menu1.add(item4);
		menu1.add(item5);
		menu1.add(item6);
		menu1.add(item7);
		menu1.add(item8);
		menu1.add(subMenu);
		subMenu.add(new JMenuItem("Package",new ImageIcon("a.jag")));
		subMenu.add(new JMenuItem("Class",new ImageIcon("b.jpg")));
		subMenu.add(new JMenuItem("Interface",new ImageIcon("c.jpg")));
		subMenu.add(new JMenuItem("Java Project"));
		subMenu.add(new JMenuItem("Project"));
		subMenu.add(new JMenuItem("Enum"));
		subMenu.add(new JMenuItem("Annotation"));
		subMenu.add(new JMenuItem("Source Floder"));
		subMenu.add(new JMenuItem("Java Working Set"));
		subMenu.add(new JMenuItem("Other"));
		menubar.add(menu1);
		menubar.add(menu2);
		menubar.add(menu3);
		menubar.add(menu4);
		menubar.add(menu5);
		menubar.add(menu6);
		menubar.add(menu7);
		menubar.add(menu8);
		menubar.add(menu9);
		menubar.add(menu10);
		setJMenuBar(menubar);
	}
	void set() {
		setLayout(null);
		label0 = new JLabel(new ImageIcon("./src/images/qq.png"));
		label0.setBounds(0, 0, 500, 130);
		add(label0);
		label1 = new JLabel("账号:");
		label1.setFont(new Font("宋体",0,17));
		label1.setBounds(55, 130, 100, 50);
		add(label1);
		textfield1 = new JTextField();
		textfield1.setBounds(100, 135, 200, 35);
		add(textfield1);
		button1 = new JButton("注册账号");
		button1.setBounds(330, 135, 90, 35);
		button1.setBackground(new Color(100,100,255));
		add(button1);
		button1.addActionListener(this);
		label2 = new JLabel("密码:");
		label2.setFont(new Font("宋体",0,17));
		label2.setBounds(55, 180, 100, 50);
		add(label2);
		passwdfield = new JPasswordField();
		passwdfield.setBounds(100, 185, 200, 35);
		add(passwdfield);
		button2 = new JButton("找回账号");
		button2.setBounds(330, 185, 90, 35);
		button2.setBackground(new Color(100,100,255));
		add(button2);
		checkbox1 = new JCheckBox("记住密码");
		checkbox2 = new JCheckBox("自动登陆");
		checkbox1.setBounds(100, 235, 80, 20);
		checkbox2.setBounds(220, 235, 80, 20);
		add(checkbox1);
		add(checkbox2);
		button3 = new JButton("登陆");
		button3.setBounds(100, 270, 200, 35);
		button3.setBackground(new Color(100,100,255));
		add(button3);
		button3.addActionListener(this);
		button4 = new JButton(new ImageIcon("./src/images/a.png"));
		button4.setBounds(0, 300, 40, 40);
		add(button4);
		button4.addActionListener(this);
		button5 = new JButton(new ImageIcon("./src/images/b.png"));
		button5.setBounds(454, 300, 40, 40);
		add(button5);
		button5.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button4) {
			new OtherFrame("多账号登录",20,30,500,400);
			dispose();
		}
		else if(e.getSource() == button5) {
			new Other1Frame("扫描二维码登录",20,30,500,400);
			dispose();
		}
		else if(e.getSource() == button3) {
			if(textfield1.getText().equals("")==true) {
				new Other3Frame("提示",70,80,300,200);
			}
			else if(new String(passwdfield.getPassword()).equals("")==true) {
				new Other4Frame("提示",70,80,300,200);
			}
			else {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/information?serverTimezone=GMT","root","death65god");
					String number = textfield1.getText();
					String password = new String(passwdfield.getPassword());
					String sql = "select * from demo where number = '" + number + "'";
					PreparedStatement statement =  connection.prepareStatement(sql);
					ResultSet rs = statement.executeQuery();
					if(rs.next()) {
						if(rs.getString("passwd").equals(password)) {
							new Other12Frame("提示",70,80,300,200);
						}
						else {
							new Other2Frame("提示",70,80,300,200);
						}
					}
					else {
						new Other13Frame("提示",70,80,300,200);
					}
					statement.execute();
					statement.close();
					connection.close();
				}catch(Exception ee) {
					ee.printStackTrace();
				}				
			}
		}
		else if(e.getSource() == button1) {
			new Other6Frame("注册账号",20,30,500,400);
		}
	}
}
