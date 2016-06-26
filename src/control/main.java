package control;
/*
		                 INFOS:
		                 
		                 
		zvtxt: zu verschlüsselnder text als string
		arrtxt: zu verschlüsselnder text als array
		arrvtxt: verschlüsselter text als array
		"stelle" ist die jeweilige stelle im arrtxt
		

		vogel quax zwickt johnys pferd bim
		
		for(int i = 0; i < arrztxt.length; i++)
				{
					System.out.print(arrztxt[i] + " | ");
				}
 */

import view.GUI;

public class main {

	static int stelle = 0;
	static int stelleint = 0;
	public static int datum;
	

	//static String zvtxt = "herr krause mag liebend gern sahnespritzer";// zu verschluesselnder String
	//static String zetxt = "kpllwhl#3zpwy#cw4dpxp75wcpl7wz#k7pzild8epl";// zu entschluesselnder String

/*
	static char[] arrtxt = GUI.zvtxt.toCharArray();//zu verschluesselnder array
	static int[] arrztxt = new int[arrtxt.length];// zwischenstufe
	static char[] arrvtxt = new char[arrtxt.length];//verschluesselter array

	static char[] arrzetxt = GUI.zetxt.toCharArray();//zu entschluesselnder array
	static int[] arrzzetxt = new int[arrtxt.length];// zwischenstufe
	static char[] arretxt = new char[arrtxt.length];//entschluesselter array
*/


	public static void verschlüsseln()
	{

		char[] arrtxt = GUI.zvtxt.toCharArray();//zu verschluesselnder array
		int[] arrztxt = new int[arrtxt.length];// zwischenstufe
		char[] arrvtxt = new char[arrtxt.length];//verschluesselter array
		
		for(stelle = 0; stelle < arrtxt.length;)
		{

			switch(arrtxt[stelle])
			{
			case 'a': arrztxt[stelle] = 100; break;
			case 'b': arrztxt[stelle] = 101; break;
			case 'c': arrztxt[stelle] = 102; break;
			case 'd': arrztxt[stelle] = 103; break;
			case 'e': arrztxt[stelle] = 104; break;
			case 'f': arrztxt[stelle] = 105; break;
			case 'g': arrztxt[stelle] = 106; break;
			case 'h': arrztxt[stelle] = 107; break;
			case 'i': arrztxt[stelle] = 108; break;
			case 'j': arrztxt[stelle] = 109; break;
			case 'k': arrztxt[stelle] = 110; break;
			case 'l': arrztxt[stelle] = 111; break;
			case 'm': arrztxt[stelle] = 112; break;
			case 'n': arrztxt[stelle] = 113; break;
			case 'o': arrztxt[stelle] = 114; break;
			case 'p': arrztxt[stelle] = 115; break;
			case 'q': arrztxt[stelle] = 116; break;
			case 'r': arrztxt[stelle] = 117; break;
			case 's': arrztxt[stelle] = 118; break;
			case 't': arrztxt[stelle] = 119; break;
			case 'u': arrztxt[stelle] = 120; break;
			case 'v': arrztxt[stelle] = 121; break;
			case 'w': arrztxt[stelle] = 122; break;
			case 'x': arrztxt[stelle] = 123; break;
			case 'y': arrztxt[stelle] = 124; break;
			case 'z': arrztxt[stelle] = 125; break;
			case ' ': arrztxt[stelle] = 126; break;
			default: System.out.println("ERROR 1");
			}

			stelle = stelle + 1;


			if(stelle == arrztxt.length)
			{
				System.out.println("Stufe 1 der Verschlüsselung abgeschlossen");
			}

		}



		for(stelle = 0; stelle < arrztxt.length;)
		{

			switch(arrztxt[stelle] + datum)
			{
			case 100: arrvtxt[stelle] = '+'; break;
			case 101: arrvtxt[stelle] = '#'; break;
			case 102: arrvtxt[stelle] = 'x'; break;
			case 103: arrvtxt[stelle] = 'u'; break;
			case 104: arrvtxt[stelle] = '5'; break;
			case 105: arrvtxt[stelle] = 'p'; break;
			case 106: arrvtxt[stelle] = '9'; break;
			case 107: arrvtxt[stelle] = 'c'; break;
			case 108: arrvtxt[stelle] = 'k'; break;
			case 109: arrvtxt[stelle] = 'd'; break;
			case 110: arrvtxt[stelle] = 'b'; break;
			case 111: arrvtxt[stelle] = 'h'; break;
			case 112: arrvtxt[stelle] = '4'; break;
			case 113: arrvtxt[stelle] = 'y'; break;
			case 114: arrvtxt[stelle] = '7'; break;
			case 115: arrvtxt[stelle] = '1'; break;
			case 116: arrvtxt[stelle] = 'i'; break;
			case 117: arrvtxt[stelle] = '6'; break;
			case 118: arrvtxt[stelle] = 'l'; break;
			case 119: arrvtxt[stelle] = 'z'; break;
			case 120: arrvtxt[stelle] = '8'; break;
			case 121: arrvtxt[stelle] = '3'; break;
			case 122: arrvtxt[stelle] = 'ü'; break;
			case 123: arrvtxt[stelle] = 'f'; break;
			case 124: arrvtxt[stelle] = 'ä'; break;
			case 125: arrvtxt[stelle] = 'v'; break;
			case 126: arrvtxt[stelle] = 'e'; break;
			case 127: arrvtxt[stelle] = 'w'; break;
			case 128: arrvtxt[stelle] = 'q'; break;
			case 129: arrvtxt[stelle] = 'o'; break;
			case 130: arrvtxt[stelle] = 'g'; break;
			case 131: arrvtxt[stelle] = 'n'; break;
			default: System.out.println("ERROR 2");
			}

			stelle = stelle + 1;

			if(stelle == arrvtxt.length)
			{
				System.out.println("Stufe 2 der Verschlüsselung abgeschlossen");
				
				String verschlüsseltertxtstring = new String(arrvtxt); //verschlüsselten Text in String konvertieren
				System.out.println("\nIhr Text als Geheimcode:");
				System.out.println(verschlüsseltertxtstring);
				
				GUI.textField_1.setText(""+verschlüsseltertxtstring);
			}

		}

	}

