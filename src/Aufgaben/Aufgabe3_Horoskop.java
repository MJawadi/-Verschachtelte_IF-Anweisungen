package Aufgaben;

import java.util.ArrayList;
import java.util.List;

public class Aufgabe3_Horoskop {

	public static void main(String[] args) {
		
		List<String> zehnerList = new ArrayList<String>();
		
		zehnerList.add("In der Familie");
		zehnerList.add("In der Partnerschaft");
		zehnerList.add("Im Berufsleben");
		zehnerList.add("In der Liebe");
		
		List<String> tagList = new ArrayList<String>();
		
		tagList.add("fehlt Ihnen die Ausdauer.");
		tagList.add("kündigen sich Veränderungenan.");
		tagList.add("lassen Erfolge auf sich warten.");
		tagList.add("neigen Sie zur Bequemlichkeit.");
		tagList.add("müssen Sie mit unangenehmen Überraschungen rechnen.");
		tagList.add("sind Sie besonders kreativ.");
		tagList.add("befinden Sie sich in einer produktiven Phase.");
		tagList.add("eilen Sie von Erfolg zu Erfolg.");
		tagList.add("kann es zu einer Auseinandersetzung kommen.");
		tagList.add("sind Sie besonders aktiv.");
		
		List<String> monatList = new ArrayList<String>();
		
		monatList.add("Machen Sie weiter so!");
		monatList.add("Lassen Sie sich nicht beeinflussen!");
		monatList.add("Hören Sie auf den Rat eines Freundes!");
		monatList.add("Werden Sie nicht übermütig!");
		monatList.add("Seien Sie weniger kritisch!");
		monatList.add("Ab und zu eine Pause einlegen!");
		monatList.add("Suchen Sie eine Aussprache!");
		monatList.add("Denken Sie nicht nur an sich!");
		monatList.add("Nicht immer nur an andere denken!");
		monatList.add("Achten Sie auf Ihre Gesundheit!");
		monatList.add("Geldausgaben verschieben!");
		monatList.add("Idealer Zeitpunkt für einen Neuanfang!");
		
		
		
		System.out.println("Aufgabe 3: Horoskop; Ein Hobby-Astrologe hat sich zur Vereinfachung seiner Prognosen einen \"HoroskopGenerator"
				+ "\nausgedacht. Er hat für ein Horoskop typische Formulierungen gesammelt und so miteinander kombiniert, "
				+ "\ndass die einzelnen Satzteile beliebig austauschbar sind. Die Auswahlder Satzteile erfolgt durch das Geburtsdatum, "
				+ "\ndas in der Form Tag, Monat eingegeben wird.");
		
		int tag, monat, einer = 0, zehner = 0;
		
		System.out.println("\nBitte schreibe deine Geburtstagsdaten ;)");
		System.out.print("Tag->: ");
		tag = main.scan.nextInt();
		System.out.print("Monat->: ");
		monat = main.scan.nextInt();
		
		if(tag >= 01 && tag <= 31) {
			einer = tag%10;
			if(monat >= 1 && monat <= 12) {
				zehner = tag/10;
				System.out.println(zehnerList.get(zehner) + "\n" + tagList.get(einer) + "\n" + monatList.get(monat-1));
			}else {
				System.out.println("Salsch!! Bitte schreiben sie ihren Monat richtig.");
			}
		}else {
			System.out.println("Falsch!!! Bitte schreiben sie ihren Tag richtig.");
		}

		
		
		

	}

}
