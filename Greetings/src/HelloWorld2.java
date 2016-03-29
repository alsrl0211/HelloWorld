import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class HelloWorld2 extends JFrame{
	

	
	String name;
	int age;

	
	public HelloWorld2() {
		
		name = "";
		age = 0;
		Container contentPane = getContentPane();
		Frame frame = new Frame();
		setSize(500, 500);
		frame.setTitle("È­¸é");
		setVisible(true);
		JTextField jtxt = new JTextField();
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(null);
		mainPanel.setSize(200, 200);
		mainPanel.setBackground(Color.BLUE);
		jtxt.setBounds(100, 100, 150, 50);
		mainPanel.add(jtxt);
		contentPane.add(mainPanel);
		
	}
	
	
	public void setMember (String name, int age){
		this.name = name;
		this.age = age;
	}

	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	
	
	public static void main(String[] args) {

		 new HelloWorld2();
	}
	
	
	

}
