package Aufgaben;

import java.lang.Math;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aufgabe2_Scannerkassen {

	public static void main(String[] args) {
		
		char kategorie;
		String rabattsatz;
		int anzahl; 
		double preis, warenwert, rabatt, netto, mwst, brutto;
		List<Character> charList = new ArrayList<Character>();
		
		charList.add('A');
		charList.add('B');
		charList.add('C');
		charList.add('D');
		charList.add('E');
		
		System.out.print("Geben Sie die Anzahl der gekauften Maeuse ein: ");
		anzahl = main.scan.nextInt();
		System.out.print("Geben Sie den Preis pro Maus ein: ");
		preis = main.scan.nextDouble();
		System.out.print("Geben Sie die Kundenkategorie ein (A-F): ");
		kategorie = main.scan.next().charAt(0);
		
		
		if(charList.contains(kategorie)) {
			warenwert = anzahl*preis;
			switch(kategorie) {
			
			case 'A':
				rabattsatz = "Rabattsatz: 10%";
				rabatt = warenwert*0.1;
				break;
				
			case 'B':
				rabattsatz ="Rabattsatz: 12%";
				rabatt = warenwert*0.12;
				break;
				
			case 'C':
				rabattsatz ="Rabattsatz: 15%";
				rabatt = warenwert*0.15;
				break;
				
			case 'D':
				rabattsatz ="Rabattsatz: 20%";
				rabatt = warenwert*0.2;
				break;
				
			case 'E':
				rabattsatz ="Rabattsatz: 30%";
				rabatt = warenwert*0.3;
				break;
				
			default:
				rabattsatz = "Rabattsatz: kein Rabatt";
				rabatt = 0;
			}
			
			netto = warenwert-rabatt; 
			mwst = netto*0.19;
			mwst = mwst *100;
			mwst= Math.round(mwst); 
			mwst = mwst/100; 
			brutto = netto + mwst; 
			System.out.println(rabattsatz + "\nRabatt: "+rabatt+"\nNettowert: "+netto+"\nMehrwertsteuer: "+mwst+"\nBruttobetrag: "+brutto);
		}else {
			rabattsatz = "Rabattsatz: kein Rabatt";
		}
	}

}
