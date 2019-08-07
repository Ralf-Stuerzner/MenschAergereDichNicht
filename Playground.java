package gui;

import java.awt.*;
import javax.swing.*;

public class Playground extends JFrame // JFrame Spielfenster
{
	private int[] blackStrokeX1 = { 64, 920, 408, 408, 64, 408, 64, 408, 584, 584, 584, 584 };
	private int[] blackStrokeY1 = { 392, 392, 64, 896, 392, 64, 568, 568, 568, 64, 392, 568 };
	private int[] blackStrokeX2 = { 3, 3, 178, 178, 345, 3, 345, 3, 3, 3, 338, 338 };
	private int[] blackStrokeY2 = { 178, 178, 3, 3, 3, 330, 3, 330, 330, 330, 3, 3 };

	private String[] winFields = { "a", "b", "c", "d" };
	private int[] stoneNumber = { 1, 2, 3, 4 };

	private int[] startFieldRedX = { 10, 80, 10, 80 };
	private int[] startFieldRedY = { 10, 10, 80, 80 };
	private String[] startFieldRed = { "r1", "r2", "r3", "r4" };
	private int[] fieldRedX = { 10, 80, 80, 10 };
	private int[] fieldRedY = { 10, 10, 80, 80 };
	private int[] winRedX = { 124, 208, 292, 380 }; // a, b, c, d
	private int[] winRedY = { 454, 454, 454, 454 };
	private int[] startFieldBlueX = { 840, 910, 840, 910 };
	private int[] startFieldBlueY = { 10, 10, 80, 80 };
	private String[] startFieldBlue = { "b1", "b2", "b3", "b4" };
	private int[] fieldBlueX = { 910, 840, 910, 840 };
	private int[] fieldBlueY = { 10, 10, 80, 80 };
	private int[] winBlueX = { 467, 467, 467, 467 };
	private int[] winBlueY = { 120, 202, 284, 366 };
	private int[] startFieldGreenX = { 840, 910, 840, 910 };
	private int[] startFieldGreenY = { 820, 820, 890, 890 };
	private String[] startFieldGreen = { "g1", "g2", "g3", "g4" };
	private int[] fieldGreenX = { 910, 910, 840, 840 };
	private int[] fieldGreenY = { 890, 820, 820, 890 };
	private int[] winGreenX = { 806, 724, 642, 555 };
	private int[] winGreenY = { 454, 454, 454, 454 };
	private int[] startFieldYellowX = { 10, 80, 10, 80 };
	private int[] startFieldYellowY = { 820, 820, 890, 890 };
	private String[] startFieldYellow = { "y1", "y2", "y3", "y4" };
	private int[] fieldYellowX = { 80, 10, 10, 80 };
	private int[] fieldYellowY = { 890, 890, 820, 820 };
	private int[] winYellowX = { 467, 467, 467, 467 };
	private int[] winYellowY = { 788, 706, 624, 542 };

	private int[] fieldsWhiteX = { 380, 380, 380, 380, 380, 467, 555, 555, 555, 555, 555, 642, 724, 806, 888, 888, 888,
			806, 724, 642, 555, 555, 555, 555, 555, 467, 380, 380, 380, 380, 380, 293, 211, 126, 38, 38, 38, 124, 208,
			292 };
	private int[] fieldsWhiteY = { 366, 284, 202, 120, 38, 38, 38, 120, 202, 284, 366, 366, 366, 366, 366, 454, 542,
			542, 542, 542, 542, 624, 706, 788, 870, 870, 870, 788, 706, 624, 542, 542, 542, 542, 542, 454, 366, 366,
			366, 366 };

	private String[] spielfeld = { "w", "w", "w", "w", "w", "w", "Ab", "w", "w", "w", "w", "w", "w", "w", "w", "w",
			"Ag", "w", "w", "w", "w", "w", "w", "w", "w", "w", "Ay", "w", "w", "w", "w", "w", "w", "w", "w", "w", "Ar",
			"w", "w", "w" };

