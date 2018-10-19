package Aufgaben;
import java.util.ArrayList;
import java.util.List;
public class Aufgabe2_Noten {

	public static void main(String[] args) {
		
		List<String> notenList = new ArrayList<String>();
		
		notenList.add("Sehr gut");
		notenList.add("Gut");
		notenList.add("Befriedigend");
		notenList.add("Ausreichend");
		notenList.add("Mangelhaft");
		notenList.add("Ungenügend");
		
		int note;
		System.out.println("Dieses Programm wandelt eine eingegebene Zahl von 1 bis 6 in eine Schulnote um");
		System.out.print("Geben Sie die Note ein (1-6): ");
		note = main.scan.nextInt();
		
		if(note >= 1 && note <= 6) {
			System.out.println(notenList.get(note-1));
		}else {
			System.out.println("Die Note ist nicht richtig!!!");
		}
		
	}

}