	public static void entschlüsseln()
	{
		char[] arrzetxt = GUI.zetxt.toCharArray();//zu entschluesselnder array
		int[] arrzzetxt = new int[arrzetxt.length];// zwischenstufe
		char[] arretxt = new char[arrzetxt.length];//entschluesselter array
		
		for(stelle = 0; stelle < arrzetxt.length;)
		{

			switch(arrzetxt[stelle])
			{
			case '+': arrzzetxt[stelle] = 100; break;
			case '#': arrzzetxt[stelle] = 101; break;
			case 'x': arrzzetxt[stelle] = 102; break;
			case 'u': arrzzetxt[stelle] = 103; break;
			case '5': arrzzetxt[stelle] = 104; break;
			case 'p': arrzzetxt[stelle] = 105; break;
			case '9': arrzzetxt[stelle] = 106; break;
			case 'c': arrzzetxt[stelle] = 107; break;
			case 'k': arrzzetxt[stelle] = 108; break;
			case 'd': arrzzetxt[stelle] = 109; break;
			case 'b': arrzzetxt[stelle] = 110; break;
			case 'h': arrzzetxt[stelle] = 111; break;
			case '4': arrzzetxt[stelle] = 112; break;
			case 'y': arrzzetxt[stelle] = 113; break;
			case '7': arrzzetxt[stelle] = 114; break;
			case '1': arrzzetxt[stelle] = 115; break;
			case 'i': arrzzetxt[stelle] = 116; break;
			case '6': arrzzetxt[stelle] = 117; break;
			case 'l': arrzzetxt[stelle] = 118; break;
			case 'z': arrzzetxt[stelle] = 119; break;
			case '8': arrzzetxt[stelle] = 120; break;
			case '3': arrzzetxt[stelle] = 121; break;
			case 'ü': arrzzetxt[stelle] = 122; break;
			case 'f': arrzzetxt[stelle] = 123; break;
			case 'ä': arrzzetxt[stelle] = 124; break;
			case 'v': arrzzetxt[stelle] = 125; break;
			case 'e': arrzzetxt[stelle] = 126; break;
			case 'w': arrzzetxt[stelle] = 127; break;
			case 'q': arrzzetxt[stelle] = 128; break;
			case 'o': arrzzetxt[stelle] = 129; break;
			case 'g': arrzzetxt[stelle] = 130; break;
			case 'n': arrzzetxt[stelle] = 131; break;
			default: System.out.println("ERROR 2");
			}

			stelle = stelle + 1;

			if(stelle == arrzetxt.length)
			{
				System.out.println("\n\n\nStufe 1 der Entschlüsselung abgeschlossen");
			}

		}
		
		

		for(stelle = 0; stelle < arrzzetxt.length;)
		{

			switch(arrzzetxt[stelle] - datum)
			{
			case 100: arretxt[stelle] = 'a'; break;
			case 101: arretxt[stelle] = 'b'; break;
			case 102: arretxt[stelle] = 'c'; break;
			case 103: arretxt[stelle] = 'd'; break;
			case 104: arretxt[stelle] = 'e'; break;
			case 105: arretxt[stelle] = 'f'; break;
			case 106: arretxt[stelle] = 'g'; break;
			case 107: arretxt[stelle] = 'h'; break;
			case 108: arretxt[stelle] = 'i'; break;
			case 109: arretxt[stelle] = 'j'; break;
			case 110: arretxt[stelle] = 'k'; break;
			case 111: arretxt[stelle] = 'l'; break;
			case 112: arretxt[stelle] = 'm'; break;
			case 113: arretxt[stelle] = 'n'; break;
			case 114: arretxt[stelle] = 'o'; break;
			case 115: arretxt[stelle] = 'p'; break;
			case 116: arretxt[stelle] = 'q'; break;
			case 117: arretxt[stelle] = 'r'; break;
			case 118: arretxt[stelle] = 's'; break;
			case 119: arretxt[stelle] = 't'; break;
			case 120: arretxt[stelle] = 'u'; break;
			case 121: arretxt[stelle] = 'v'; break;
			case 122: arretxt[stelle] = 'w'; break;
			case 123: arretxt[stelle] = 'x'; break;
			case 124: arretxt[stelle] = 'y'; break;
			case 125: arretxt[stelle] = 'z'; break;
			case 126: arretxt[stelle] = ' '; break;
			default: System.out.println("ERROR 2");
			}

			stelle = stelle + 1;

			if(stelle == arrzzetxt.length)
			{
				System.out.println("Stufe 2 der Entschlüsselung abgeschlossen");
				
				String entschlüsseltertxtstring = new String(arretxt); //entschlüsselten Text in String konvertieren
				System.out.println("\nIhr entschlüsseter Geheimcode:");
				System.out.println(entschlüsseltertxtstring);

				GUI.textField.setText(""+entschlüsseltertxtstring);
			}

		}

	}
	
	
}

		
		




	