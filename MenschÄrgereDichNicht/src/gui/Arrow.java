package gui;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

class Arrow extends JComponent {
	public String string;
	public BasicStroke thick = new BasicStroke(3f);
	public Arrow(String string) {
		this.string = string;
	}
	
	public void paint(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setStroke(thick);
		g.setColor(Color.BLACK);
		if (string.contentEquals("red")) {
			g.drawLine(50, 25, 127, 25);
			g.drawLine(127, 25, 100, 40);
			g.drawLine(127, 25, 100, 10);
		}
		if (string.contentEquals("blue")) {
			g.drawLine(25, 50, 25, 125);
			g.drawLine(25, 127, 40, 100);
			g.drawLine(25, 127, 10, 100);
		}
		if (string.contentEquals("green")) {
			g.drawLine(50, 25, 125, 25);
			g.drawLine(50, 25, 77, 40);
			g.drawLine(50, 25, 77, 10);
		}
		if (string.contentEquals("yellow")) {
			g.drawLine(25, 50, 25, 125);
			g.drawLine(25, 50, 40, 77);
			g.drawLine(25, 50, 10, 77);
		}
	}
}