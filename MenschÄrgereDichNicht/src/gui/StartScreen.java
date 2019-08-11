package gui;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
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
	Playground playground = new Playground();
	PlayerNames playerNames = new PlayerNames();
	PlayerNames playerNames2 = new PlayerNames("Spieler 2 :");
	PlayerNames playerNames3 = new PlayerNames("Spieler 2 :", "Spieler 3 :");
	PlayerNames playerNames4 = new PlayerNames("Spieler 2 :","Spieler 3 :","Spieler 4:");
	

	public StartScreen() 
	{
		super("Mensch ärgere Dich Nicht");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BackgroundPanel backgroundPanel = new BackgroundPanel();
		Container cp = getContentPane();	// Container f�r Fenstervariablen			
		panelButtons.setBounds(-5, java.awt.Toolkit.getDefaultToolkit().getScreenSize().height-200, 700, 38);
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
	    	  playerNames.setVisible(true);
	    	  playerNames2.dispose();
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
	    	  playerNames2.setVisible(true);
	    	  playerNames.dispose();
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
			playerNames3.setVisible(true);
			playerNames.dispose();
			playerNames2.dispose();
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
			playerNames4.setVisible(true);
			playerNames.dispose();
			playerNames2.dispose();
			playerNames3.dispose();
	      }
	    });
	    panelButtons.add(buttonVierSpieler);
		cp.add(backgroundPanel);
		setSize(backgroundPanel.getBackgroundImage().getWidth(backgroundPanel),	backgroundPanel.getBackgroundImage().getHeight(backgroundPanel));
	}
}