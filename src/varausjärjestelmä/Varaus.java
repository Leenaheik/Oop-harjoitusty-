package varausjärjestelmä;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.HashMap;

public class Varaus {
	
	private int toiminto; 
	private String asunto;
	private Date päivämäärä;
	private int alkuaika; 
	private int loppuaika; 
	
	public Varaus (int toiminto, int alkuaika, int loppuaika, String asunto, Date päivämäärä) {
		this. toiminto = toiminto; 
		this.alkuaika = alkuaika;
		this.loppuaika = loppuaika; 
		this.asunto = asunto;
		this.päivämäärä = päivämäärä;
	}
	
	
	public Varaus luoVaraus() {
		ArrayList <String> varaukset = new ArrayList <> ();  
		
		return null; 
	}
	
}
