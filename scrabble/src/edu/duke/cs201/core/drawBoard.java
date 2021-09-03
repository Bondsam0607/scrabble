package edu.duke.cs201.core;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import edu.duke.cs201.core.parseText;

public class drawBoard implements Runnable{
	JFrame f;
	Thread t = null;
	JPanel panel;

	public drawBoard() {
		f = new JFrame();
		t = new Thread(this);
		t.start();
		panel = new JPanel();
		f.add(panel);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		f.setResizable(false);
	}

	public void run() {
		try {
			while (true) {
				parseText pt = new parseText("../resources/board.txt");
				char [][]chars = pt.parseFile();
				int size = chars.length;
				for (int i=0; i<size; i++) {
					for (int j=0; j<size; j++) {
						if (chars[i][j] == '@') {
							ImageIcon icon_blue = new ImageIcon("../resources/blue_block.png");
							JLabel label_blue = new JLabel(icon_blue);
							panel.add(label_blue);
						}
						else if (chars[i][j] == '#') {
							ImageIcon icon_red = new ImageIcon("../resources/red_block.png");
							JLabel label_red = new JLabel(icon_red);
							panel.add(label_red);
						}
						else {
							ImageIcon icon_blank = new ImageIcon("../resources/letters/"+ Character.toString(chars[i][j]) + ".png");
							JLabel label_blank = new JLabel(icon_blank);
							panel.add(label_blank);
						}
					}
				}
				panel.setLayout(new GridLayout(size, size));
				f.pack();
				t.sleep(1000);
				panel.removeAll();
			}
		} catch (Exception e) {}
	}


	public static void main(String args[]) {
		new drawBoard();
	}
}
