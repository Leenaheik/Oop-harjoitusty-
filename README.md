# Oop-harjoitustyö- pyykkituvan varausjärjestelmä

Koodi on vielä erittäin kesken, pahoittelut siitä. Tallennus ja lataus -toimintoon en ole vielä edes päässyt, saati kaikkiin metodeihinkaan.. 

Kysymyksiä
Main: Kayttäjä k = new Asukas(); 
  tuosta eclipse herjaa tuon olion luonnin yhteydessä. Ennen sitä täytyisi tietty laittaa se syöte, että onko käyttäjä asukas, vai pääkäyttäjä, mutta jumahdin nyt tuohon         olion luomiseen
  Samoin Mainissa Eclipe herjaa tuosta Scanner s = new Scanner(System.in), tuosta s-nimestä tuossa mainissa, että sitä ei käytetä
  
Järjestelmä: Toiminto toiminto = s.nextLine();
		          k.suoritaToiminto(toiminto, s);
  Nuo kaksi riviä ei tahdo toimia, kun kommentoin ne pois, saan ohjelman tulostamaan sen valikon, mutta siitä eteenpäin en ole päässyt. 
  Eclipse herjaa tuosta s.nextLine(); Type mismatch, cannot convert from String to toiminto.
  
Asukas: Tarkoitus siis olisi, että "asukas"-käyttäjältä kysytään siis asunto varausta tehdessä, jolloin varaukseen tallentuu asunnon numero (esim A23) ja sitten pvm ja kellonaika, ihan niinkuin normaalissa varauskalenterissa. Laitoin sen asunnon muuttujaksi sinne Asukas-luokkaan, ja rakensin sen muutenkin kasaan, näyttääköhän se yhtään siltä, miltä pitäisi? 

