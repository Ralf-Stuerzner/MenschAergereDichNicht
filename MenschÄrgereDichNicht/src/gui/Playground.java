package gui;
import java.awt.*;
import java.io.PrintStream;

import javax.swing.*;

public class Playground extends JFrame						// JFrame Spielfenster
{
	int r;													// Integer r,g,b Variablen für die Hintergrundfarbe des Fensters
	int g;
	int b;
	private JPanel jPanel1 = new JPanel(null, true);		// JPanels zum zeichen der Linien
	private JPanel jPanel2 = new JPanel(null, true);
	private JPanel jPanel3 = new JPanel(null, true);
	private JPanel jPanel4 = new JPanel(null, true);
	private JPanel jPanel5 = new JPanel(null, true);
	private JPanel jPanel6 = new JPanel(null, true);
	private JPanel jPanel7 = new JPanel(null, true);
	private JPanel jPanel8 = new JPanel(null, true);
	private JPanel jPanel9 = new JPanel(null, true);
	private JPanel jPanel10 = new JPanel(null, true);
	private JPanel jPanel11 = new JPanel(null, true);
	private JPanel jPanel12 = new JPanel(null, true);
	private Circles circleweiß1 = new Circles(Color.WHITE);
	private Circles circleweiß2 = new Circles(Color.WHITE);
	private Circles circleweiß3 = new Circles(Color.WHITE);
	private Circles circleweiß4 = new Circles(Color.WHITE);
	private Circles circleweiß5 = new Circles(Color.WHITE);
	private Circles circleweiß6 = new Circles(Color.WHITE);
	private Circles circleweiß7 = new Circles(Color.WHITE);
	private Circles circleweiß8 = new Circles(Color.WHITE);
	private Circles circleweiß9 = new Circles(Color.WHITE);
	private Circles circleweiß10 = new Circles(Color.WHITE);
	private Circles circleweiß11 = new Circles(Color.WHITE);
	private Circles circleweiß12 = new Circles(Color.WHITE);
	private Circles circleweiß13 = new Circles(Color.WHITE);
	private Circles circleweiß14 = new Circles(Color.WHITE);
	private Circles circleweiß15 = new Circles(Color.WHITE);
	private Circles circleweiß16 = new Circles(Color.WHITE);
	private Circles circleweiß17 = new Circles(Color.WHITE);
	private Circles circleweiß18 = new Circles(Color.WHITE);
	private Circles circleweiß19 = new Circles(Color.WHITE);
	private Circles circleweiß20 = new Circles(Color.WHITE);
	private Circles circleweiß21 = new Circles(Color.WHITE);
	private Circles circleweiß22 = new Circles(Color.WHITE);
	private Circles circleweiß23 = new Circles(Color.WHITE);
	private Circles circleweiß24 = new Circles(Color.WHITE);
	private Circles circleweiß25 = new Circles(Color.WHITE);
	private Circles circleweiß26 = new Circles(Color.WHITE);
	private Circles circleweiß27 = new Circles(Color.WHITE);
	private Circles circleweiß28 = new Circles(Color.WHITE);
	private Circles circleweiß29 = new Circles(Color.WHITE);
	private Circles circleweiß30 = new Circles(Color.WHITE);
	private Circles circleweiß31 = new Circles(Color.WHITE);
	private Circles circleweiß32 = new Circles(Color.WHITE);
	private Circles circleweiß33 = new Circles(Color.WHITE);
	private Circles circleweiß34 = new Circles(Color.WHITE);
	private Circles circleweiß35 = new Circles(Color.WHITE);
	private Circles circleweiß36 = new Circles(Color.WHITE);
	private Circles circleblau1 = new Circles(Color.BLUE);
	private Circles circleblau2 = new Circles(Color.BLUE);
	private Circles circleblau3 = new Circles(Color.BLUE);
	private Circles circleblau4 = new Circles(Color.BLUE);
	private Circles circleblau5 = new Circles(Color.BLUE);
	private Circles circleblau6 = new Circles(Color.BLUE);
	private Circles circleblau7 = new Circles(Color.BLUE);
	private Circles circleblau8 = new Circles(Color.BLUE);
	private Circles circleblau9 = new Circles(Color.BLUE);
	private Circles circlegreen1 = new Circles(Color.GREEN);
	private Circles circlegreen2 = new Circles(Color.GREEN);
	private Circles circlegreen3 = new Circles(Color.GREEN);
	private Circles circlegreen4 = new Circles(Color.GREEN);
	private Circles circlegreen5 = new Circles(Color.GREEN);
	private Circles circlegreen6 = new Circles(Color.GREEN);
	private Circles circlegreen7 = new Circles(Color.GREEN);
	private Circles circlegreen8 = new Circles(Color.GREEN);
	private Circles circlegreen9 = new Circles(Color.GREEN);
	private Circles circleyellow1 = new Circles(Color.YELLOW);
	private Circles circleyellow2 = new Circles(Color.YELLOW);
	private Circles circleyellow3 = new Circles(Color.YELLOW);
	private Circles circleyellow4 = new Circles(Color.YELLOW);
	private Circles circleyellow5 = new Circles(Color.YELLOW);
	private Circles circleyellow6 = new Circles(Color.YELLOW);
	private Circles circleyellow7 = new Circles(Color.YELLOW);
	private Circles circleyellow8 = new Circles(Color.YELLOW);
	private Circles circleyellow9 = new Circles(Color.YELLOW);
	private Circles circlered1 = new Circles(Color.RED);
	private Circles circlered2 = new Circles(Color.RED);
	private Circles circlered3 = new Circles(Color.RED);
	private Circles circlered4 = new Circles(Color.RED);
	private Circles circlered5 = new Circles(Color.RED);
	private Circles circlered6 = new Circles(Color.RED);
	private Circles circlered7 = new Circles(Color.RED);
	private Circles circlered8 = new Circles(Color.RED);
	private Circles circlered9 = new Circles(Color.RED);
	private JLabel textfield1 = new JLabel();
	private JLabel textfield2 = new JLabel();
	private JLabel textfield3 = new JLabel();
	private JLabel textfield4 = new JLabel();
	private static JTextArea jTextArea1 = new JTextArea();
	private JScrollPane jTextArea1ScrollPane = new JScrollPane(jTextArea1);
	public static GameFigures redone = new GameFigures(Color.RED,"1");
	public static GameFigures redtwo = new GameFigures(Color.RED, "2");
	public static GameFigures redthree = new GameFigures(Color.RED, "3");
	public static GameFigures redfour = new GameFigures(Color.RED, "4");
	public static  GameFigures blueone = new GameFigures(Color.BLUE,"1");
	public static GameFigures bluetwo = new GameFigures(Color.BLUE, "2");
	public static GameFigures bluethree = new GameFigures(Color.BLUE, "3");
	public static GameFigures bluefour = new GameFigures(Color.BLUE, "4");
	public static  GameFigures greenone = new GameFigures(Color.GREEN,"1");
	public static GameFigures greentwo = new GameFigures(Color.GREEN, "2");
	public static GameFigures greenthree = new GameFigures(Color.GREEN, "3");
	public static GameFigures greenfour = new GameFigures(Color.GREEN, "4");
	public static  GameFigures yellowone = new GameFigures(Color.YELLOW,"1");
	public static GameFigures yellowtwo = new GameFigures(Color.YELLOW, "2");
	public static GameFigures yellowthree = new GameFigures(Color.YELLOW, "3");
	public static GameFigures yellowfour = new GameFigures(Color.YELLOW, "4");
	

