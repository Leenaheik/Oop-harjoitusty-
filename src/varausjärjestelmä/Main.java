package varausjärjestelmä;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Käyttäjä k = null;
		Scanner s = new Scanner(System.in);
		
		System.out.println ("Oletko:"); 
		System.out.println ("1. Asukas"); 
		System.out.println ("2. Talonmies");
		int valinta = s.nextInt(); 
			if (valinta == 1) {
		k = new Asukas (null);
			}else if (valinta == 2) {
		k = new Pääkäyttäjä();
			}else {
		System.out.println ("Virheellinen valinta! Valitse 1 tai 2");
			}
			
		Järjestelmä j = new Järjestelmä(k);
			
		j.suorita();
		s.close();
	}
}
