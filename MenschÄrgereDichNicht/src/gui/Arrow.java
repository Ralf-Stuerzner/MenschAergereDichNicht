package gui;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Line2D.Double;

class Arrow extends JComponent
{
	public void paintComponent(Graphics g)
	{
		int mx = 0;
		int my = 0;
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		Line2D.Double line = new Line2D.Double(mx,my,100,100);
		g2d.setColor(Color.BLACK);
		g2d.setPaintMode();
		g2d.draw(line);
		g2d.fill(line);
	}
}