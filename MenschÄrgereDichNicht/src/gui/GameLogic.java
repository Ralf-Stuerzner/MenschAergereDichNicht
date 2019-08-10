package gui;

import java.util.Date;
import java.util.Random;

public class GameLogic {

	private int randNum;
	private int figuren[][]= {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
	private int[] start= {4,4,4,4};
	private int[][] haus = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
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
//		LoadGui.startScreen.playground.greenone.setBounds(380, 366, 61, 61);

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
		int spieler=0;
		if(firstN==LoadGui.startScreen.playground.textfield1.getText())
		{
			spieler=1;
		}
		if(firstN==LoadGui.startScreen.playground.textfield2.getText())
		{
			spieler=2;
		}
		if(firstN==LoadGui.startScreen.playground.textfield3.getText())
		{
			spieler=3;
		}
		if(firstN==LoadGui.startScreen.playground.textfield4.getText())
		{
			spieler=4;
		}
		LoadGui.startScreen.playground.blueone.setBounds(467, 366, 61, 61);

		game(spieler);

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

	public int[] bubblesort(int[] zusortieren) // Bubblesort Methode zum sortieren eines Feldes mit Integern. Von// groÃŸ nach klein.													
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
	
	public int game(int spieler)
	{
		boolean gewinn=false;
		int wuerfel=0,counter=0;
		spieler-=1;
		do {
			if(start[spieler]==4)
			{
				while((wuerfel!=6)&&(counter<3))
				{
					wuerfel=wuerfeln();
					System.out.println(name(spieler)+" hat eine "+wuerfel + "gewürfelt.");
					counter++;
				}
				counter=0;
				if(wuerfel==6)
				{
					start[spieler]--;
					System.out.println(name(spieler)+" kommt raus.");
					delay(1000);
					raus(spieler);
					do {
						delay(1000);
						wuerfel=wuerfeln();
						System.out.println(name(spieler)+" hatt eine "+wuerfel+" gewürfelt.");
						if(haus(spieler,wuerfel))
						{
							move(spieler,wuerfel);
						}
					}while(wuerfel==6);
				}
			}
			else
			{
				wuerfel=wuerfeln();
				System.out.println(name(spieler)+" hat eine "+wuerfel + " gewürfelt.");
				delay(1000);
				if(haus(spieler,wuerfel))
				{
					move(spieler,wuerfel);
				}
			}
			//gewinn prüfung
			if(haus[spieler][0]+haus[spieler][1]+haus[spieler][2]+haus[spieler][3]==1)
			{
				System.out.println(name(spieler)+"gewinnt");
				gewinn=true;
			}
			//spielerwechsel
			spieler=spielerwechsel(spieler);
			
		}while(gewinn==false);
		spieler+=1;
		return spieler;
	}
	
	public void raus(int spieler)
	{
		switch(spieler)
		{
		case 0:
			LoadGui.startScreen.playground.redone.setBounds(fieldsWhiteX[36], fieldsWhiteY[36], 61, 61);
			figuren[0][0]=36;
			break;
		case 1:
			LoadGui.startScreen.playground.blueone.setBounds(fieldsWhiteX[6], fieldsWhiteY[6], 61, 61);
			figuren[1][0]=6;
			break;
		case 3:
			LoadGui.startScreen.playground.greenone.setBounds(fieldsWhiteX[16], fieldsWhiteY[16], 61, 61);
			figuren[2][0]=16;
			break;
		case 2:
			LoadGui.startScreen.playground.yellowone.setBounds(fieldsWhiteX[26], fieldsWhiteY[26], 61, 61);
			figuren[3][0]=26;
			break;
		}
		
	}
	public String name(int spieler)
	{
		String firstN="fehler";
		if(spieler==0)
		{
			firstN=LoadGui.startScreen.playground.textfield1.getText();
		}
		else if(spieler==1)
		{
			firstN=LoadGui.startScreen.playground.textfield2.getText();
		}
		else if(spieler==2)
		{
			firstN=LoadGui.startScreen.playground.textfield3.getText();
		}
		else if(spieler==3)
		{
			firstN=LoadGui.startScreen.playground.textfield4.getText();
		}
		return firstN;
	}
	public int spielerwechsel(int spieler)
	{
		if(spieler==3)
		{
			spieler=0;
		}
		else
		{
			spieler++;
		}
		return spieler;
	}
	//figuren wechsel!!
	public void move(int spieler,int x)
	{
		
		switch(spieler)
		{
		case 0:

				figuren[0][0]+=x;
		
				if(figuren[0][0]>=39)
				{
					figuren[0][0]-=39;
				}
			
				schlagen(spieler);
				LoadGui.startScreen.playground.redone.setBounds(fieldsWhiteX[figuren[0][0]], fieldsWhiteY[figuren[0][0]], 61, 61);
	
			break;
		case 1:

				haus(spieler,x);
				figuren[1][0]+=x;
				if(figuren[1][0]>=39)
				{
					figuren[1][0]-=39;
				}
		
				schlagen(spieler);
				LoadGui.startScreen.playground.blueone.setBounds(fieldsWhiteX[figuren[1][0]], fieldsWhiteY[figuren[1][0]], 61, 61);
	
			break;
		case 3:

				haus(spieler,x);
				figuren[2][0]+=x;
				if(figuren[2][0]>=39)
				{
					figuren[2][0]-=39;
				}

				schlagen(spieler);
				LoadGui.startScreen.playground.greenone.setBounds(fieldsWhiteX[figuren[2][0]], fieldsWhiteY[figuren[2][0]], 61, 61);
	
			break;
		case 2:

		
				figuren[3][0]+=x;
				if(figuren[3][0]>=39)
				{
					figuren[3][0]-=39;
				}
		
				schlagen(spieler);
				LoadGui.startScreen.playground.yellowone.setBounds(fieldsWhiteX[figuren[3][0]], fieldsWhiteY[figuren[3][0]], 61, 61);
	
			break;
		}
	}
	public void schlagen(int spieler)
	{
		for(int i=0;i<4;i++)
		{

			for(int n=0;n<4;n++)
			{

				if((figuren[i][n]!=0)&&(figuren[i][n]==figuren[spieler][0])&&(i!=spieler))//figurenwechsel
				{
					figuren[i][n]=0;
					start[i]++;
					System.out.println(name(spieler)+" schlägt "+name(i));
					switch(i)
					{
					case 0:
						LoadGui.startScreen.playground.redone.setBounds(10, 10, 61, 61);
						break;
					case 1:
						LoadGui.startScreen.playground.blueone.setBounds(840, 10, 61, 61);
						break;
					case 2:
						LoadGui.startScreen.playground.yellowone.setBounds(10, 820, 61, 61);
						break;
					case 3:
						LoadGui.startScreen.playground.greenone.setBounds(840, 820, 61, 61);
						break;
					}
				}
			}
		}
	}
	public boolean haus(int spieler,int wuerfel)
	{
		boolean aus=true;
		switch(spieler)
		{
		case 0:
			if((figuren[spieler][0]<=35)&&((figuren[spieler][0]+wuerfel)>35))
			{
				if(((figuren[spieler][0]+wuerfel-35)<4)&&((figuren[spieler][0]+wuerfel-35)>=0))
				{
					haus[spieler][figuren[spieler][0]+wuerfel-35]=1;
					System.out.println(name(spieler)+" hatt einen Stein im Haus auf Stelle "+(figuren[spieler][0]+wuerfel-35));
					switch(figuren[spieler][0]+wuerfel-35)
					{
					case 0:
						LoadGui.startScreen.playground.redone.setBounds(124, 454, 61, 61);
						break;
					case 1:
						LoadGui.startScreen.playground.redone.setBounds(208, 454, 61, 61);
						break;
					case 2:
						LoadGui.startScreen.playground.redone.setBounds(292, 454, 61, 61);
						break;
					case 3:
						LoadGui.startScreen.playground.redone.setBounds(380, 454, 61, 61);
						break;
					}
					figuren[spieler][0]=0;
					aus=false;
				}
			}
			break;
		case 1:
			if((figuren[spieler][0]<=5)&&((figuren[spieler][0]+wuerfel)>5))
			{
				if(((figuren[spieler][0]+wuerfel-5)<4)&&((figuren[spieler][0]+wuerfel-5)>=0))
				{
					haus[spieler][figuren[spieler][0]+wuerfel-5]=1;
					System.out.println(name(spieler)+" hatt einen Stein im Haus auf Stelle "+(figuren[spieler][0]+wuerfel-5));
					switch(figuren[spieler][0]+wuerfel-5)
					{
					case 0:
						LoadGui.startScreen.playground.blueone.setBounds(467, 120, 61, 61);
						break;
					case 1:
						LoadGui.startScreen.playground.blueone.setBounds(467, 202, 61, 61);
						break;
					case 2:
						LoadGui.startScreen.playground.blueone.setBounds(467, 284, 61, 61);
						break;
					case 3:
						LoadGui.startScreen.playground.blueone.setBounds(467, 366, 61, 61);
						break;
					}
					figuren[spieler][0]=0;
					aus=false;
				}
			}
			break;
		case 2:
			if((figuren[spieler][0]<=25)&&((figuren[spieler][0]+wuerfel)>25))
			{
				if(((figuren[spieler][0]+wuerfel-25)<4)&&((figuren[spieler][0]+wuerfel-25)>=0))
				{
					haus[spieler][figuren[spieler][0]+wuerfel-25]=1;
					System.out.println(name(spieler)+" hatt einen Stein im Haus auf Stelle "+(figuren[spieler][0]+wuerfel-25));
					switch(figuren[spieler][0]+wuerfel-25)
					{
					case 0:
						LoadGui.startScreen.playground.yellowone.setBounds(467, 788, 61, 61);
						break;
					case 1:
						LoadGui.startScreen.playground.yellowone.setBounds(467, 706, 61, 61);
						break;
					case 2:
						LoadGui.startScreen.playground.yellowone.setBounds(467, 624, 61, 61);
						break;
					case 3:
						LoadGui.startScreen.playground.yellowone.setBounds(467, 542, 61, 61);
						break;
					}
					figuren[spieler][0]=0;
					aus=false;
				}
			}
			break;
		case 3:
			if((figuren[spieler][0]<=15)&&((figuren[spieler][0]+wuerfel)>15))
			{
				if(((figuren[spieler][0]+wuerfel-15)<4)&&((figuren[spieler][0]+wuerfel-15)>=0))
				{
					haus[spieler][figuren[spieler][0]+wuerfel-15]=1;
					System.out.println(name(spieler)+" hatt einen Stein im Haus auf Stelle "+(figuren[spieler][0]+wuerfel-15));
					switch(figuren[spieler][0]+wuerfel-15)
					{
					case 0:
						LoadGui.startScreen.playground.greenone.setBounds(806, 454, 61, 61);
						break;
					case 1:
						LoadGui.startScreen.playground.greenone.setBounds(724, 454, 61, 61);
						break;
					case 2:
						LoadGui.startScreen.playground.greenone.setBounds(642, 454, 61, 61);
						break;
					case 3:
						LoadGui.startScreen.playground.greenone.setBounds(555, 454, 61, 61);
						break;
					}
					figuren[spieler][0]=0;
					aus=false;
				}
			}
			break;
		}
		return aus;
	}
}
