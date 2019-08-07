package gui;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;


class BackgroundPanel extends JPanel
{
	private static final long serialVersionUID = 1L;
	private Image img;

	public BackgroundPanel() 
	{
		try 
		{
			img = ImageIO.read(new File("bild.jpg"));
			System.out.println("Picture loaded.");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Picture was not found.");
		}
	}

	@Override
	protected void paintComponent(Graphics g)
	{
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.drawImage(img, 0, 0, java.awt.Toolkit.getDefaultToolkit().getScreenSize().width,java.awt.Toolkit.getDefaultToolkit().getScreenSize().height,null);
	}
	public Image getBackgroundImage() 
	{
		return img;
	}
}