	public Playground()
	{
		super();
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);		// Programm wird beim schließen des Fensters beendet
		int frameWidth = 1800;											// Größe des Spielfensters
		int frameHeight = 1000;
		setSize(frameWidth, frameHeight);	
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();		// Fenster wird mittig ausgerichtet
		int x = (d.width - getSize().width) / 2;
		int y = (d.height - getSize().height) / 2;
		setLocation(x, y);
		setTitle("Mensch ärgere Dich Nicht");							// Titel des Fensters
		setResizable(false);											// Größe nicht veränderbar
		Container cp = getContentPane();								// Container für Fenstervariablen
		cp.setLayout(null);
		cp.setBackground(new Color(r = 204, g = 164, b = 96));			// Hintergrundfarbe Fenster

		
		
		yellowone.setBounds(10, 820, 61, 61);
		cp.add(yellowone);
		yellowtwo.setBounds(80, 820, 61, 61);
		cp.add(yellowtwo);
		yellowthree.setBounds(10, 890, 61, 61);
		cp.add(yellowthree);
		yellowfour.setBounds(80, 890, 61, 61);
		cp.add(yellowfour);
		greenone.setBounds(840, 820, 61, 61);
		cp.add(greenone);
		greentwo.setBounds(910, 820, 61, 61);
		cp.add(greentwo);
		greenthree.setBounds(840, 890, 61, 61);
		cp.add(greenthree);
		greenfour.setBounds(910, 890, 61, 61);
		cp.add(greenfour);
		blueone.setBounds(840, 10, 61, 61);
		cp.add(blueone);
		bluetwo.setBounds(910, 10, 61, 61);
		cp.add(bluetwo);
		bluethree.setBounds(840, 80, 61, 61);
		cp.add(bluethree);
		bluefour.setBounds(910, 80, 61, 61);
		cp.add(bluefour);
		redfour.setBounds(80, 80, 61, 61);
		cp.add(redfour);
		redthree.setBounds(10, 80, 61, 61);
		cp.add(redthree);
		redtwo.setBounds(80, 10, 61, 61);
		cp.add(redtwo);
		redone.setBounds(10, 10, 61, 61);
		cp.add(redone);
		jTextArea1ScrollPane.setBounds(980, 10, 795, 940);
		jTextArea1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		cp.add(jTextArea1ScrollPane);
		textfield1.setBounds(30, 140, 100, 30);
	    textfield1.setText(LoadGui.getPlayerOneNameString());
	    cp.add(textfield1); 
	    textfield2.setBounds(860, 140, 100, 30);
	    textfield2.setText(LoadGui.getPlayerTwoNameString());
	    cp.add(textfield2);
	    textfield3.setBounds(30, 790, 100, 30);
	    textfield3.setText(LoadGui.getPlayerThreeNameString());
	    cp.add(textfield3); 
	    textfield4.setBounds(860, 790, 100, 30);
	    textfield4.setText(LoadGui.getPlayerFourNameString());
	    cp.add(textfield4);
		circleweiß1.setBounds(380, 366, 61, 61);	// erstellung der einzelen Bausteine für das Fenster mit Koordinaten
		circleweiß1.setOpaque(true);
		cp.add(circleweiß1);
		circleweiß2.setBounds(380, 284, 61, 61);
		circleweiß2.setOpaque(true);
		cp.add(circleweiß2);
		circleweiß3.setBounds(380, 202, 61, 61);
		circleweiß3.setOpaque(true);
		cp.add(circleweiß3);
		circleweiß4.setBounds(380, 120, 61, 61);
		circleweiß4.setOpaque(true);
		cp.add(circleweiß4);
		circleweiß5.setBounds(380, 38, 61, 61);
		circleweiß5.setOpaque(true);
		cp.add(circleweiß5);
		circleweiß6.setBounds(467, 38, 61, 61);
		circleweiß6.setOpaque(true);
		cp.add(circleweiß6);
		circleweiß7.setBounds(555, 120, 61, 61);
		circleweiß7.setOpaque(true);
		cp.add(circleweiß7);
		circleweiß8.setBounds(555, 202, 61, 61);
		circleweiß8.setOpaque(true);
		cp.add(circleweiß8);
		circleweiß9.setBounds(555, 284, 61, 61);
		circleweiß9.setOpaque(true);
		cp.add(circleweiß9);
		circleweiß10.setBounds(555, 366, 61, 61);
		circleweiß10.setOpaque(true);
		cp.add(circleweiß10);
		circleweiß11.setBounds(642, 366, 61, 61);
		circleweiß11.setOpaque(true);
		cp.add(circleweiß11);
		circleweiß12.setBounds(724, 366, 61, 61);
		circleweiß12.setOpaque(true);
		cp.add(circleweiß12);
		circleweiß13.setBounds(806, 366, 61, 61);
		circleweiß13.setOpaque(true);
		cp.add(circleweiß13);
		circleweiß14.setBounds(888, 366, 61, 61);
		circleweiß14.setOpaque(true);
		cp.add(circleweiß14);
		circleweiß15.setBounds(888, 454, 61, 61);
		circleweiß15.setOpaque(true);
		cp.add(circleweiß15);
		circleweiß16.setBounds(806, 542, 61, 61);
		circleweiß16.setOpaque(true);
		cp.add(circleweiß16);
		circleweiß17.setBounds(724, 542, 61, 61);
		circleweiß17.setOpaque(true);
		cp.add(circleweiß17);
		circleweiß18.setBounds(642, 542, 61, 61);
		circleweiß18.setOpaque(true);
		cp.add(circleweiß18);
		circleweiß19.setBounds(555, 542, 61, 61);
		circleweiß19.setOpaque(true);
		cp.add(circleweiß19);
		circleweiß20.setBounds(555, 624, 61, 61);
		circleweiß20.setOpaque(true);
		cp.add(circleweiß20);
		circleweiß21.setBounds(555, 706, 61, 61);
		circleweiß21.setOpaque(true);
		cp.add(circleweiß21);
		circleweiß22.setBounds(555, 788, 61, 61);
		circleweiß22.setOpaque(true);
		cp.add(circleweiß22);
		circleweiß23.setBounds(555, 870, 61, 61);
		circleweiß23.setOpaque(true);
		cp.add(circleweiß23);
		circleweiß24.setBounds(467, 870, 61, 61);
		circleweiß24.setOpaque(true);
		cp.add(circleweiß24);
		circleweiß25.setBounds(380, 788, 61, 61);
		circleweiß25.setOpaque(true);
		cp.add(circleweiß25);
		circleweiß26.setBounds(380, 706, 61, 61);
		circleweiß26.setOpaque(true);
		cp.add(circleweiß26);
		circleweiß27.setBounds(380, 624, 61, 61);
		circleweiß27.setOpaque(true);
		cp.add(circleweiß27);
		circleweiß28.setBounds(380, 542, 61, 61);
		circleweiß28.setOpaque(true);
		cp.add(circleweiß28);
		circleweiß29.setBounds(293, 542, 61, 61);
		circleweiß29.setOpaque(true);
		cp.add(circleweiß29);
		circleweiß30.setBounds(211, 542, 61, 61);
		circleweiß30.setOpaque(true);
		cp.add(circleweiß30);
		circleweiß31.setBounds(126, 542, 61, 61);
		circleweiß31.setOpaque(true);
		cp.add(circleweiß31);
		circleweiß32.setBounds(38, 542, 61, 61);
		circleweiß32.setOpaque(true);
		cp.add(circleweiß32);
		circleweiß33.setBounds(38, 454, 61, 61);
		circleweiß33.setOpaque(true);
		cp.add(circleweiß33);
		circleweiß34.setBounds(124, 366, 61, 61);
		circleweiß34.setOpaque(true);
		cp.add(circleweiß34);
		circleweiß35.setBounds(208, 366, 61, 61);
		circleweiß35.setOpaque(true);
		cp.add(circleweiß35);
		circleweiß36.setBounds(292, 366, 61, 61);
		circleweiß36.setOpaque(true);
		cp.add(circleweiß36);

