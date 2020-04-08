package ufoPack;
//Import the needed packages
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.color.*;

public class CircleDown extends JPanel {

	public void paint(Graphics l) {

		setSize(500, 500);
		
		//Draw 1. circle and fill it black
		l.drawOval(100, 100, 100, 100);
		l.setColor(Color.black);
		l.fillOval(100, 100, 100, 100);

		//Draw 1. circle and fill it white
		l.drawOval(104, 104, 92, 92);
		l.setColor(Color.white);
		l.fillOval(104, 104, 92, 92);
		
		//Draw 2. circle and fill it black
		l.drawOval(110, 120, 80 , 80);
		l.setColor(Color.black);
		l.fillOval(110, 120, 80, 80);
		
		//Draw 2. circle and fill it white
		l.drawOval(114,124, 72, 72);
		l.setColor(Color.white);
		l.fillOval(114, 124, 72, 72);
		
		//Draw 3. circle and fill it black
		l.drawOval(125, 148, 50, 50);
		l.setColor(Color.black);
		l.fillOval(125, 148, 50, 50);
		
		//Draw 3. circle and fill it white
		l.drawOval(129, 152, 42, 42);
		l.setColor(Color.white);
		l.fillOval(129, 152, 42, 42);
		
		

	}

	public static void main(String[] args) {

		//New object for the Frame
		JFrame MainFrame1 = new JFrame();
		
		//setting the size of the Frame
		MainFrame1.setSize(600, 600);
		
		
		CircleDown CirclePanel = new CircleDown();
		MainFrame1.add(CirclePanel);
		MainFrame1.setVisible(true);

	}
}
