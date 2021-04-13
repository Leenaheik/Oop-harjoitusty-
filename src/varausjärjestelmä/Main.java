package varausj‰rjestelm‰;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		K‰ytt‰j‰ k = new K‰ytt‰j‰ (k); 
		J‰rjestelm‰ j = new J‰rjestelm‰(k);
		Scanner s = new Scanner(System.in);
		
		System.out.println ("Oletko:"); 
		System.out.println ("1. Asukas"); 
		System.out.println ("2. Talonmies");
		int valinta = s.nextInt(); 
			if (valinta == 1) {
				K‰ytt‰j‰ k = new Asukas (null);
			}else if (valinta == 2) {
				K‰ytt‰j‰ k = new P‰‰k‰ytt‰j‰();
			}
		j.suorita();
		s.close();
	}
}
