package gui;

import java.awt.Image;
import java.util.Date;
import java.util.Random;

public class GameLogic {

	private int randNum;
	public int[] fieldsWhiteX = { 380, 380, 380, 380, 380, 467, 555, 555, 555, 555, 555, 642, 724, 806, 888, 888, 888,
			806, 724, 642, 555, 555, 555, 555, 555, 467, 380, 380, 380, 380, 380, 293, 211, 126, 38, 38, 38, 124, 208,
			292 };
	public int[] fieldsWhiteY = { 366, 284, 202, 120, 38, 38, 38, 120, 202, 284, 366, 366, 366, 366, 366, 454, 542, 542,
			542, 542, 542, 624, 706, 788, 870, 870, 870, 788, 706, 624, 542, 542, 542, 542, 542, 454, 366, 366, 366,
			366 };

	public int[] redwinfieldX = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 293, 211, 126, 38, 38, 124, 208, 292, 380 };
	public int[] redwinfieldY = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 542, 542, 542, 542, 454, 454, 454, 454, 454 };
	public int[] bluewinfieldX = { 0, 380, 380, 380, 380, 467, 467, 467, 467, 467 };
	public int[] bluewinfieldY = { 0, 284, 202, 120, 38, 38, 120, 202, 284, 366 };
	public int[] greenwinfieldX = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 642, 724, 806, 888, 888, 806, 724, 642, 555 };
	public int[] greenwinfieldY = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 366, 366, 366, 366, 454, 454, 454, 454, 454 };
	public int[] yellowwinfieldX = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 555, 555, 555, 555,
			467, 467, 467, 467, 467 };
	public int[] yellowwinfieldY = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 542, 624, 706, 788,
			870, 870, 788, 706, 624, 542 };

	public boolean[] belegteSpielfelder = { false, false, false, false, false, false, false, false, false, false, false,
			false, false, false, false, false // länge 41
			, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false };

	public void logic() {
		System.out.println("\tWillkommen bei dem Spiel Mensch Ärgere Dich nicht\n\n");
		delay(1000);
		System.out.println(" Spieler 1 : " + LoadGui.startScreen.playground.textfield1.getText());
		System.out.println(" Spieler 2 : " + LoadGui.startScreen.playground.textfield2.getText());
		System.out.println(" Spieler 3 : " + LoadGui.startScreen.playground.textfield3.getText());
		System.out.println(" Spieler 4 : " + LoadGui.startScreen.playground.textfield4.getText());
		System.out.println("\nAls erstes setzen alle Spieler eine Figur auf das Startfeld");
		LoadGui.startScreen.playground.redone.setBounds(fieldsWhiteX[36], fieldsWhiteY[36], 61, 61);
		delay(1000);
		LoadGui.startScreen.playground.blueone.setBounds(fieldsWhiteX[6], fieldsWhiteY[6], 61, 61);
		delay(1000);
		LoadGui.startScreen.playground.greenone.setBounds(fieldsWhiteX[16], fieldsWhiteY[16], 61, 61);
		delay(1000);
		LoadGui.startScreen.playground.yellowone.setBounds(fieldsWhiteX[26], fieldsWhiteY[26], 61, 61);
		delay(3000);
		System.out.println("\nNun würfeln die Spieler darum wer anfängt\n");
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
			// System.out.println(duplikate[0]+""+duplikate[1]+""+duplikate[2]+""+duplikate[3]);
			if (u >= 2) {
				System.out.println("\nDuplikate gefunden, es wird neu gewürfelt."); // Baustelle funktioniert noch nicht
			} else {
				System.out.println("\nDas Spiel geht los");
				System.out.println("Spieler " + firstN + " fängt an.");
			}
		}
		int w = wuerfeln();
		int redone = 36;
		int redtwo = 36;
		int two = 6;
		int three = 16;
		int foure = 26;
		int redoneentfernung = 43;
		int redtwoentfernung = 43;
		int twoentfernung = 43;
		int threeentfernung = 43;
		int foureentfernung = 43;
		int rotspielerdraußen = 1;
		boolean rot1imZiel = false;
		int num;
		boolean b = true;
		while (b == true) {
			w = wuerfeln();
			delay(1000);
			System.out.println("Spieler " + firstN + " hat eine " + w + " gewürfelt.");
			switch (firstZ) {
			case 1:
				try {
					// Falls Spieler rot eine Sechs würfelt und Startfeld leer ist
					if (rotspielerdraußen == 1 && belegteSpielfelder[36] == false && w == 6) {
						System.out.println(LoadGui.startScreen.playground.textfield1.getText()
								+ " hat eine 6 gewürfelt und darf eine Figur raussetzen.");
						LoadGui.startScreen.playground.redtwo.setBounds(fieldsWhiteX[redtwo], fieldsWhiteY[redtwo], 61,
								61);
						belegteSpielfelder[redtwo] = true;
						rotspielerdraußen++;
						delay(1000);
						System.out
								.println(LoadGui.startScreen.playground.textfield1.getText() + " darf nochmal würfeln");
						w = wuerfeln();
						belegteSpielfelder[redtwo] = false;
						redtwo = redtwo + w;
						if (redtwo > 39) {
							redtwo = redtwo - 40;
						}
						if (belegteSpielfelder[redtwo] == false) {
							LoadGui.startScreen.playground.redtwo.setBounds(fieldsWhiteX[redtwo], fieldsWhiteY[redtwo],
									61, 61);
							redtwoentfernung = redtwoentfernung - w;
							belegteSpielfelder[redtwo] = true;
						} else {
							System.out.println("Dieses Feld ist belegt, daher Zug nicht möglich.");
						}
						firstZ++;
						firstN = LoadGui.startScreen.playground.textfield2.getText();
						break;
					}
					// wenn 2 spieler von rot draußen sind
					if (rotspielerdraußen == 2) {
//						num = rand.nextInt(2);
						num = zufall();
						if(num==1) // spieler eins wird bewegt
						{
							if(rot1imZiel==true)
							{
								firstZ++;
								firstN = LoadGui.startScreen.playground.textfield2.getText();
								break;
							}
						if (redoneentfernung <= 9) {
							belegteSpielfelder[redone] = false;
							redone = redone + w;
							if (belegteSpielfelder[redone] == false) {
								LoadGui.startScreen.playground.redone.setBounds(redwinfieldX[redone],
										redwinfieldY[redone], 61, 61);
								belegteSpielfelder[redone] = true;
								redoneentfernung = redoneentfernung - w;
							} else {
								System.out.println("Dieses Feld ist belegt, daher Zug nicht möglich.");
							}
							firstZ++;
							firstN = LoadGui.startScreen.playground.textfield2.getText();
							if (redoneentfernung == 0) {
								System.out.println("\n\nDie erste Figur von"
										+ LoadGui.startScreen.playground.textfield1.getText() + " ist im Ziel");
								b = false;
							}
							break;
						}
						// out of bounds exception

						// normaler Spielzug von Spieler eins
						belegteSpielfelder[redone] = false;
						redone = redone + w;
						if (redone > 39) {
							redone = redone - 40;
						}
						if (belegteSpielfelder[redone] == false) {
							LoadGui.startScreen.playground.redone.setBounds(fieldsWhiteX[redone], fieldsWhiteY[redone],
									61, 61);
							belegteSpielfelder[redone] = true;
							redoneentfernung = redoneentfernung - w;
						} else {
							System.out.println("Dieses Feld ist belegt, daher Zug nicht möglich.");
							redone = redone - w;
							if(redone<0)
							{
								redone = redone + 40;
							}
						}
						firstZ++;
						firstN = LoadGui.startScreen.playground.textfield2.getText();
						break;
						}
						else { //spielfigur 2 wird bewegt
							if (redtwoentfernung <= 9) {
								belegteSpielfelder[redtwo] = false;
								redtwo = redtwo + w;
								if (belegteSpielfelder[redtwo] == false) {
									LoadGui.startScreen.playground.redtwo.setBounds(redwinfieldX[redtwo],
											redwinfieldY[redtwo], 61, 61);
									belegteSpielfelder[redtwo] = true;
									redtwoentfernung = redtwoentfernung - w;
								} else {
									System.out.println("Dieses Feld ist belegt, daher Zug nicht möglich.");
								}
								firstZ++;
								firstN = LoadGui.startScreen.playground.textfield2.getText();
								if (redtwoentfernung == 0) {
									System.out.println("\n\nDie erste Figur von"
											+ LoadGui.startScreen.playground.textfield1.getText() + " ist im Ziel");
									b = false;
								}
								break;
							}
							belegteSpielfelder[redtwo] = false;
							redtwo = redtwo + w;
							if (redtwo > 39) {
								redtwo = redtwo - 40;
							}
							if (belegteSpielfelder[redtwo] == false) {
								LoadGui.startScreen.playground.redtwo.setBounds(fieldsWhiteX[redtwo], fieldsWhiteY[redtwo],
										61, 61);
								belegteSpielfelder[redtwo] = true;
								redtwoentfernung = redtwoentfernung - w;
							} else {
								System.out.println("Dieses Feld ist belegt, daher Zug nicht möglich.");
								redtwo = redtwo - w;
								if(redtwo<0)
								{
									redtwo = redtwo + 40;
								}
							}
							firstZ++;
							firstN = LoadGui.startScreen.playground.textfield2.getText();
							break;
							}
						}
					//wenn nur eine Spielfigur draußen ist
				if(rotspielerdraußen==1)
				{
				if (redoneentfernung <= 9) {
					belegteSpielfelder[redone] = false;
					redone = redone + w;
					if (belegteSpielfelder[redone] == false) {
						LoadGui.startScreen.playground.redone.setBounds(redwinfieldX[redone],
								redwinfieldY[redone], 61, 61);
						belegteSpielfelder[redone] = true;
						redoneentfernung = redoneentfernung - w;
					} else {
						System.out.println("Dieses Feld ist belegt, daher Zug nicht möglich.");
					}
					firstZ++;
					firstN = LoadGui.startScreen.playground.textfield2.getText();
					if (redoneentfernung == 0) {
						System.out.println("\n\nDie erste Figur von"
						+ LoadGui.startScreen.playground.textfield1.getText() + " ist im Ziel");
						rot1imZiel = true;
					}
					break;
				}
				belegteSpielfelder[redone] = false;
				redone = redone + w;
				if (redone > 39) {
					redone = redone - 40;
				}
				if (belegteSpielfelder[redone] == false) {
					LoadGui.startScreen.playground.redone.setBounds(fieldsWhiteX[redone], fieldsWhiteY[redone],
							61, 61);
					belegteSpielfelder[redone] = true;
					redoneentfernung = redoneentfernung - w;
				} else {
					System.out.println("Dieses Feld ist belegt, daher Zug nicht möglich.");
					redone = redone - w;
					if(redone<0)
					{
						redone = redone + 40;
					}
				}
				firstZ++;
				firstN = LoadGui.startScreen.playground.textfield2.getText();
				break;
				}
				}
				 catch (Exception e) {
					 if(randNum==1) //Exception für Spieler 1 bei 2 Spielern draußen
					 {
					System.out.println("Dieser Zug ist nicht möglich");
					redone = redone - w;
					LoadGui.startScreen.playground.redone.setBounds(redwinfieldX[redone], redwinfieldY[redone], 61, 61);
					belegteSpielfelder[redone] = true;
					firstZ++;
					firstN = LoadGui.startScreen.playground.textfield2.getText();
					break;
					// TODO: handle exception
					 }
					 if(randNum==0)
					 {
						 System.out.println("Dieser Zug ist nicht möglich");
							redtwo = redtwo - w;
							LoadGui.startScreen.playground.redtwo.setBounds(redwinfieldX[redtwo], redwinfieldY[redtwo], 61, 61);
							belegteSpielfelder[redtwo] = true;
							firstZ++;
							firstN = LoadGui.startScreen.playground.textfield2.getText();
							break;
					 }
					 else
						 System.out.println("Dieser Zug ist nicht möglich");
						redone = redone - w;
						LoadGui.startScreen.playground.redone.setBounds(redwinfieldX[redone], redwinfieldY[redone], 61, 61);
						belegteSpielfelder[redone] = true;
						firstZ++;
						firstN = LoadGui.startScreen.playground.textfield2.getText();
						break;
						// TODO: handle exception
				}
				
				
				
				
				
			case 2:
				try {
					if (twoentfernung <= 9) {
						belegteSpielfelder[two] = false;
						two = two + w;
						if (belegteSpielfelder[two] == false) {
							LoadGui.startScreen.playground.blueone.setBounds(bluewinfieldX[two], bluewinfieldY[two], 61,
									61);
							belegteSpielfelder[two] = true;
							twoentfernung = twoentfernung - w;
						} else {
							System.out.println("Dieses Feld ist belegt, daher Zug nicht möglich.");
							two = two - w;
						}
						firstZ++;
						firstN = LoadGui.startScreen.playground.textfield3.getText();
						if (twoentfernung == 0) {
							System.out.println("\n\nDie erste Figur von"
									+ LoadGui.startScreen.playground.textfield2.getText() + " ist im Ziel");
							b = false;
						}
						break;
					}
				} catch (Exception e) {
					System.out.println("Dieser Zug ist nicht möglich");
					two = two - w;
					belegteSpielfelder[two] = true;
					LoadGui.startScreen.playground.blueone.setBounds(bluewinfieldX[two], bluewinfieldY[two], 61, 61);
					firstZ++;
					firstN = LoadGui.startScreen.playground.textfield3.getText();
					break;
					// TODO: handle exception
				}
				belegteSpielfelder[two] = false;
				two = two + w;
				if (two > 39) {
					two = two - 40;
				}
				if (belegteSpielfelder[two] == false) {
					LoadGui.startScreen.playground.blueone.setBounds(fieldsWhiteX[two], fieldsWhiteY[two], 61, 61);
					belegteSpielfelder[two] = true;
					twoentfernung = twoentfernung - w;
				} else {
					System.out.println("Dieses Feld ist belegt, daher Zug nicht möglich.");
					two = two - w;
					if(two<0)
					{
						two = two + 40;
					}
				}
				firstZ++;
				firstN = LoadGui.startScreen.playground.textfield3.getText();
				break;
				
				
				
				
			case 3:
				try {
					if (threeentfernung <= 9) {
						belegteSpielfelder[three] = false;
						three = three + w;
						if (belegteSpielfelder[three] == false) {
							LoadGui.startScreen.playground.greenone.setBounds(greenwinfieldX[three],
									greenwinfieldY[three], 61, 61);
							belegteSpielfelder[three] = true;
							threeentfernung = threeentfernung - w;
						} else {
							System.out.println("Dieses Feld ist belegt, daher Zug nicht möglich.");
							three = three - w;
						}
						firstZ++;
						firstN = LoadGui.startScreen.playground.textfield4.getText();
						if (threeentfernung == 0) {
							System.out.println("\n\nDie erste Figur von"
									+ LoadGui.startScreen.playground.textfield3.getText() + " ist im Ziel");
							b = false;
						}
						break;
					}
				} catch (Exception e) {
					System.out.println("Dieser Zug ist nicht möglich");
					three = three - w;
					belegteSpielfelder[three] = true;
					LoadGui.startScreen.playground.greenone.setBounds(greenwinfieldX[three], greenwinfieldY[three], 61,
							61);
					firstZ++;
					firstN = LoadGui.startScreen.playground.textfield4.getText();
					break;
					// TODO: handle exception
				}
				belegteSpielfelder[three] = false;
				three = three + w;
				if (three > 39) {
					three = three - 40;
				}
				if (belegteSpielfelder[three] == false) {
					LoadGui.startScreen.playground.greenone.setBounds(fieldsWhiteX[three], fieldsWhiteY[three], 61, 61);
					belegteSpielfelder[three] = true;
					threeentfernung = threeentfernung - w;
				} else {
					System.out.println("Dieses Feld ist belegt, daher Zug nicht möglich.");
					three = three - w;
					if(three<0)
					{
						three = three + 40;
					}
				}
				firstZ++;
				firstN = LoadGui.startScreen.playground.textfield4.getText();
				break;
				
				
				
				
			case 4:
				try {
					if (foureentfernung <= 9) {
						belegteSpielfelder[foure] = false;
						foure = foure + w;
						if (belegteSpielfelder[foure] == false) {
							LoadGui.startScreen.playground.yellowone.setBounds(yellowwinfieldX[foure],
									yellowwinfieldY[foure], 61, 61);
							belegteSpielfelder[foure] = true;
							foureentfernung = foureentfernung - w;
						} else {
							System.out.println("Dieses Feld ist belegt, daher Zug nicht möglich.");
							foure = foure - w;
						}
						firstZ = 1;
						firstN = LoadGui.startScreen.playground.textfield1.getText();
						System.out.println("");
						if (foureentfernung == 0) {
							System.out.println("\n\nDie erste Figur von"
									+ LoadGui.startScreen.playground.textfield4.getText() + " ist im Ziel");
							b = false;
						}
						break;
					}
				} catch (Exception e) {
					System.out.println("Dieser Zug ist nicht möglich");
					foure = foure - w;
					belegteSpielfelder[foure] = true;
					LoadGui.startScreen.playground.yellowone.setBounds(yellowwinfieldX[foure], yellowwinfieldY[foure],
							61, 61);
					firstZ = 1;
					firstN = LoadGui.startScreen.playground.textfield1.getText();
					System.out.println("");
					break;
					// TODO: handle exception
				}
				belegteSpielfelder[foure] = false;
				foure = foure + w;
				if (foure > 39) {
					foure = foure - 40;
				}
				if (belegteSpielfelder[foure] == false) {
					LoadGui.startScreen.playground.yellowone.setBounds(fieldsWhiteX[foure], fieldsWhiteY[foure], 61,
							61);
					belegteSpielfelder[foure] = true;
					foureentfernung = foureentfernung - w;
				} else {
					System.out.println("Dieses Feld ist belegt, daher Zug nicht möglich.");
					foure = foure - w;
					if(foure<0)
					{
						foure = foure + 40;
					}
				}
				firstZ = 1;
				firstN = LoadGui.startScreen.playground.textfield1.getText();
				System.out.println("");
				break;
			}
			w = 0;
		}
	}

	public int getOut(int firstZ) {
		switch (firstZ) {
		case 1:
			LoadGui.startScreen.playground.redone.setBounds(fieldsWhiteX[36], fieldsWhiteY[36], 61, 61);
			break;
		case 2:
			LoadGui.startScreen.playground.blueone.setBounds(fieldsWhiteX[6], fieldsWhiteY[6], 61, 61);
			break;
		case 3:
			LoadGui.startScreen.playground.yellowone.setBounds(fieldsWhiteX[26], fieldsWhiteY[26], 61, 61);
			break;
		case 4:
			LoadGui.startScreen.playground.greenone.setBounds(fieldsWhiteX[16], fieldsWhiteY[16], 61, 61);
			firstZ = 1;
			break;
		}
		return 0;
	}

	public int wuerfeln() {
		Random ran = new Random();
		randNum = ran.nextInt(6) + 1;
		return randNum;
	}
	
	public int zufall()
	{
		Random zufallRandom = new Random();
		randNum = zufallRandom.nextInt(2);
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