	public JLabel textfield1 = new JLabel();
	public JLabel textfield2 = new JLabel();
	public JLabel textfield3 = new JLabel();
	public JLabel textfield4 = new JLabel();
	public static JTextArea jTextArea1 = new JTextArea();
	private JScrollPane jTextArea1ScrollPane = new JScrollPane(jTextArea1);

	public Container cp = getContentPane(); // Container für Fenstervariablen

//	private Arrow pfeilArrow = new Arrow();

	public Playground() {
		super();
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE); // Programm wird beim schließen des Fensters beendet
		int frameWidth = 1800; // Größe des Spielfensters
		int frameHeight = 1000;
		setSize(frameWidth, frameHeight);
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize(); // Fenster wird mittig ausgerichtet
		int x = (d.width - getSize().width) / 2;
		int y = (d.height - getSize().height) / 2;
		setLocation(x, y);
		setTitle("Mensch ärgere Dich Nicht"); // Titel des Fensters
		setResizable(false); // Größe nicht veränderbar
		cp.setLayout(null);
		cp.setBackground(new Color(204, 164, 96)); // Hintergrundfarbe Fenster (rot, grün, blau)

//		pfeilArrow.setBounds(100, 200, 200, 500);
//		cp.add(pfeilArrow);
		jTextArea1ScrollPane.setBounds(980, 10, 795, 940);
		jTextArea1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		cp.add(jTextArea1ScrollPane);
		textfield1.setBounds(30, 140, 100, 30);
//	    textfield1.setText(LoadGui.startScreen.playerNames.gameLogic.getPlayerOneNameString());
		cp.add(textfield1);
		textfield2.setBounds(860, 140, 100, 30);
//	    textfield2.setText(LoadGui.startScreen.playerNames.gameLogic.getPlayerTwoNameString());
		cp.add(textfield2);
		textfield3.setBounds(30, 790, 100, 30);
//	    textfield3.setText(LoadGui.startScreen.playerNames.gameLogic.getPlayerThreeNameString());
		cp.add(textfield3);
		textfield4.setBounds(860, 790, 100, 30);
//	    textfield4.setText(LoadGui.startScreen.playerNames.gameLogic.getPlayerFourNameString());
		cp.add(textfield4);

		drawStartFields();

		for (int i = 0; i < 4; i++) {
			Circles circlered = new Circles(Color.RED, "", "");
			circlered.setBounds(fieldRedX[i], fieldRedY[i], 61, 61);
			circlered.setOpaque(true);
			cp.add(circlered);

			Circles winred = new Circles(Color.RED, "", winFields[i]);
			winred.setBounds(winRedX[i], winRedY[i], 61, 61);
			winred.setOpaque(true);
			cp.add(winred);

			Circles circleblue = new Circles(Color.BLUE, "", "");
			circleblue.setBounds(fieldBlueX[i], fieldBlueY[i], 61, 61);
			circleblue.setOpaque(true);
			cp.add(circleblue);

			Circles winblue = new Circles(Color.BLUE, "", winFields[i]);
			winblue.setBounds(winBlueX[i], winBlueY[i], 61, 61);
			winblue.setOpaque(true);
			cp.add(winblue);

			Circles circlegreen = new Circles(Color.GREEN, "", "");
			circlegreen.setBounds(fieldGreenX[i], fieldGreenY[i], 61, 61);
			circlegreen.setOpaque(true);
			cp.add(circlegreen);

			Circles wingreen = new Circles(Color.GREEN, "", winFields[i]);
			wingreen.setBounds(winGreenX[i], winGreenY[i], 61, 61);
			wingreen.setOpaque(true);
			cp.add(wingreen);

			Circles circleyellow = new Circles(Color.YELLOW, "", "");
			circleyellow.setBounds(fieldYellowX[i], fieldYellowY[i], 61, 61);
			circleyellow.setOpaque(true);
			cp.add(circleyellow);

			Circles winyellow = new Circles(Color.YELLOW, "", winFields[i]);
			winyellow.setBounds(winYellowX[i], winYellowY[i], 61, 61);
			winyellow.setOpaque(true);
			cp.add(winyellow);
		}

