package varausj�rjestelm�;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

//import tallennusjalataus.varausj�rjestelm�.Varaus;

public class J�rjestelm� {
	HashMap<Date, ArrayList<Varaus>> varaukset; 
	K�ytt�j� k; 
	Scanner s; 
	int toiminto; 
	
	public J�rjestelm� (K�ytt�j� k) {
		this.k = k;
	}

	public void suorita() {
		k.tulostaValikko();
		int toiminto = s.nextInt();

		
		k.suoritaToiminto(toiminto, s);
		s.close();
			
	}

}
