package UUP;

import java.util.Scanner;

public class CasopisTest {

	public static void main(String[] args) throws Exception {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Unesite naslov časopisa: ");
		String naslov = sc.nextLine();
		System.out.println("Unesite izdavač časopisa: ");
		String izdavac = sc.nextLine();
		System.out.println("Unesite broj časopisa: ");
		int brojCasopisa = sc.nextInt();
		System.out.println("Unesite cenu časopisa: ");
		double cena = sc.nextDouble();
Casopis c=new Casopis();

try {
	c.setNaslov(naslov);
	c.setIzdavac(izdavac);
	c.setBrojCasopisa(brojCasopisa);
	c.setCena(cena);
	
	System.out.println(c.toString());
} catch (Izuzetak e) {
	System.out.println("Greska!" + e.getMessage());
}

	}

}
