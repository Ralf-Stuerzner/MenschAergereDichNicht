package gui;
import java.awt.Color;
import java.awt.Container;
import java.awt.GraphicsConfiguration;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StartScreen extends JFrame 
{
	private JPanel panelButtons = new JPanel();
	private JButton buttonEinSpieler = new JButton();
	private JButton buttonZweiSpieler = new JButton();
	private JButton buttonDreiSpieler = new JButton();
	private JButton buttonVierSpieler = new JButton();
	private JLabel textfield = new JLabel();
	public StartScreen() 
	{
		super("Mensch ärgere Dich Nicht");
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		BackgroundPanel backgroundPanel = new BackgroundPanel();
		Container cp = getContentPane();	// Container für Fenstervariablen				
		panelButtons.setBounds(-5, 800, 700, 38);
		panelButtons.setBackground(Color.WHITE);
		panelButtons.setBorder(new javax.swing.border.LineBorder(Color.BLACK, 2));
		panelButtons.setOpaque(true);
		cp.add(panelButtons);
	    textfield.setText("Spieleranzahl :");
	    panelButtons.add(textfield);
	    buttonEinSpieler.setText("1 Spieler");
	    buttonEinSpieler.addActionListener(new ActionListener() 
	    { 
	      public void actionPerformed(ActionEvent e) 
	      { 
	        buttonEinSpieler_actionPerformed(e);
	      }

	      private void buttonEinSpieler_actionPerformed(ActionEvent e)
	      {
	    	  new OnePlayerName();
	    	  dispose();
	      }
	    });
	    panelButtons.add(buttonEinSpieler);
	    buttonZweiSpieler.setText("2 Spieler");
	    buttonZweiSpieler.addActionListener(new ActionListener() 
	    { 
	      public void actionPerformed(ActionEvent e) 
	      { 
	        buttonZweiSpieler_actionPerformed(e);
	      }

	      private void buttonZweiSpieler_actionPerformed(ActionEvent e)
	      {	 
			new TwoPlayerName();	
			dispose();
	      }
	    });
	    panelButtons.add(buttonZweiSpieler);
	    buttonDreiSpieler.setText("3 Spieler");
	    buttonDreiSpieler.addActionListener(new ActionListener() 
	    { 
	      public void actionPerformed(ActionEvent e) 
	      { 
	        buttonDreiSpieler_actionPerformed(e);
	      }

	      private void buttonDreiSpieler_actionPerformed(ActionEvent e)
	      {	
			new ThreePlayerName();
			dispose();
	      }
	    });
	    panelButtons.add(buttonDreiSpieler);
	    buttonVierSpieler.setText("4 Spieler");
	    buttonVierSpieler.addActionListener(new ActionListener() 
	    { 
	      public void actionPerformed(ActionEvent e) 
	      { 
	        buttonVierSpieler_actionPerformed(e);
	      }

	      private void buttonVierSpieler_actionPerformed(ActionEvent e)
	      {
			new FourPlayerName();
			dispose();
	      }
	    });
	    panelButtons.add(buttonVierSpieler);
		cp.add(backgroundPanel);
		setSize(backgroundPanel.getBackgroundImage().getWidth(backgroundPanel),	backgroundPanel.getBackgroundImage().getHeight(backgroundPanel));
	}
}