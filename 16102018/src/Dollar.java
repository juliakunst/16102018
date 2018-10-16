import java.util.Scanner;

public class Dollar {

	public static void main(String[] args) {								// TODO Automatisch generierter Methodenstub


		boolean nochmal = true;
		do{
			Scanner sc = new Scanner(System.in);
			System.out.println("Bitte gebe die gewünscht Wärhung ein");
			String meineEingabe = sc.nextLine();
			if(meineEingabe.equals("euro")){											//wenn euro eingeben wird, wird folgendes System ausgeführt
				System.out.println ("Bitte Betrag in Euro eingeben");				//"Bitte Betrag in Dollar eingeben" wird ausgegeben
				double dollar = sc.nextDouble();
				System.out.println ((dollar*1.34)+"$");								//Eingabe wird mit Umrechnungsfaktor 1,34 multipliziert
			}
			else if(meineEingabe.equals("dollar")){									//wenn dollar eingebeben wird, wird folgendes System ausgeführt
				System.out.println ("Bitte Betrag in Dollar eingeben");			//"Bitte Betrag in Dollar eingeben" wird ausgegeben
				double dollar = sc.nextDouble();
				System.out.println (dollar*0.74+"€");								//Eingabe wird mit Umrechnungsfaktor 0,74 multipliziert
			}
			System.out.println("nochmal?");
			String xd = sc.nextLine();
			while(xd.isEmpty()){
			if(xd.equals("n") || xd.equals("N")){
				nochmal = false;
			}
			}
	}
while(nochmal == true);
			
	}
}
