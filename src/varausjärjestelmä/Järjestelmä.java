package varausjärjestelmä;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

//import tallennusjalataus.varausjärjestelmä.Varaus;

public class Järjestelmä {
	HashMap<Date, ArrayList<Varaus>> varaukset; 
	Käyttäjä k; 
	Scanner s; 
	Toiminto toiminto; 
	
	public Järjestelmä (Käyttäjä k) {
		this.k = k;
	}

	public void suorita() {
		k.tulostaValikko();

		Toiminto toiminto = s.nextLine();
		k.suoritaToiminto(toiminto, s);
			
	}

}
