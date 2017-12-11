package tw.edu.cyut.myjava;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Cyut02 extends JFrame {
	private JButton open, save, exit;
	
	
	public Cyut02() {
		super("°¸ªºµøµ¡");
		
		open = new JButton("Open");
		save = new JButton("Save");
		exit = new JButton("Exit");
		
		setLayout(new FlowLayout());
		add(open); add(save); add(exit);
		
		
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Cyut02();
	}

}
