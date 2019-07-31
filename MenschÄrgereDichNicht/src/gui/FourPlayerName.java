package gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FourPlayerName extends JFrame 
{
	private JLabel jLabel1 = new JLabel();
	private JLabel jLabel2 = new JLabel();
	private JTextField jTextField1 = new JTextField();
	private JButton button = new JButton();
	private JLabel jLabel3 = new JLabel();
	private JTextField jTextfield2 = new JTextField();
	private JLabel lSpieler3 = new JLabel();
	private JTextField jTextField3 = new JTextField();
	private JLabel lSpieler4 = new JLabel();
	private JTextField jTextField4 = new JTextField();
	
	public FourPlayerName()
	{
		super("Spielernamen");
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		int frameWidth = 300;											// Größe des Spielfensters
		int frameHeight = 300;
		setSize(frameWidth, frameHeight);	
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();		// Fenster wird mittig ausgerichtet
		int x = (d.width - getSize().width) / 2;
		int y = (d.height - getSize().height) / 2;
		setLocation(x, y);
		Container cp = getContentPane();								// Container für Fenstervariablen				
		cp.setLayout(null);
		cp.setBackground(Color.WHITE);
		jLabel1.setBounds(20, 0, 261, 44);
	    jLabel1.setText("Hier können Sie die Spielernamen eingeben.");
	    cp.add(jLabel1);
	    
	    jLabel2.setBounds(16, 56, 62, 20);
	    jLabel2.setText("Spieler 1 :");
	    cp.add(jLabel2);
	    jTextField1.setBounds(80, 56, 150, 20);
	    cp.add(jTextField1);
	    button.setBounds(93, 206, 115, 25);
	    button.setText("Spiel starten");
	    button.setMargin(new Insets(2, 2, 2, 2));
	    button.addActionListener(new ActionListener()
	    { 
	      public void actionPerformed(ActionEvent evt)
	      { 
	        button_ActionPerformed(evt);
	      }
		private void button_ActionPerformed(ActionEvent evt) 
		{
			new Playground();
			dispose();
		}
	    });
	    cp.add(button);
	    jLabel3.setBounds(16, 96, 62, 20);
	    jLabel3.setText("Spieler 2 :");
	    cp.add(jLabel3);
	    jTextfield2.setBounds(80, 96, 150, 20);
	    cp.add(jTextfield2);
	    lSpieler3.setBounds(16, 136, 62, 20);
	    lSpieler3.setText("Spieler 3 :");
	    cp.add(lSpieler3);
	    cp.add(lSpieler3);
	    jTextField3.setBounds(80, 136, 150, 20);
	    cp.add(jTextField3);
	    lSpieler4.setBounds(16, 176, 62, 20);
	    lSpieler4.setText("Spieler 4 :");
	    cp.add(lSpieler4);
	    jTextField4.setBounds(80, 176, 150, 20);
	    cp.add(jTextField4);
	}
	
}