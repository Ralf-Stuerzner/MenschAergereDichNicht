package MenschAergereDichNicht;
import java.util.Scanner;
import java.util.Random;
import java.lang.reflect.Array;
import java.lang.Boolean; 


public class Main {

	public static int wuerfeln(){
		Random ran = new Random();
		int randNum = ran.nextInt(6) + 1;
		return randNum;
	}

  public static void main(String[] args) {

    // alle 4 Spieler bekommen einen Namen per Eingabe
    Scanner name = new Scanner(System.in);
    int zahl = 1;
	System.out.println("Name von Spieler " + zahl + ":");
    String spielerName1 = name.nextLine();
	Spieler sp1 = new Spieler(spielerName1);
   	zahl++;
   	System.out.println("Name von Spieler " + zahl + ":");
    String spielerName2 = name.nextLine();
	Spieler sp2 = new Spieler(spielerName2);
	zahl++;
	System.out.println("Name von Spieler " + zahl + ":");
    String spielerName3 = name.nextLine();
	Spieler sp3 = new Spieler(spielerName3);
	zahl++;
	System.out.println("Name von Spieler " + zahl + ":");
    String spielerName4 = name.nextLine();
	Spieler sp4 = new Spieler(spielerName4);
    System.out.println(sp1.getSpielerName());
    

    int u = 0; //Variable um Duplikate zu zaehlen
    int [] duplikate = {0,0,1,1};
    while(!(((duplikate[0]==0) && (duplikate[1]==0) && (duplikate[2]==0) && (duplikate[3]==0)) || ((duplikate[0]==0) && (duplikate[1]==0) && (duplikate[2]==0) && (duplikate[3]==1)) || ((duplikate[0]==0) && (duplikate[1]==0) && (duplikate[3]==0) && (duplikate[2]==1)) || ((duplikate[0]==0) && (duplikate[2]==0) && (duplikate[3]==0) && (duplikate[1]==1)) || ((duplikate[1]==0) && (duplikate[2]==0) && (duplikate[3]==0) && (duplikate[0]==1))) ){

      for (int x = 0; x<(duplikate.length); x++) {
        duplikate[x] = 0;
      }
      /* 0 heisst Schleife verlassen, das wird spaeter entfernt, ist nur als Erklaerung da
      0000 0
      0001 0
      0010 0
      0011 1
      0100 0
      0101 1
      0110 1
      0111 1
      1000 0
      1001 1
      1010 1
      1011 1
      1100 1
      1101 1
      1110 1
      1111 1
      */


    // jeder der 4 Spieler wuerfelt eine Zahl, der mit der größten fängt an
    int [] wuerfel = {wuerfeln(), wuerfeln(), wuerfeln(), wuerfeln()};
    System.out.println("Augenzahlen: "+wuerfel[0]+""+wuerfel[1]+""+wuerfel[2]+""+wuerfel[3]);
    int y = 0;
    for (int x = 0; x<(wuerfel.length-1); x++) {
      if(wuerfel[x] > wuerfel[x+1]){
        if (wuerfel[x] > y) {
          y = wuerfel[x];
        }
     } else{
      if (wuerfel[x+1]>y) {
        y = wuerfel[x+1];
      }
     }
    }
    System.out.println(y + " ist die höchste Augenzahl");
    //auf Duplikate prüfen
    u=0;
    for (int x = 0; x<wuerfel.length; x++) {
      if (y == wuerfel[x]) {
        duplikate[x] = 1;
        u++;
      } else{
          duplikate[x] = 0;
      }
    }
    }
      //System.out.println(duplikate[0]+""+duplikate[1]+""+duplikate[2]+""+duplikate[3]);
    if (u>=2) {
      System.out.println("Es gibt mehrere groesste Zahlen"); // Baustelle funktioniert noch nicht
    } else{
      System.out.println("Das Spiel geht los");
    }
  }
  }
