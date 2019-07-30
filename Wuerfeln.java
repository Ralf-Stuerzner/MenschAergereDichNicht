package MenschAergereDichNicht;
import java.util.Random;

class Wuerfeln{
	public static int Wuerfeln(){
		Random ran = new Random();
		int randNum = ran.nextInt(6) + 1;
		return randNum;
	}
}