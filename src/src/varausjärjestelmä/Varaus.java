package varausj‰rjestelm‰;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.HashMap;

public class Varaus {
	
	private int toiminto; 
	private String asunto;
	private Date p‰iv‰m‰‰r‰;
	private int alkuaika; 
	private int loppuaika; 
	
	public Varaus (int toiminto, int alkuaika, int loppuaika, String asunto, Date p‰iv‰m‰‰r‰) {
		this. toiminto = toiminto; 
		this.alkuaika = alkuaika;
		this.loppuaika = loppuaika; 
		this.asunto = asunto;
		this.p‰iv‰m‰‰r‰ = p‰iv‰m‰‰r‰;
	}
	
	
	public Varaus luoVaraus() {
		return null; 
	}
	
}
