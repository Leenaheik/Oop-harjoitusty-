package varausjärjestelmä;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Käyttäjä k = new Käyttäjä (k); 
		Järjestelmä j = new Järjestelmä(k);
		Scanner s = new Scanner(System.in);
		
		System.out.println ("Oletko:"); 
		System.out.println ("1. Asukas"); 
		System.out.println ("2. Talonmies");
		int valinta = s.nextInt(); 
			if (valinta == 1) {
				Käyttäjä k = new Asukas (null);
			}else if (valinta == 2) {
				Käyttäjä k = new Pääkäyttäjä();
			}
		j.suorita();
		s.close();
	}
}
