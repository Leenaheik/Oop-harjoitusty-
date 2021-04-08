package varausjärjestelmä;

import java.util.Scanner;


public interface Käyttäjä {
	
	public abstract void tulostaValikko();
	
	public abstract void suoritaToiminto (Toiminto toiminto, Scanner s);
}