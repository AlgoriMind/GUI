package TestSwing;

import java.awt.Color;
import java.awt.Container;


public class TestSwing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TestMySQL mysql = new TestMySQL();		
		//mysql.delete("8950990020");
		WindowMenu win = new WindowMenu("",20,30,500,400);
		Container con = win.getContentPane();
		con.setBackground(Color.white);
	}
}