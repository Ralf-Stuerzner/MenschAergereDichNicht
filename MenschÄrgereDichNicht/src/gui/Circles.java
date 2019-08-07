package gui;

import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

class Circles extends JComponent {
	public Color color;
	public String number;
	public String letter;

	public Circles(Color color, String number, String letter) 
	{
		this.color = color;
		this.number = number;
		this.letter = letter;
	}

	public void paintComponent(Graphics g) 
	{
		int mx;
		int my;
		int r;
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		if (number.isEmpty()) 
		{

			g2d.setColor(Color.BLACK);
			mx = 30;
			my = 30;
			r = 30;
			Ellipse2D.Double auﬂenkreis = new Ellipse2D.Double(mx - r, my - r, 2 * r, 2 * r);
			g2d.draw(auﬂenkreis);
			g2d.fill(auﬂenkreis);
			g2d.setColor(color);
			mx = 30;
			my = 30;
			r = 27;
			Ellipse2D.Double kreis = new Ellipse2D.Double(mx - r, my - r, 2 * r, 2 * r);
			g2d.draw(kreis);
			g2d.fill(kreis);
			g2d.setColor(Color.BLACK);
			Font arial = new Font("Arial", Font.BOLD, 22);
			g2d.setFont(arial);
			g2d.drawString(letter, 25, 38);
		} else
		{
			g2d.setColor(Color.BLACK);
			mx = 30;
			my = 30;
			r = 22;
			Ellipse2D.Double auﬂenkreis = new Ellipse2D.Double(mx - r, my - r, 2 * r, 2 * r);
			g2d.draw(auﬂenkreis);
			g2d.fill(auﬂenkreis);
			g2d.setColor(color);
			mx = 30;
			my = 30;
			r = 18;
			Ellipse2D.Double kreis = new Ellipse2D.Double(mx - r, my - r, 2 * r, 2 * r);
			g2d.draw(kreis);
			g2d.fill(kreis);
			g2d.setColor(Color.BLACK);
			Font arial = new Font("Arial", Font.BOLD, 20);
			g2d.setFont(arial);
			g2d.drawString(number, 25, 38);
		}
	}
}
