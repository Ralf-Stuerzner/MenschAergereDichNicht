package gui;

import java.util.Date;
import java.util.Random;

public class GameLogic {

	private int randNum;
	public int[] fieldsWhiteX = { 380, 380, 380, 380, 380, 467, 555, 555, 555, 555, 555, 642, 724, 806, 888, 888,
			888, 806, 724, 642, 555, 555, 555, 555, 555, 467, 380, 380, 380, 380, 380, 293, 211, 126, 38, 38, 38, 124,
			208, 292 };
	public int[] fieldsWhiteY = { 366, 284, 202, 120, 38, 38, 38, 120, 202, 284, 366, 366, 366, 366, 366, 454,
			542, 542, 542, 542, 542, 624, 706, 788, 870, 870, 870, 788, 706, 624, 542, 542, 542, 542, 542, 454, 366,
			366, 366 };
	public String[] gameStatus = new String[39];

	public void logic() {
		System.out.println("\tWillkommen bei dem Spiel Mensch Ärgere Dich nicht\n\n");
		delay(1000);
		System.out.println(" Spieler 1 : " + LoadGui.startScreen.playground.textfield1.getText());
		System.out.println(" Spieler 2 : " + LoadGui.startScreen.playground.textfield2.getText());
		System.out.println(" Spieler 3 : " + LoadGui.startScreen.playground.textfield3.getText());
		System.out.println(" Spieler 4 : " + LoadGui.startScreen.playground.textfield4.getText());
		System.out.println("\nDas Spiel geht los. Als erstes würfeln die Spieler darum wer anfängt.");
		delay(3000);
		LoadGui.startScreen.playground.greenone.setBounds(100, 200, 61, 61);

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
			// auf Duplikate prÃ¼fen
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
				System.out.println("Duplikate gefunden, es wird neu gewürfelt."); // Baustelle funktioniert noch nicht
			} else {
				System.out.println("Das Spiel geht los");
				System.out.println("Spieler " + firstN + " fängt an.");
			}
		}
	
		int[] start = new int[4]; //steine die nicht im spiel sind
		int[] feld = new int[40]; //felder im spiel vom roten start gezählt
		int merks = -1;//merke spieler und start((merks-1)*10)
		int merk = 0; //merke zahl
		int[] merke_pos = {0,0,0,0}; //merkt anzahl der figuren im spiel
		int[][] pos = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};	//position der spielfiguren 
		int counter = 0;
		boolean gewinn = false;
		int[][] haus = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
		
		for(int i=0;i<4;i++)
		{
			start[i]=4;
		}
		for(int i=0;i<40;i++)
		{
			feld[i]=0;
		}
		if(firstN==LoadGui.startScreen.playground.textfield1.getText())
		{
			merks=1;
		}
		if(firstN==LoadGui.startScreen.playground.textfield2.getText())
		{
			merks=2;
		}
		if(firstN==LoadGui.startScreen.playground.textfield3.getText())
		{
			merks=3;
		}
		if(firstN==LoadGui.startScreen.playground.textfield4.getText())
		{
			merks=4;
		}
		
		do {
			
			if(start[merks-1]==4)
			{
				System.out.println(firstN+" hat keinen Stein auf dem Spielfeld er darf dreimal würfeln.");
				while( (counter<3) && (merk!=6) )
				{
					merk=wuerfeln();
					counter++;
					System.out.println(firstN+" hat eine "+merk+" gewürfelt.");
				}
				counter=0;
				if(merk==6)
				{
					start[merks-1]-=1;
					merk=wuerfeln();
					System.out.println(firstN+" kommt raus und hat eine "+merk+" gewürfelt");
					while(merk==6)
					{
						merk=wuerfeln();
						//test das es im feld bleibt
						if(((merks==1)&&((pos[merks-1][merke_pos[merks-1]]+merk)>39))||((merks==2) && (((pos[merks-1][merke_pos[merks-1]]+merk)>9) &&(pos[merks-1][merke_pos[merks-1]])<=9)) ||	((merks==3) && (((pos[merks-1][merke_pos[merks-1]]+merk)>19) &&(pos[merks-1][merke_pos[merks-1]])<=19)) || ((merks==4) && (((pos[merks-1][merke_pos[merks-1]]+merk)>29) &&(pos[merks-1][merke_pos[merks-1]])<=29)))
						{
							switch(merks)
							{
							case 1:
								if(((pos[merks-1][merke_pos[merks-1]]+merk)-39)<=4)
								{
									haus[merks-1][((pos[merks-1][merke_pos[merks-1]]+merk)-39)]=merks;
									feld[pos[merks-1][merke_pos[merks-1]]]=0;
									pos[merks-1][merke_pos[merks-1]]=-1;
									merke_pos[merks-1]-=1;
								}
							case 2:
								if(((pos[merks-1][merke_pos[merks-1]]+merk)-9)<=4)
								{
									haus[merks-1][((pos[merks-1][merke_pos[merks-1]]+merk)-9)]=merks;
									feld[pos[merks-1][merke_pos[merks-1]]]=0;
									pos[merks-1][merke_pos[merks-1]]=-1;
									merke_pos[merks-1]-=1;
								}
							case 3:
								if(((pos[merks-1][merke_pos[merks-1]]+merk)-19)<=4)
								{
									haus[merks-1][((pos[merks-1][merke_pos[merks-1]]+merk)-19)]=merks;
									feld[pos[merks-1][merke_pos[merks-1]]]=0;
									pos[merks-1][merke_pos[merks-1]]=-1;
									merke_pos[merks-1]-=1;
								}
							case 4:
								if(((pos[merks-1][merke_pos[merks-1]]+merk)-29)<=4)
								{
									haus[merks-1][((pos[merks-1][merke_pos[merks-1]]+merk)-29)]=merks;
									feld[pos[merks-1][merke_pos[merks-1]]]=0;
									pos[merks-1][merke_pos[merks-1]]=-1;
									merke_pos[merks-1]-=1;
								}
							}
						}
						else
						{
							if((pos[merks-1][merke_pos[merks-1]]+merk)>39)
							{
								pos[merks-1][merke_pos[merks-1]]-=39;
							}
							feld[pos[merks-1][merke_pos[merks-1]]]=0;
							feld[pos[merks-1][merke_pos[merks-1]]+merk]=merks;
							System.out.println(firstN+" darf nochmal würfeln und hat eine "+merk+" gewürfelt");
						}
					}
					feld[((merks-1)*10)+merk]=merks;
					pos[merks-1][merke_pos[merks-1]]=((merks-1)*10)+merk;
					merke_pos[merks-1]+=1;
				}
			}
			else
			{
				merk=wuerfeln();
				System.out.println(firstN+" hat eine "+merk+" gewürfelt.");
				if((merk==6) && (start[merks-1]!=0))
				{
					start[merks-1]-=1;
					merk=wuerfeln();
					System.out.println(firstN+" kommt raus und hat eine "+merk+" gewürfelt");
					feld[((merks-1)*10)+merk]=merks;
					pos[merks-1][merke_pos[merks-1]]=((merks-1)*10)+merk;
					merke_pos[merks-1]+=1;
				}
				else if((merk==6) && (start[merks-1]==0))
				{
					while(merk==6)
					{
						merk=wuerfeln();
						//test das es im feld bleibt
						if(((merks==1)&&((pos[merks-1][merke_pos[merks-1]]+merk)>39))||((merks==2) && (((pos[merks-1][merke_pos[merks-1]]+merk)>9) &&(pos[merks-1][merke_pos[merks-1]])<=9)) ||	((merks==3) && (((pos[merks-1][merke_pos[merks-1]]+merk)>19) &&(pos[merks-1][merke_pos[merks-1]])<=19)) || ((merks==4) && (((pos[merks-1][merke_pos[merks-1]]+merk)>29) &&(pos[merks-1][merke_pos[merks-1]])<=29)))
						{
							switch(merks)
							{
							case 1:
								if(((pos[merks-1][merke_pos[merks-1]]+merk)-39)<=4)
								{
									haus[merks-1][((pos[merks-1][merke_pos[merks-1]]+merk)-39)]=merks;
									feld[pos[merks-1][merke_pos[merks-1]]]=0;
									pos[merks-1][merke_pos[merks-1]]=-1;
									merke_pos[merks-1]-=1;
								}
							case 2:
								if(((pos[merks-1][merke_pos[merks-1]]+merk)-9)<=4)
								{
									haus[merks-1][((pos[merks-1][merke_pos[merks-1]]+merk)-9)]=merks;
									feld[pos[merks-1][merke_pos[merks-1]]]=0;
									pos[merks-1][merke_pos[merks-1]]=-1;
									merke_pos[merks-1]-=1;
								}
							case 3:
								if(((pos[merks-1][merke_pos[merks-1]]+merk)-19)<=4)
								{
									haus[merks-1][((pos[merks-1][merke_pos[merks-1]]+merk)-19)]=merks;
									feld[pos[merks-1][merke_pos[merks-1]]]=0;
									pos[merks-1][merke_pos[merks-1]]=-1;
									merke_pos[merks-1]-=1;
								}
							case 4:
								if(((pos[merks-1][merke_pos[merks-1]]+merk)-29)<=4)
								{
									haus[merks-1][((pos[merks-1][merke_pos[merks-1]]+merk)-29)]=merks;
									feld[pos[merks-1][merke_pos[merks-1]]]=0;
									pos[merks-1][merke_pos[merks-1]]=-1;
									merke_pos[merks-1]-=1;
								}
							}
						}
						else
						{
							if((pos[merks-1][merke_pos[merks-1]]+merk)>39)
							{
								pos[merks-1][merke_pos[merks-1]]-=39;
							}
							System.out.println(firstN+" darf nochmal würfeln und hat eine "+merk+" gewürfelt");
							feld[pos[merks-1][merke_pos[merks-1]]]=0;
							feld[pos[merks-1][merke_pos[merks-1]]+merk]=merks;
						}
					}
				}	
				else
				{	
	
					if(((merks==1)&&((pos[merks-1][merke_pos[merks-1]]+merk)>39))||((merks==2) && (((pos[merks-1][merke_pos[merks-1]]+merk)>9) &&(pos[merks-1][merke_pos[merks-1]])<=9)) ||	((merks==3) && (((pos[merks-1][merke_pos[merks-1]]+merk)>19) &&(pos[merks-1][merke_pos[merks-1]])<=19)) || ((merks==4) && (((pos[merks-1][merke_pos[merks-1]]+merk)>29) &&(pos[merks-1][merke_pos[merks-1]])<=29)))
					{
						switch(merks)
						{
						case 1:
							if(((pos[merks-1][merke_pos[merks-1]]+merk)-39)<=4)
							{
								haus[merks-1][((pos[merks-1][merke_pos[merks-1]]+merk)-39)]=merks;
								feld[pos[merks-1][merke_pos[merks-1]]]=0;
								pos[merks-1][merke_pos[merks-1]]=-1;
								merke_pos[merks-1]-=1;
							}
						case 2:
							if(((pos[merks-1][merke_pos[merks-1]]+merk)-9)<=4)
							{
								haus[merks-1][((pos[merks-1][merke_pos[merks-1]]+merk)-9)]=merks;
								feld[pos[merks-1][merke_pos[merks-1]]]=0;
								pos[merks-1][merke_pos[merks-1]]=-1;
								merke_pos[merks-1]-=1;
							}
						case 3:
							if(((pos[merks-1][merke_pos[merks-1]]+merk)-19)<=4)
							{
								haus[merks-1][((pos[merks-1][merke_pos[merks-1]]+merk)-19)]=merks;
								feld[pos[merks-1][merke_pos[merks-1]]]=0;
								pos[merks-1][merke_pos[merks-1]]=-1;
								merke_pos[merks-1]-=1;
							}
						case 4:
							if(((pos[merks-1][merke_pos[merks-1]]+merk)-29)<=4)
							{
								haus[merks-1][((pos[merks-1][merke_pos[merks-1]]+merk)-29)]=merks;
								feld[pos[merks-1][merke_pos[merks-1]]]=0;
								pos[merks-1][merke_pos[merks-1]]=-1;
								merke_pos[merks-1]-=1;
							}
						}
					}
					else
					{
						if((pos[merks-1][merke_pos[merks-1]]+merk)>39)
						{
							pos[merks-1][merke_pos[merks-1]]-=39;
						}
						feld[pos[merks-1][merke_pos[merks-1]]]=0;
						feld[pos[merks-1][merke_pos[merks-1]]+merk]=merks;
						pos[merks-1][merke_pos[merks-1]]+=merk;
					}
				}
			}
			//gewinnbedingung
			for(int i = 0; i<4;i++)
			{
				merk=0;
				for(int n = 0; n<4;n++)
				{
					merk+=haus[i][n];
				}
				if(merk==4)
				{
					switch(i)
					{
					case 1:
						firstN=LoadGui.startScreen.playground.textfield1.getText();
						break;
					case 2:
						firstN=LoadGui.startScreen.playground.textfield2.getText();
						break;
					case 3:
						firstN=LoadGui.startScreen.playground.textfield3.getText();
						break;
					case 4:
						firstN=LoadGui.startScreen.playground.textfield4.getText();
						break;
					}
					System.out.println(firstN+" hat gewonnen!");
					gewinn=true;
				}
			}
			
			//nächster spieler
			if(merks==4)
			{
				merks=1;
				firstN=LoadGui.startScreen.playground.textfield1.getText();
			}
			else
			{
				merks++;
				switch(merks)
				{
				case 2:
					firstN=LoadGui.startScreen.playground.textfield2.getText();
					break;
				case 3:
					firstN=LoadGui.startScreen.playground.textfield3.getText();
					break;
				case 4:
					firstN=LoadGui.startScreen.playground.textfield4.getText();
					break;
				}
			}
			
			
		}while(gewinn==false);

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
														// groÃŸ nach klein.
	{
		int temp; // @param Variable zum Zwischenspeichern des Feldes.
		for (int i = 1; i < zusortieren.length; i++) // Schleife zum durchlaufen des Feldes
		{
			for (int j = 0; j < zusortieren.length - i; j++) // weitere Schleife zum sortieren des Feldes von groÃŸ nach
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