		circlegreen1.setBounds(888, 542, 61, 61);
		circlegreen1.setOpaque(true);
		cp.add(circlegreen1);
		circlegreen2.setBounds(806, 454, 61, 61);
		circlegreen2.setOpaque(true);
		cp.add(circlegreen2);
		circlegreen3.setBounds(724, 454, 61, 61);
		circlegreen3.setOpaque(true);
		cp.add(circlegreen3);
		circlegreen4.setBounds(642, 454, 61, 61);
		circlegreen4.setOpaque(true);
		cp.add(circlegreen4);
		circlegreen5.setBounds(555, 454, 61, 61);
		circlegreen5.setOpaque(true);
		cp.add(circlegreen5);
		circlegreen6.setBounds(910, 890, 61, 61);
		circlegreen6.setOpaque(true);
		cp.add(circlegreen6);
		circlegreen7.setBounds(910, 820, 61, 61);
		circlegreen7.setOpaque(true);
		cp.add(circlegreen7);
		circlegreen8.setBounds(840, 820, 61, 61);
		circlegreen8.setOpaque(true);
		cp.add(circlegreen8);
		circlegreen9.setBounds(840, 890, 61, 61);
		circlegreen9.setOpaque(true);
		cp.add(circlegreen9);

		circleblau1.setBounds(555, 38, 61, 61);
		circleblau1.setOpaque(true);
		cp.add(circleblau1);
		circleblau2.setBounds(910, 10, 61, 61);
		circleblau2.setOpaque(true);
		cp.add(circleblau2);
		circleblau3.setBounds(840, 10, 61, 61);
		circleblau3.setOpaque(true);
		cp.add(circleblau3);
		circleblau4.setBounds(910, 80, 61, 61);
		circleblau4.setOpaque(true);
		cp.add(circleblau4);
		circleblau5.setBounds(840, 80, 61, 61);
		circleblau5.setOpaque(true);
		cp.add(circleblau5);
		circleblau6.setBounds(467, 120, 61, 61);
		circleblau6.setOpaque(true);
		cp.add(circleblau6);
		circleblau7.setBounds(467, 202, 61, 61);
		circleblau7.setOpaque(true);
		cp.add(circleblau7);
		circleblau8.setBounds(467, 284, 61, 61);
		circleblau8.setOpaque(true);
		cp.add(circleblau8);
		circleblau9.setBounds(467, 366, 61, 61);
		circleblau9.setOpaque(true);
		cp.add(circleblau9);

