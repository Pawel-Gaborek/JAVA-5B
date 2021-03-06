class Listenelement 
{
	String daten;
	Listenelement naechster;
	void setDaten(String datenNeu) 
	{	 
		daten = datenNeu;
		naechster = null; 
	}
	void anhaengen(String datenNeu) 
	{
		if (naechster == null) 
		{
			naechster = new Listenelement();
			naechster.setDaten(datenNeu); 
		}
		else 
		{
			naechster.anhaengen(datenNeu);
		}
		System.out.println("Daten " + datenNeu + " wurden eingefügt.");
	}
	void ausgeben() 
	{ 
		System.out.println(daten);
		if (naechster != null)
		{
			naechster.ausgeben();
		}
	}
	///////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////
	//======MEINE FUNKTIONEN=======START
	Listenelement getterNaechster(){return naechster;}
	String getterDaten(){return daten;}
	Listenelement endList()
	{
		Listenelement temp_naechster=naechster;
		while (temp_naechster.getterNaechster() != null)
		{
			temp_naechster = temp_naechster.getterNaechster();
		}
		return temp_naechster;
	}
	
	//======MEINE FUNKTIONEN=======STOP
	///////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////
}

public class Java5b_Aufgabe_5_2 
{
	public static void main(String[] args) 
	{
		System.out.println("/* ####################################################");
		System.out.println("Einsendeaufgabe 5.2 ");
		System.out.println("#################################################### */");
		
		Listenelement listenAnfang = new Listenelement();
		listenAnfang.setDaten("Element 1"); 
		for (int element = 2; element < 4; element++)
		{
			listenAnfang.anhaengen("Element " + element);
		}
		listenAnfang.ausgeben();
		///////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////
		//======MEINE CODE=======START
		
		Listenelement listenEnde = new Listenelement();
		listenEnde=listenAnfang.endList();
		System.out.println(listenEnde.getterDaten());
		
		for (int element=4; element < 15 ; element++)
		{
			listenEnde.anhaengen("Element " + element);
		}
		listenAnfang.ausgeben();
		listenEnde=listenEnde.endList();
		
		for (int element=15; element < 25 ; element++)
		{
			listenEnde.anhaengen("Element " + element);
		}
		listenEnde=listenEnde.endList();
		listenAnfang.ausgeben();
		
		//======MEINE CODE=======STOP
		///////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////
		
	}
}