package varausjärjestelmä;

import java.util.Scanner;

public class Asukas implements Käyttäjä{
	private String asunto; 
		
	public Asukas (String asunto) {
		this.asunto = asunto;
	}

	public String annaAsunto() {
		return asunto; 
	}
	
	public void asetaAsunto(String asunto) {		
		if(asunto.length()<=3) {
			this.asunto = asunto; 
		}		
	}

	@Override
	public void tulostaValikko() {
		System.out.println ("Valitse toiminto:");
		System.out.println ("1. Uusi varaus");
		System.out.println ("2. Muokkaa varausta");
		System.out.println ("3. Poista varaus");
		System.out.println ("4. Näytä varaus");
		
	}

	@Override
	public void suoritaToiminto (int toiminto, Scanner s) {
		if (toiminto == 1) {
			System.out.println("Uusi varaus");
		} else if (toiminto == 2){
			System.out.println("Toiminto 2");
		} else if (toiminto == 3){
			System.out.println("Toiminto 3");
		} else if (toiminto == 4){
			System.out.println("Toiminto 4");
		} else {
			System.out.println("Tuntematon toiminto!");
		}
		
	}

}
