package varausj�rjestelm�;

import java.util.Scanner;


public interface K�ytt�j� {
	
	public abstract void tulostaValikko();
	
	public abstract void suoritaToiminto (Toiminto toiminto, Scanner s);
}