		circleyellow1.setBounds(467, 788, 61, 61);
		circleyellow1.setOpaque(true);
		cp.add(circleyellow1);
		circleyellow2.setBounds(467, 706, 61, 61);
		circleyellow2.setOpaque(true);
		cp.add(circleyellow2);
		circleyellow3.setBounds(467, 624, 61, 61);
		circleyellow3.setOpaque(true);
		cp.add(circleyellow3);
		circleyellow4.setBounds(467, 542, 61, 61);
		circleyellow4.setOpaque(true);
		cp.add(circleyellow4);
		circleyellow5.setBounds(380, 870, 61, 61);
		circleyellow5.setOpaque(true);
		cp.add(circleyellow5);
		circleyellow6.setBounds(80, 890, 61, 61);
		circleyellow6.setOpaque(true);
		cp.add(circleyellow6);
		circleyellow7.setBounds(10, 890, 61, 61);
		circleyellow7.setOpaque(true);
		cp.add(circleyellow7);
		circleyellow8.setBounds(10, 820, 61, 61);
		circleyellow8.setOpaque(true);
		cp.add(circleyellow8);
		circleyellow9.setBounds(80, 820, 61, 61);
		circleyellow9.setOpaque(true);
		cp.add(circleyellow9);

		circlered1.setBounds(10, 10, 61, 61);
		circlered1.setOpaque(true);
		cp.add(circlered1);
		circlered2.setBounds(80, 10, 61, 61);
		circlered2.setOpaque(true);
		cp.add(circlered2);
		circlered3.setBounds(80, 80, 61, 61);
		circlered3.setOpaque(true);
		cp.add(circlered3);
		circlered4.setBounds(10, 80, 61, 61);
		circlered4.setOpaque(true);
		cp.add(circlered4);
		circlered5.setBounds(38, 366, 61, 61);
		circlered5.setOpaque(true);
		cp.add(circlered5);
		circlered6.setBounds(124, 454, 61, 61);
		circlered6.setOpaque(true);
		cp.add(circlered6);
		circlered7.setBounds(208, 454, 61, 61);
		circlered7.setOpaque(true);
		cp.add(circlered7);
		circlered8.setBounds(292, 454, 61, 61);
		circlered8.setOpaque(true);
		cp.add(circlered8);
		circlered9.setBounds(380, 454, 61, 61);
		circlered9.setOpaque(true);
		cp.add(circlered9);

