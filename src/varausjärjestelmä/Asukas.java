package varausj�rjestelm�;

import java.util.Scanner;

public class Asukas implements K�ytt�j�{
	
	@Override
	public void tulostaValikko() {
		System.out.println ("Valitse toiminto:");
		System.out.println ("Uusi varaus");
		System.out.println ("Muokkaa varausta");
		System.out.println ("Poista varaus");
		System.out.println ("N�yt� varaus");
		
	}

	@Override
	public void suoritaToiminto(Toiminto toiminto, Scanner s) {
		if (toiminto == Toiminto.UUSI) {
			// uusiVaraus()
		} else if (toiminto == Toiminto.MUOKKAA){
			// muokkaaVarausta()
		} else if (toiminto == Toiminto.POISTA){
			// poista varaus ()
		} else if (toiminto == Toiminto.N�YT�){
			// tulosta varaus()
		} else {
			System.out.println("Tuntematon toiminto!");
		}
		
	}

}
