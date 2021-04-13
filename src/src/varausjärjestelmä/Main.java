package varausjärjestelmä;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Käyttäjä k = new Asukas(null); 
		Järjestelmä j = new Järjestelmä(k);
		Scanner s = new Scanner(System.in);
		
		j.suorita();
		s.close();
	}
}
