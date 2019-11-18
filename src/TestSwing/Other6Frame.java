package TestSwing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class Other6Frame extends JFrame implements ActionListener {
	
	JLabel label1,label2,label3;
	JPasswordField passwdfield1,passwdfield2;
	JButton button1;
	JCheckBox checkbox1;
	
	public Other6Frame() {}
	
	public Other6Frame(String s,int x,int y,int w,int h) {
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
		label1 = new JLabel("��ӭע���˺�");
		label1.setFont(new Font("����",1,35));
		label1.setForeground(Color.red);
		label1.setBounds(130, 10, 300, 35);
		add(label1);
		label2 = new JLabel("����������");
		label2.setFont(new Font("����",0,17));
		label2.setForeground(Color.blue);
		label2.setBounds(50, 110, 200, 25);
		add(label2);
		passwdfield1 = new JPasswordField();
		passwdfield1.setBounds(155, 105, 200, 35);
		add(passwdfield1);
		label3 = new JLabel("��ȷ������");
		label3.setFont(new Font("����",0,17));
		label3.setForeground(Color.blue);
		label3.setBounds(50, 175, 200, 25);
		add(label3);
		passwdfield2 = new JPasswordField();
		passwdfield2.setBounds(155, 170, 200, 35);
		add(passwdfield2);
		button1 = new JButton("����ע��");
		button1.setBackground(new Color(100,100,255));
		button1.setBounds(155, 250, 200, 35);
		add(button1);
		button1.addActionListener(this);
		checkbox1 = new JCheckBox("�����Ķ���ͬ����ط����������˽����");
		checkbox1.setSelected(true);
		checkbox1.setBounds(152, 310, 270, 20);
		add(checkbox1);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button1) {
			if(new String(passwdfield1.getPassword()).equals("")==true) {
				new Other7Frame("��ʾ",70,80,300,200);
			}
			else if(new String(passwdfield2.getPassword()).equals("")==true) {
				new Other8Frame("��ʾ",70,80,300,200);
			}
			else if(checkbox1.isSelected() == false) {
				new Other9Frame("��ʾ",70,80,300,200);
			}
			else if(new String(passwdfield1.getPassword()).equals(new String(passwdfield2.getPassword())) == false) {
				new Other10Frame("��ʾ",70,80,300,200);
			}
			else if(new String(passwdfield1.getPassword()).equals(new String(passwdfield2.getPassword())) == true) {
				Other11Frame other11frame = new Other11Frame("��ʾ",70,80,300,200);
				TestMySQL testmysql= new TestMySQL(); 
				testmysql.insert(other11frame.label1.getText(), new String(passwdfield1.getPassword()));
				testmysql.select();
			}
		}
	}

	private char[] number() {
		// TODO Auto-generated method stub
		return null;
	}
}
