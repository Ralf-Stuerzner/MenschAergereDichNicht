package gui;

import java.io.PrintStream;

import javax.swing.JFrame;

public class LoadGui
{
	public static String playerOneNameString = new String("ComputerRot");
	public static String playerTwoNameString = new String("ComputerBlau");
	public static String playerThreeNameString = new String("ComputerGelb");
	public static String playerFourNameString = new String("ComputerGruen");
	public static void main(String[] args)
	{
		 StartScreen startScreen = new StartScreen();
		 PrintStream someOtherStream = new PrintStream(System.out)
			{
				public void println(String s)
				{
					Playground.onEvent(s);
				}
			};
			System.setOut(someOtherStream);
			System.out.println("\tWillkommen bei dem Spiel Mensch Ärgere Dich nicht\n\n") ;
			System.out.println(" Hier wird in hoffentlich naher Zukunft der Spielverlauf ausgegeben..\n wer was gewürfelt hat, wer dran ist usw..:D");
			
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
