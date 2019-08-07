package gui;

import java.util.Date;
import java.util.Random;

public class GameLogic {

	private int randNum;
	public String w;
	
	public void logic() {
		System.out.println("\tWillkommen bei dem Spiel Mensch Ärgere Dich nicht\n\n");
		delay(1000);
		System.out.println(" Spieler 1 : " + LoadGui.startScreen.playground.textfield1.getText());
		System.out.println(" Spieler 2 : " + LoadGui.startScreen.playground.textfield2.getText());
		System.out.println(" Spieler 3 : " + LoadGui.startScreen.playground.textfield3.getText());
		System.out.println(" Spieler 4 : " + LoadGui.startScreen.playground.textfield4.getText());
		System.out.println("\nDas Spiel geht los. Als erstes würfeln die Spieler darum wer anfängt.");
		delay(3000);

		String firstN = "";
		int firstZ = 0;
		int[] duplikate = { 0, 0, 1, 1 };
		// wenn keine Duplikate vorhanden
		while (!(((duplikate[0] == 0) && (duplikate[1] == 0) && (duplikate[2] == 0) && (duplikate[3] == 0))
				|| ((duplikate[0] == 0) && (duplikate[1] == 0) && (duplikate[2] == 0) && (duplikate[3] == 1))
				|| ((duplikate[0] == 0) && (duplikate[1] == 0) && (duplikate[3] == 0) && (duplikate[2] == 1))
				|| ((duplikate[0] == 0) && (duplikate[2] == 0) && (duplikate[3] == 0) && (duplikate[1] == 1))
				|| ((duplikate[1] == 0) && (duplikate[2] == 0) && (duplikate[3] == 0) && (duplikate[0] == 1)))) {
			for (int x = 0; x < (duplikate.length); x++) {
				duplikate[x] = 0;
			}
			int[] wuerfel = { wuerfeln(), wuerfeln(), wuerfeln(), wuerfeln() };
			int[] wuerfelSp = { 0, 0, 0, 0 };
			for (int x = 0; x < wuerfel.length; x++) {
				wuerfelSp[x] = wuerfel[x];
			}
			System.out.println(" " + LoadGui.startScreen.playground.textfield1.getText() + " hat eine " + wuerfel[0]
					+ " gewürfelt.  ");
			System.out.println(" " + LoadGui.startScreen.playground.textfield2.getText() + " hat eine " + wuerfel[1]
					+ " gewürfelt. ");
			System.out.println(" " + LoadGui.startScreen.playground.textfield3.getText() + " hat eine " + wuerfel[2]
					+ " gewürfelt. ");
			System.out.println(" " + LoadGui.startScreen.playground.textfield4.getText() + " hat eine " + wuerfel[3]
					+ " gewürfelt. ");

			bubblesort(wuerfel);
			System.out.println("\n " + wuerfel[0] + " ist die höchste Augenzahl");
			// auf Duplikate prüfen
			int u = 0;
			firstZ = 0;
			for (int y = 0; y < wuerfelSp.length; y++) {
				if (wuerfelSp[y] == wuerfel[0]) {
					duplikate[y] = 1;
					u++;
					firstZ = y + 1;
					switch (firstZ) {
					case 1:
						firstN = LoadGui.startScreen.playground.textfield1.getText();
						break;
					case 2:
						firstN = LoadGui.startScreen.playground.textfield2.getText();
						break;
					case 3:
						firstN = LoadGui.startScreen.playground.textfield3.getText();
						break;
					case 4:
						firstN = LoadGui.startScreen.playground.textfield4.getText();
						break;
					}

				} else {
					duplikate[y] = 0;
				}
			}
			if (u >= 2) {
				System.out.println("Duplikate gefunden, es wird neu gewürfelt.");
			} else {
				System.out.println("Das Spiel geht los");
				System.out.println("Spieler " + firstN + " fängt an.");
			}
		}
		
		LoadGui.startScreen.playground.setSpielfigur(6, "b1");
		LoadGui.startScreen.playground.setSpielfigur(16, "g1");
		LoadGui.startScreen.playground.setSpielfigur(26, "y1");
		LoadGui.startScreen.playground.setSpielfigur(36, "r1");
		
		LoadGui.startScreen.playground.drawPlayground(); // warum geht das nicht?
		
		LoadGui.startScreen.playground.getSpielStand();
 
		
		int w = wuerfeln();
		System.out.println(firstN + " würfelt eine " + w);
		delay(1000);
		
		/*
		if (w == 6) {
			switch (firstZ) {
			case 1:
				LoadGui.startScreen.playground.spielfeld[3] = "r";
				//LoadGui.startScreen.playground.redone.setBounds(fieldsWhiteX[(36 + w)], fieldsWhiteY[(36 + w)], 61, 61);
				break;
			case 2:
				LoadGui.startScreen.playground.spielfeld[3] = "g";
				//LoadGui.startScreen.playground.blueone.setBounds(fieldsWhiteX[(36 + w)], fieldsWhiteY[(36 + w)], 61,61);
				break;
			case 3:
				LoadGui.startScreen.playground.spielfeld[3] = "y";
				//LoadGui.startScreen.playground.yellowone.setBounds(fieldsWhiteX[(36 + w)], fieldsWhiteY[(36 + w)], 61,61);
				break;
			case 4:
				LoadGui.startScreen.playground.spielfeld[3] = "b";
				//LoadGui.startScreen.playground.blueone.setBounds(fieldsWhiteX[(36 + w)], fieldsWhiteY[(36 + w)], 61,61);
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + firstZ);
			}
		}
		*/
	}

	public int wuerfeln() {
		Random ran = new Random();
		randNum = ran.nextInt(6) + 1;
		return randNum;
	}

	public void delay(int t) {
		long ende = (new Date()).getTime() + t;
		while ((new Date()).getTime() < ende) {
			// abwarten und Tee trinken
		}
	}	

	public int[] bubblesort(int[] zusortieren) // Bubblesort Methode zum sortieren eines Feldes mit Integern. Von
												// groß nach klein.
	{
		int temp; // @param Variable zum Zwischenspeichern des Feldes.
		for (int i = 1; i < zusortieren.length; i++) // Schleife zum durchlaufen des Feldes
		{
			for (int j = 0; j < zusortieren.length - i; j++) // weitere Schleife zum sortieren des Feldes von groß nach
																// klein.
			{
				if (zusortieren[j] < zusortieren[j + 1]) // Beim erreichen des vorletzten Elementes im Feld wird das
															// neue sortierte Feld erschaffen.
				{
					temp = zusortieren[j];
					zusortieren[j] = zusortieren[j + 1];
					zusortieren[j + 1] = temp;
				}
			}
		}
		return zusortieren;
	}
}