package varausjärjestelmä;

import java.util.Scanner;

public class Pääkäyttäjä implements Käyttäjä{

	@Override
	public void tulostaValikko() {
		System.out.println ("Valitse toiminto:");
		System.out.println ("1. Uusi varaus");
		System.out.println ("2. Muokkaa varausta");
		System.out.println ("3. Poista varaus");
		System.out.println ("4. Näytä varaus");
	}

	@Override
	public void suoritaToiminto(int toiminto, Scanner s) {
		
		
	}

}
