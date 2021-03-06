class Listenelement_
{
	String daten;
	Listenelement_ naechster;
	Listenelement_ previous;
	void setDaten(String datenNeu) 
	{	 
		daten = datenNeu;
		naechster = null;
		previous = null;
	}
	
	void setDatenWithPrevious(String datenNeu, Listenelement_ previous_) 
	{	 
		daten = datenNeu;
		naechster = null;
		previous = previous_;
	}
	void anhaengen(String datenNeu, Listenelement_ previous_) 
	{
		if (naechster == null) 
		{
			naechster = new Listenelement_();
			naechster.setDatenWithPrevious(datenNeu, previous_);
		}
		else 
		{
			naechster.anhaengen(datenNeu, naechster);
		}
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
	// die Liste wird ausgedruckt - VARIANTE 1 rekursiv
	void ausgebenFromEndList() 
	{ 
		System.out.println(daten);
		if (previous != null)
		{
			previous.ausgebenFromEndList();
		}
	}
	// die Liste wird ausgedruckt - VARIANTE 2
	void ausgebenFromEndList_2() 
	{ 
		Listenelement_ temp_previous=previous;
		while (temp_previous != null)
		{
			System.out.println(temp_previous.getterDaten());
			temp_previous = temp_previous.getterPrevious();
		}
	}
	Listenelement_ getterNaechster(){return naechster;}
	Listenelement_ getterPrevious(){return previous;}
	String getterDaten(){return daten;}
	Listenelement_ endList()
	{
		Listenelement_ temp_naechster=naechster;
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

public class Java5b_Aufgabe_5_3 
{
	public static void main (String[] args)
	{
		System.out.println("/* ####################################################");
		System.out.println("Einsendeaufgabe 5.3 ");
		System.out.println("#################################################### */");
		
		Listenelement_ mm = new Listenelement_();
		
		Listenelement_ listenAnfang = new Listenelement_();
		listenAnfang.setDaten("Element 1"); 
		for (int element = 2; element < 21; element++)
		{
			listenAnfang.anhaengen("Element " + element, listenAnfang);
		}
		listenAnfang.ausgeben();
		///////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////
		//======MEINE CODE=======START
		
		Listenelement_ listenEnde = new Listenelement_();
		listenEnde=listenAnfang.endList();
		listenEnde.ausgebenFromEndList_2();
		listenEnde.ausgebenFromEndList();
		//======MEINE CODE=======STOP
		///////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////
	}
}
