package gui;

import java.io.PrintStream;

public class LoadGui
{
	static StartScreen startScreen = new StartScreen();
	public static void main(String[] args)
	{
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
		 boolean t = true;
		 while(t==true)
		 {
			 if(startScreen.playground.isValid())
			 {
				 startScreen.playerNames.gameLogic.logic();
				 t=false;
			 }
		 }
	}
}
