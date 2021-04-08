package varausjärjestelmä;

import java.util.Scanner;

public class Asukas implements Käyttäjä{
	
	@Override
	public void tulostaValikko() {
		System.out.println ("Valitse toiminto:");
		System.out.println ("Uusi varaus");
		System.out.println ("Muokkaa varausta");
		System.out.println ("Poista varaus");
		System.out.println ("Näytä varaus");
		
	}

	@Override
	public void suoritaToiminto(Toiminto toiminto, Scanner s) {
		if (toiminto == Toiminto.UUSI) {
			// uusiVaraus()
		} else if (toiminto == Toiminto.MUOKKAA){
			// muokkaaVarausta()
		} else if (toiminto == Toiminto.POISTA){
			// poista varaus ()
		} else if (toiminto == Toiminto.NÄYTÄ){
			// tulosta varaus()
		} else {
			System.out.println("Tuntematon toiminto!");
		}
		
	}

}