		drawPlayground();

		for (int i = 0; i < blackStrokeX1.length; i++) {
			JPanel blackStroke = new JPanel(null, true);
			blackStroke.setBounds(blackStrokeX1[i], blackStrokeY1[i], blackStrokeX2[i], blackStrokeY2[i]);
			blackStroke.setOpaque(true);
			blackStroke.setBackground(Color.BLACK);
			cp.add(blackStroke);
		}
	}

	// getterSetter

	public void setSpielfigur(int feld, String figur) {
		spielfeld[feld] = figur;
		drawPlayground();
	}
	
	public void getSpielStand() {
		for (int i = 0; i < spielfeld.length; i++) {
			System.out.println(spielfeld[i]);
		}
	}

	public void drawStartFields() {
		for (int i = 0; i < startFieldRed.length; i++) {
			if (startFieldRed[i] == "r1") {
				Circles redStone = new Circles(Color.RED, "1", "");
				redStone.setBounds(startFieldRedX[i], startFieldRedY[i], 61, 61);
				redStone.setOpaque(true);
				cp.add(redStone);
			} else if (startFieldRed[i] == "r2") {
				Circles redStone = new Circles(Color.RED, "2", "");
				redStone.setBounds(startFieldRedX[i], startFieldRedY[i], 61, 61);
				redStone.setOpaque(true);
				cp.add(redStone);
			} else if (startFieldRed[i] == "r3") {
				Circles redStone = new Circles(Color.RED, "3", "");
				redStone.setBounds(startFieldRedX[i], startFieldRedY[i], 61, 61);
				redStone.setOpaque(true);
				cp.add(redStone);
			} else if (startFieldRed[i] == "r4") {
				Circles redStone = new Circles(Color.RED, "4", "");
				redStone.setBounds(startFieldRedX[i], startFieldRedY[i], 61, 61);
				redStone.setOpaque(true);
				cp.add(redStone);
			}
			if (startFieldBlue[i] == "b1") {
				Circles circleblue = new Circles(Color.BLUE, "1", "");
				circleblue.setBounds(startFieldBlueX[i], startFieldBlueY[i], 61, 61);
				circleblue.setOpaque(true);
				cp.add(circleblue);

			} else if (startFieldBlue[i] == "b2") {
				Circles circleblue = new Circles(Color.BLUE, "2", "");
				circleblue.setBounds(startFieldBlueX[i], startFieldBlueY[i], 61, 61);
				circleblue.setOpaque(true);
				cp.add(circleblue);

			} else if (startFieldBlue[i] == "b3") {
				Circles circleblue = new Circles(Color.BLUE, "3", "");
				circleblue.setBounds(startFieldBlueX[i], startFieldBlueY[i], 61, 61);
				circleblue.setOpaque(true);
				cp.add(circleblue);

			} else if (startFieldBlue[i] == "b4") {
				Circles circleblue = new Circles(Color.BLUE, "4", "");
				circleblue.setBounds(startFieldBlueX[i], startFieldBlueY[i], 61, 61);
				circleblue.setOpaque(true);
				cp.add(circleblue);
			}
			if (startFieldGreen[i] == "g1") {
				Circles circlegreen = new Circles(Color.GREEN, "1", "");
				circlegreen.setBounds(startFieldGreenX[i], startFieldGreenY[i], 61, 61);
				circlegreen.setOpaque(true);
				cp.add(circlegreen);

			} else if (startFieldGreen[i] == "g2") {
				Circles circlegreen = new Circles(Color.GREEN, "2", "");
				circlegreen.setBounds(startFieldGreenX[i], startFieldGreenY[i], 61, 61);
				circlegreen.setOpaque(true);
				cp.add(circlegreen);

			} else if (startFieldGreen[i] == "g3") {
				Circles circlegreen = new Circles(Color.GREEN, "3", "");
				circlegreen.setBounds(startFieldGreenX[i], startFieldGreenY[i], 61, 61);
				circlegreen.setOpaque(true);
				cp.add(circlegreen);

			} else if (startFieldGreen[i] == "g4") {
				Circles circlegreen = new Circles(Color.GREEN, "4", "");
				circlegreen.setBounds(startFieldGreenX[i], startFieldGreenY[i], 61, 61);
				circlegreen.setOpaque(true);
				cp.add(circlegreen);
			}
			if (startFieldYellow[i] == "y1") {
				Circles circleYellow = new Circles(Color.YELLOW, "1", "");
				circleYellow.setBounds(startFieldYellowX[i], startFieldYellowY[i], 61, 61);
				circleYellow.setOpaque(true);
				cp.add(circleYellow);

			} else if (startFieldYellow[i] == "y2") {
				Circles circleYellow = new Circles(Color.YELLOW, "2", "");
				circleYellow.setBounds(startFieldYellowX[i], startFieldYellowY[i], 61, 61);
				circleYellow.setOpaque(true);
				cp.add(circleYellow);

			} else if (startFieldYellow[i] == "y3") {
				Circles circleYellow = new Circles(Color.YELLOW, "3", "");
				circleYellow.setBounds(startFieldYellowX[i], startFieldYellowY[i], 61, 61);
				circleYellow.setOpaque(true);
				cp.add(circleYellow);

			} else if (startFieldYellow[i] == "y4") {
				Circles circleYellow = new Circles(Color.YELLOW, "4", "");
				circleYellow.setBounds(startFieldYellowX[i], startFieldYellowY[i], 61, 61);
				circleYellow.setOpaque(true);
				cp.add(circleYellow);
			}
		}
	}

	public void drawPlayground() {
		for (int i = 0; i < spielfeld.length; i++) {
			if (spielfeld[i] == "w") {
				Circles circleweiß = new Circles(Color.WHITE, "", "");
				circleweiß.setBounds(fieldsWhiteX[i], fieldsWhiteY[i], 61, 61);
				circleweiß.setOpaque(true);
				cp.add(circleweiß);

			} else if (spielfeld[i] == "Ar") {
				Circles circlered = new Circles(Color.RED, "", "");
				circlered.setBounds(fieldsWhiteX[i], fieldsWhiteY[i], 61, 61);
				circlered.setOpaque(true);
				cp.add(circlered);

			} else if (spielfeld[i] == "r1") {
				Circles circlered = new Circles(Color.RED, "1", "");
				circlered.setBounds(fieldsWhiteX[i], fieldsWhiteY[i], 61, 61);
				circlered.setOpaque(true);
				cp.add(circlered);
			} else if (spielfeld[i] == "r2") {
				Circles circlered = new Circles(Color.RED, "2", "");
				circlered.setBounds(fieldsWhiteX[i], fieldsWhiteY[i], 61, 61);
				circlered.setOpaque(true);
				cp.add(circlered);
			} else if (spielfeld[i] == "r3") {
				Circles circlered = new Circles(Color.RED, "3", "");
				circlered.setBounds(fieldsWhiteX[i], fieldsWhiteY[i], 61, 61);
				circlered.setOpaque(true);
				cp.add(circlered);
			} else if (spielfeld[i] == "r4") {
				Circles circlered = new Circles(Color.RED, "4", "");
				circlered.setBounds(fieldsWhiteX[i], fieldsWhiteY[i], 61, 61);
				circlered.setOpaque(true);
				cp.add(circlered);
			} else if (spielfeld[i] == "Ab") {
				Circles circleblue = new Circles(Color.BLUE, "", "");
				circleblue.setBounds(fieldsWhiteX[i], fieldsWhiteY[i], 61, 61);
				circleblue.setOpaque(true);
				cp.add(circleblue);

			} else if (spielfeld[i] == "b1") {
				Circles circleblue = new Circles(Color.BLUE, "1", "");
				circleblue.setBounds(fieldsWhiteX[i], fieldsWhiteY[i], 61, 61);
				circleblue.setOpaque(true);
				cp.add(circleblue);

			} else if (spielfeld[i] == "b2") {
				Circles circleblue = new Circles(Color.BLUE, "2", "");
				circleblue.setBounds(fieldsWhiteX[i], fieldsWhiteY[i], 61, 61);
				circleblue.setOpaque(true);
				cp.add(circleblue);

			} else if (spielfeld[i] == "b3") {
				Circles circleblue = new Circles(Color.BLUE, "3", "");
				circleblue.setBounds(fieldsWhiteX[i], fieldsWhiteY[i], 61, 61);
				circleblue.setOpaque(true);
				cp.add(circleblue);

			} else if (spielfeld[i] == "b4") {
				Circles circleblue = new Circles(Color.BLUE, "4", "");
				circleblue.setBounds(fieldsWhiteX[i], fieldsWhiteY[i], 61, 61);
				circleblue.setOpaque(true);
				cp.add(circleblue);

			} else if (spielfeld[i] == "Ag") {
				Circles circlegreen = new Circles(Color.GREEN, "", "");
				circlegreen.setBounds(fieldsWhiteX[i], fieldsWhiteY[i], 61, 61);
				circlegreen.setOpaque(true);
				cp.add(circlegreen);

			} else if (spielfeld[i] == "g1") {
				Circles circlegreen = new Circles(Color.GREEN, "1", "");
				circlegreen.setBounds(fieldsWhiteX[i], fieldsWhiteY[i], 61, 61);
				circlegreen.setOpaque(true);
				cp.add(circlegreen);

			} else if (spielfeld[i] == "g2") {
				Circles circlegreen = new Circles(Color.GREEN, "2", "");
				circlegreen.setBounds(fieldsWhiteX[i], fieldsWhiteY[i], 61, 61);
				circlegreen.setOpaque(true);
				cp.add(circlegreen);

			} else if (spielfeld[i] == "g3") {
				Circles circlegreen = new Circles(Color.GREEN, "3", "");
				circlegreen.setBounds(fieldsWhiteX[i], fieldsWhiteY[i], 61, 61);
				circlegreen.setOpaque(true);
				cp.add(circlegreen);

			} else if (spielfeld[i] == "g4") {
				Circles circlegreen = new Circles(Color.GREEN, "4", "");
				circlegreen.setBounds(fieldsWhiteX[i], fieldsWhiteY[i], 61, 61);
				circlegreen.setOpaque(true);
				cp.add(circlegreen);

			} else if (spielfeld[i] == "Ay") {
				Circles circleyellow = new Circles(Color.YELLOW, "", "");
				circleyellow.setBounds(fieldsWhiteX[i], fieldsWhiteY[i], 61, 61);
				circleyellow.setOpaque(true);
				cp.add(circleyellow);

			} else if (spielfeld[i] == "y1") {
				Circles circleyellow = new Circles(Color.YELLOW, "1", "");
				circleyellow.setBounds(fieldsWhiteX[i], fieldsWhiteY[i], 61, 61);
				circleyellow.setOpaque(true);
				cp.add(circleyellow);

			} else if (spielfeld[i] == "y2") {
				Circles circleyellow = new Circles(Color.YELLOW, "2", "");
				circleyellow.setBounds(fieldsWhiteX[i], fieldsWhiteY[i], 61, 61);
				circleyellow.setOpaque(true);
				cp.add(circleyellow);

			} else if (spielfeld[i] == "y3") {
				Circles circleyellow = new Circles(Color.YELLOW, "3", "");
				circleyellow.setBounds(fieldsWhiteX[i], fieldsWhiteY[i], 61, 61);
				circleyellow.setOpaque(true);
				cp.add(circleyellow);

			} else if (spielfeld[i] == "y4") {
				Circles circleyellow = new Circles(Color.YELLOW, "4", "");
				circleyellow.setBounds(fieldsWhiteX[i], fieldsWhiteY[i], 61, 61);
				circleyellow.setOpaque(true);
				cp.add(circleyellow);
			}
		}
	}

	public static void onEvent(String s) {
		jTextArea1.append(s + "\n");
	}

	public static void onEvent(int i) {
		jTextArea1.append(i + "\n");
	}
}
