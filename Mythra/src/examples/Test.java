package examples;

import javax.swing.JFrame;

import com.github.spocot.mythra.MythraPanel;

public class Test {

	public static void main(String[] args){
		JFrame frame = new JFrame("Mythra Test");
		frame.setSize(500,500);
		frame.add(new MythraPanel(500,500));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
