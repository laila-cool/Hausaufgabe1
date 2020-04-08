package ufoPack;


//Import the needed packages
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.color.*;
import javax.swing.JFrame;
import ufoPack.UfoShip;



public class UfoBild extends JPanel {
	
	public void paint(Graphics a) {

		setSize(500, 500);
		
		
		a.drawOval(250, 450, 20, 20);
		a.setColor(Color.red);
		a.fillOval(250, 450, 20, 20);
		
		a.drawOval(250, 150, 15, 15);
		a.setColor(Color.white);
		a.fillOval(250, 150, 15, 15);
		
		
		
	
		
	}
	
	
	public static void main(String[] args) {

		//New object for the Frame
		JFrame MainFrame3 = new JFrame();
		
		//Change the background color of the MainFrame3
		MainFrame3.getContentPane().setBackground(Color.black);	
		
		
		//setting the size of the Frame
		MainFrame3.setSize(600, 600);
						
		UfoBild CirclePanel = new UfoBild();
		MainFrame3.add(CirclePanel);
		MainFrame3.setVisible(true);

		UfoShip ship = new UfoShip(600, 600, 200, 200, "C:\\Users\\Ilaf\\eclipse-workspace\\P2\\src\\Ufopic.jpg" );
	}

}
