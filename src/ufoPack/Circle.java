package ufoPack;

//Import the needed packages
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.color.*;

public class Circle extends JPanel {

	public void paint(Graphics g) {

		setSize(500, 500);

		// Draw the biggest circle and fill it black
		g.drawOval(100, 100, 100, 100);
		g.setColor(Color.black);
		g.fillOval(100, 100, 100, 100);

		// Draw the inner circle and fill it white
		g.drawOval(104, 104, 92, 92);
		g.setColor(Color.white);
		g.fillOval(104, 104, 92, 92);

		// Draw the inner circle and fill it black
		g.drawOval(125, 125, 50, 50);
		g.setColor(Color.black);
		g.fillOval(125, 125, 50, 50);

		// Draw the inner circle and fill it white
		g.drawOval(129, 129, 42, 42);
		g.setColor(Color.white);
		g.fillOval(129, 129, 42, 42);

		// Draw the inner dot
		g.drawOval(148, 148, 4, 4);
		g.setColor(Color.black);
		g.fillOval(146, 146, 8, 8);

	}

	public static void main(String[] args) {

		JFrame MainFrame = new JFrame();
		MainFrame.setSize(600, 600);
		Circle CirclePanel = new Circle();
		MainFrame.add(CirclePanel);
		MainFrame.setVisible(true);

	}
}
