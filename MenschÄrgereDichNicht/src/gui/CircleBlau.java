package gui;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.color.*;
import java.awt.geom.Ellipse2D;

class CircleBlau extends JPanel 
{
	public void paintComponent(Graphics g)
	{
		int rr;
		int gg;
		int b;
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(new Color(rr = 204, gg = 164, b = 96));
		g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
		g2d.setColor(Color.BLACK);
		int mx = 30;
		int my = 30;
		int r = 30;
		Ellipse2D.Double auﬂenkreis = new Ellipse2D.Double(mx - r, my - r, 2 * r, 2 * r);
		g2d.draw(auﬂenkreis);
		g2d.fill(auﬂenkreis);
		g2d.setColor(Color.BLUE);
		mx = 30;
		my = 30;
		r = 27;
		Ellipse2D.Double kreis = new Ellipse2D.Double(mx - r, my - r, 2 * r, 2 * r);
		g2d.draw(kreis);
		g2d.fill(kreis);
	}
}
