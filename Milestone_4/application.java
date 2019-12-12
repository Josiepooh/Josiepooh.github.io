package category_one;

import javax.swing.*;

import category_one.UserInterfacePanel;

public class application {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Application Manager");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		UserInterfacePanel panel = new UserInterfacePanel();
		frame.getContentPane().add(panel);
		
		frame.pack();
		frame.setVisible(true);
	}
	
}