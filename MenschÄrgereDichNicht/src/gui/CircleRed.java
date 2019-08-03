package gui;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.color.*;
import java.awt.geom.Ellipse2D;

//Klasse zum zeichen eines roten Kreises mit schwarzem Rand in einem Jpanel mit passender Hintergrundfarbe zum Hauptfenster

class CircleRed extends JPanel
{
	public void paintComponent(Graphics g)
	{
		int rr;													// Integer Variablen für die Hintergrundfarbe des Hauptfensters
		int gg;
		int b;
		Graphics2D g2d = (Graphics2D) g;						
		g2d.setColor(new Color(rr = 204, gg = 164, b = 96));	
		g2d.fillRect(0, 0, this.getWidth(), this.getHeight());	
		g2d.setColor(Color.BLACK);
		int mx = 30;											// Koordinaten und Radius für die Ellipse
		int my = 30;
		int r = 30;
		Ellipse2D.Double außenkreis = new Ellipse2D.Double(mx - r, my - r, 2 * r, 2 * r);
		g2d.draw(außenkreis);									// Ellipse mit Maß eines Kreises zeichnen
		g2d.fill(außenkreis);									// Ellipse schwaz füllen
		g2d.setColor(Color.RED);								// eine zweite Ellipse wird gezeichnet inmitten der ersten mit der Farbe rot und einen etwas kleineren Radius
		mx = 30;												// dadurch der Effekt der schwarzen Umrandung
		my = 30;
		r = 27;
		Ellipse2D.Double kreis = new Ellipse2D.Double(mx - r, my - r, 2 * r, 2 * r);
		g2d.draw(kreis);
		g2d.fill(kreis);
	}
}
