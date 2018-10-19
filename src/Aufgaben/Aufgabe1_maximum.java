package Aufgaben;

public class Aufgabe1_maximum {

	public static void main(String[] args) {
		
		System.out.println("Aufgabe 1: Es soll ein Programm geschrieben werden, in dem ein Benutzer drei unterschiedliche Zahlen"
				+ "\neingibt. Das Programm bestimmt daraufhin den größten Wert und gibt ihn aus. Es ist möglich ,"
				+ "\nlich, den Algorithmus der letzten Aufgabe zu benutzen. Diese Lösung wäre jedoch umständlich. Finde einen anderen Algorithmus!");
		int num1, num2, num3, max;
		String word; 
		System.out.print("Geben Sie die erste Zahl ein: ");
		num1 = main.scan.nextInt(); 
		System.out.print("Geben Sie die zweite Zahl ein: "); 
		num2 = main.scan.nextInt(); 
		System.out.print("Geben Sie die dritte Zahl ein: "); 
		num3 = main.scan.nextInt();
		
		if(num1 > num2) {
			if(num1 > num3) {
				max = num1;
			}else {
				max = num3;
			}
		}else {if(num2 > num3) {
			max = num2;
		}else {
			max = num3;
		}
			
		}
		System.out.println("\nDie groesste Zahl ist: " + max);
		word = main.scan.nextLine();
		while(true) {
			System.out.print("Try with another Numbers? y/n: ");
			word = main.scan.nextLine();
			if(word.equals("y") || word.equals("Y")) {
				System.out.print("Geben Sie die erste Zahl ein: ");
				num1 = main.scan.nextInt(); 
				System.out.print("Geben Sie die zweite Zahl ein: "); 
				num2 = main.scan.nextInt(); 
				System.out.print("Geben Sie die dritte Zahl ein: "); 
				num3 = main.scan.nextInt();
				
				if(num1 > num2) {
					if(num1 > num3) {
						max = num1;
					}else {
						max = num3;
					}
				}else {if(num2 > num3) {
					max = num2;
				}else {
					max = num3;
				}
					
				}
				System.out.println("\nDie groesste Zahl ist: " + max);
				word = main.scan.nextLine();
			}else {
				break;
			}
		}
	}

}
