package varausj�rjestelm�;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		K�ytt�j� k = new Asukas(); 
		J�rjestelm� j = new J�rjestelm�(k);
		Scanner s = new Scanner(System.in);
		
		j.suorita();
	}
}
