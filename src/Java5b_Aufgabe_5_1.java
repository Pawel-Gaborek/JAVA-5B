
public class Java5b_Aufgabe_5_1 
{

	private int volume;
	private int channel;
	private boolean switch_turn_off_on=false; 
	
	private void setterVolume(int vol)
	{
		volume=vol;
	}
	private void setterChannel(int chann)
	{
		channel=chann;
	}
	private void setterSwitch(boolean switch_turn)
	{
		switch_turn_off_on=switch_turn;
	}
	private int getterVolume()
	{
		return volume;
	}
	private int getterChannel()
	{
		return channel;
	}
	private boolean getterSwitch()
	{
		return switch_turn_off_on;
	}
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////
	private boolean changeVolume(int vol)
	{
		if(switch_turn_off_on==true)
		{
			setterVolume(vol);
			return true;
		}
		else
		{
			return false;
		}
	}
	private boolean changeChannel(int chann)
	{
		if(switch_turn_off_on==true)
		{
			setterChannel(chann);
			return true;
		}
		else
		{
			return false;
		}
	}
	private boolean changeSwitch()
	{
		if(switch_turn_off_on==true)
		{
			setterSwitch(false);
			return false;
		}
		else
		{
			setterSwitch(true);
			return true;
		}
	}
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////
	public static void main(String[] args)
	{
		System.out.println("/* ####################################################");
		System.out.println("Einsendeaufgabe 5.1 ");
		System.out.println("#################################################### */");
		Java5b_Aufgabe_5_1 television = new Java5b_Aufgabe_5_1();
		if(television.getterSwitch()==false) {System.out.println("Fernseher ist ausgeschaltet");}else {System.out.println("Fernseher ist eingeschaltet");}
		if(television.changeVolume(10)==true) {System.out.println("Lautstaerke wurde geaendert und betraegt 10");}else {System.out.println("Lautstaerke wurde nicht geaendert");}
		if(television.changeSwitch()==true) {System.out.println("Fernseher wurde korrekt EINgeschaltet");}else {System.out.println("Fernseher wurde ausgeschaltet");}
		if(television.getterSwitch()==false) {System.out.println("Fernseher ist ausgeschaltet");}else {System.out.println("Fernseher ist eingeschaltet");}
		if(television.changeVolume(10)==true) {System.out.println("Lautstaerke wurde geaendert und betraegt 10");}else {System.out.println("Lautstaerke wurde nicht geaendert");}
		if(television.changeChannel(4)==true) {System.out.println("Programm wurde korrekt geaendert");}else {System.out.println("Programm wurde nicht geaendert");}
		if(television.changeChannel(3)==true) {System.out.println("Programm wurde korrekt geaendert");}else {System.out.println("Programm wurde nicht geaendert");}
		if(television.changeChannel(50)==true) {System.out.println("Programm wurde korrekt geaendert");}else {System.out.println("Programm wurde nicht geaendert");}
		if(television.changeSwitch()==true) {System.out.println("Fernseher wurde korrekt EINgeschaltet");}else {System.out.println("Fernseher wurde ausgeschaltet");}
		if(television.getterSwitch()==false) {System.out.println("Fernseher ist ausgeschaltet");}else {System.out.println("Fernseher ist eingeschaltet");}
	}
}
