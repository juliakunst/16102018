import java.util.Scanner;

public class Dollar {

	public static void main(String[] args) {
		// TODO Automatisch generierter Methodenstub

		Scanner sc = new Scanner(System.in);
		System.out.println ("Bitte Betrag in Euro eingeben");
		double dollar = sc.nextDouble();
		System.out.println (dollar*1.34);
		sc.close();
	}

}
