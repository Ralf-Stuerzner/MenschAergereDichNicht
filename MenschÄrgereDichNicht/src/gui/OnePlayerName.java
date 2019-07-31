package gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class OnePlayerName extends JFrame
{
	private JLabel textfield1 = new JLabel();
	private JLabel textfield2 = new JLabel();
	private JTextField jTextField1 = new JTextField();
	private JButton button = new JButton();
	public OnePlayerName()
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
		textfield1.setBounds(20, 0, 261, 44);
	    textfield1.setText("Hier können Sie die Spielernamen eingeben.");
	    cp.add(textfield1); 
	    textfield2.setBounds(16, 56, 62, 20);
	    textfield2.setText("Spieler 1 :");
	    cp.add(textfield2);
	    jTextField1.setBounds(82, 58, 150, 20);
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
			//LoadGui.setPlayerOneNameString(jTextField1.getText());
			LoadGui.setPlayerOneNameString(jTextField1.getText());
			Playground playground = new Playground();
			dispose();
		}
	    });
	    cp.add(button);
	}
}