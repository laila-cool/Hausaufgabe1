//Import the needed packages
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.color.*;


public class WaitingSymbol extends JPanel {
	
	public void paint(Graphics r) {

		setSize(500, 500);

		
		r.drawOval(100, 97, 15, 15);
		r.setColor(Color.black);
		r.fillOval(100, 97, 15, 15);
		
		r.drawOval(120, 83, 20, 20);
		r.setColor(Color.black);
		r.fillOval(120,83,20,20);
		
		r.drawOval(142, 93, 20, 20);
		r.setColor(Color.black);
		r.fillOval(142, 93, 20, 20);
		
		r.drawOval(152, 118, 12, 12);
		r.setColor(Color.black);
		r.fillOval(152, 118, 12, 12);
		
		r.drawOval(144, 135, 12, 12);
		r.setColor(Color.black);
		r.fillOval(144, 135, 12, 12);
		
		r.drawOval(124, 141, 12, 12);
		r.setColor(Color.black);
		r.fillOval(124, 141, 12, 12);
		
		r.drawOval(105, 135, 12, 12);
		r.setColor(Color.black);
		r.fillOval(105, 135, 12, 12);
		
		r.drawOval(95, 118, 12, 12);
		r.setColor(Color.black);
		r.fillOval(95, 118, 12, 12);
	}

	public static void main(String[] args) {

		//New object for the Frame
		JFrame MainFrame2 = new JFrame();
				
		//setting the size of the Frame
		MainFrame2.setSize(600, 600);
				
				
		WaitingSymbol CirclePanel = new WaitingSymbol();
		MainFrame2.add(CirclePanel);
		MainFrame2.setVisible(true);

	}
}