		jPanel1.setBounds(64, 392, 3, 178);
		jPanel1.setOpaque(true);
		jPanel1.setBackground(Color.BLACK);
		cp.add(jPanel1);
		jPanel2.setBounds(920, 392, 3, 178);
		jPanel2.setOpaque(true);
		jPanel2.setBackground(Color.BLACK);
		cp.add(jPanel2);
		jPanel3.setBounds(408, 64, 178, 3);
		jPanel3.setOpaque(true);
		jPanel3.setBackground(Color.BLACK);
		cp.add(jPanel3);
		jPanel4.setBounds(408, 896, 178, 3);
		jPanel4.setOpaque(true);
		jPanel4.setBackground(Color.BLACK);
		cp.add(jPanel4);
		jPanel5.setBounds(64, 392, 345, 3);
		jPanel5.setOpaque(true);
		jPanel5.setBackground(Color.BLACK);
		cp.add(jPanel5);
		jPanel6.setBounds(408, 64, 3, 330);
		jPanel6.setOpaque(true);
		jPanel6.setBackground(Color.BLACK);
		cp.add(jPanel6);
		jPanel7.setBounds(64, 568, 345, 3);
		jPanel7.setOpaque(true);
		jPanel7.setBackground(Color.BLACK);
		cp.add(jPanel7);
		jPanel8.setBounds(408, 568, 3, 330);
		jPanel8.setOpaque(true);
		jPanel8.setBackground(Color.BLACK);
		cp.add(jPanel8);
		jPanel9.setBounds(584, 568, 3, 330);
		jPanel9.setOpaque(true);
		jPanel9.setBackground(Color.BLACK);
		cp.add(jPanel9);
		jPanel10.setBounds(584, 64, 3, 330);
		jPanel10.setOpaque(true);
		jPanel10.setBackground(Color.BLACK);
		cp.add(jPanel10);
		jPanel11.setBounds(584, 392, 338, 3);
		jPanel11.setOpaque(true);
		jPanel11.setBackground(Color.BLACK);
		cp.add(jPanel11);
		jPanel12.setBounds(584, 568, 338, 3);
		jPanel12.setOpaque(true);
		jPanel12.setBackground(Color.BLACK);
		cp.add(jPanel12);
		setVisible(true);
	}
	
	//getterSetter
	
	
	public static GameFigures getRedone()
	{
		return redone;
	}
	
	public static GameFigures getRedtwo() {
		return redtwo;
	}

	public static void setRedtwo(GameFigures redtwo) {
		Playground.redtwo = redtwo;
	}

	public static GameFigures getRedthree() {
		return redthree;
	}

	public static void setRedthree(GameFigures redthree) {
		Playground.redthree = redthree;
	}

	public static GameFigures getRedfour() {
		return redfour;
	}

	public static void setRedfour(GameFigures redfour) {
		Playground.redfour = redfour;
	}

	public static GameFigures getBlueone() {
		return blueone;
	}

	public static void setBlueone(GameFigures blueone) {
		Playground.blueone = blueone;
	}

	public static GameFigures getBluetwo() {
		return bluetwo;
	}

	public static void setBluetwo(GameFigures bluetwo) {
		Playground.bluetwo = bluetwo;
	}

	public static GameFigures getBluethree() {
		return bluethree;
	}

	public static void setBluethree(GameFigures bluethree) {
		Playground.bluethree = bluethree;
	}

	public static GameFigures getBluefour() {
		return bluefour;
	}

	public static void setBluefour(GameFigures bluefour) {
		Playground.bluefour = bluefour;
	}

	public static GameFigures getGreenone() {
		return greenone;
	}

	public static void setGreenone(GameFigures greenone) {
		Playground.greenone = greenone;
	}

	public static GameFigures getGreentwo() {
		return greentwo;
	}

	public static void setGreentwo(GameFigures greentwo) {
		Playground.greentwo = greentwo;
	}

	public static GameFigures getGreenthree() {
		return greenthree;
	}

	public static void setGreenthree(GameFigures greenthree) {
		Playground.greenthree = greenthree;
	}

	public static GameFigures getGreenfour() {
		return greenfour;
	}

	public static void setGreenfour(GameFigures greenfour) {
		Playground.greenfour = greenfour;
	}

	public static GameFigures getYellowone() {
		return yellowone;
	}

	public static void setYellowone(GameFigures yellowone) {
		Playground.yellowone = yellowone;
	}

	public static GameFigures getYellowtwo() {
		return yellowtwo;
	}

	public static void setYellowtwo(GameFigures yellowtwo) {
		Playground.yellowtwo = yellowtwo;
	}

	public static GameFigures getYellowthree() {
		return yellowthree;
	}

	public static void setYellowthree(GameFigures yellowthree) {
		Playground.yellowthree = yellowthree;
	}

	public static GameFigures getYellowfour() {
		return yellowfour;
	}

	public static void setYellowfour(GameFigures yellowfour) {
		Playground.yellowfour = yellowfour;
	}

	public static void setRedone(GameFigures redone)
	{
		Playground.redone = redone;
	}
	static void onEvent(String s)
	{
		jTextArea1.append(s + "\n");
	}

	static void onEvent(int i)
	{
		jTextArea1.append(i + "\n");
	}
}
