package gui;
import java.awt.Color;
import java.io.PrintStream;
import java.util.Date;
import java.util.Random;

public class LoadGui
{
	public static String playerOneNameString = new String("ComputerRot");
	public static String playerTwoNameString = new String("ComputerBlau");
	public static String playerThreeNameString = new String("ComputerGelb");
	public static String playerFourNameString = new String("ComputerGruen");
	public static int randNum;
	
	public static void main(String[] args)
	{
		 StartScreen startScreen = new StartScreen();
		 PrintStream someOtherStream = new PrintStream(System.out)
			{
				public void println(String s)
				{
					Playground.onEvent(s);
				}
				public void println(int i)
				{
					Playground.onEvent(i);
				}
			};
			System.setOut(someOtherStream);
			print();
	}
	
	public static void print()
	{
		delay(15000);
		System.out.println("\tWillkommen bei dem Spiel Mensch Ärgere Dich nicht\n\n") ;
		delay(1000);
		System.out.println(" Spieler 1 : " + playerOneNameString);
		delay(1000);
		System.out.println(" Spieler 2 : " + playerTwoNameString);
		delay(1000);
		System.out.println(" Spieler 3 : " + playerThreeNameString);
		delay(1000);
		System.out.println(" Spieler 4 : " + playerFourNameString);
		delay(1000);
		System.out.println("\n Hier wird in hoffentlich naher Zukunft der Spielverlauf ausgegeben..\n wer was gewürfelt hat, wer dran ist usw..:D");
		delay(1000);
		System.out.println("AugenZahl = ");
		while(randNum!=6)
		{
			delay(2000);
		Wuerfeln();
		if(randNum==6)
		{
			Playground.redone.setBounds(38, 366, 61, 61);
		}
		}
	}

	public static void Wuerfeln()
	{
		Random ran = new Random();
		randNum = ran.nextInt(6) + 1;
		System.out.println(randNum);
	}
	
	public static void delay(int t)
	{ 
        long ende = (new Date()).getTime() + t; 
        while( (new Date()).getTime() < ende )
        { 
            // abwarten und Tee trinken 
        } 
	}
	
	//GetterSetter
	public static String getPlayerOneNameString()
	{
		return playerOneNameString;
	}
	public static void setPlayerOneNameString(String playerOneNameString)
	{
		LoadGui.playerOneNameString = playerOneNameString;
	}
	public static String getPlayerTwoNameString()
	{
		return playerTwoNameString;
	}
	public static void setPlayerTwoNameString(String playerTwoNameString)
	{
		LoadGui.playerTwoNameString = playerTwoNameString;
	}

	public static String getPlayerThreeNameString() 
	{
		return playerThreeNameString;
	}

	public static void setPlayerThreeNameString(String playerThreeNameString)
	{
		LoadGui.playerThreeNameString = playerThreeNameString;
	}

	public static String getPlayerFourNameString() 
	{
		return playerFourNameString;
	}

	public static void setPlayerFourNameString(String playerFourNameString) 
	{
		LoadGui.playerFourNameString = playerFourNameString;
	}
	



	
}
