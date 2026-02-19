package ch18;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main18_5 {

	public static void main(String[] args) {
		JFrame fream = new JFrame("はじめてのGUI");
		JLabel label = new JLabel("Heiio World!");
		JButton button = new JButton("押す");
		fream.getContentPane().setLayout(new FlowLayout());
		fream.getContentPane().add(label);
		fream.getContentPane().add(button);
		fream.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fream.setSize(300,100);
		fream.setVisible(true);
	}

}
