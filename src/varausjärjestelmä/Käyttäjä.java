package varausjärjestelmä;

import java.util.Scanner;


public interface Käyttäjä {
	
	public abstract void tulostaValikko();
	
	public abstract void suoritaToiminto (int toiminto, Scanner s);
}