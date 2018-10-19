package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		addNumbers.addActionListener((e)->{
			String s = JOptionPane.showInputDialog("Choose an integer");
			int i = Integer.parseInt(s);
			String s2 = JOptionPane.showInputDialog("Choose another integer!");
			int i2 = Integer.parseInt(s2);
			System.out.println(i+i2);
		});
		tellAJoke.addActionListener((e)->{
			System.out.println("Why did the chicken NOT cross the road");
			System.out.println("Cuz Colonel Sanders was on the other side");
		});
		randNumber.addActionListener((e)->{
			int i = new Random().nextInt();
			System.out.println(i);
		});
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}
	
	
}
