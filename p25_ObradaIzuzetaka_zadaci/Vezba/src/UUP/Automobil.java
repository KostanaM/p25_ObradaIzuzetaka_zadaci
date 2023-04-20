package UUP;

import java.util.*;

public class Automobil {

	String naziv;
	String proizvodjac;
	int godiste;
	double potrosnja;
	
	void unetiNazivAutomobila() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Unesite naziv automobila");
		naziv=sc.nextLine();
		sc.close();
	}
	void unetiProizvodjacaAutomobila() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Unesite proizvođača automobila");
		proizvodjac=sc.nextLine();
		sc.close();
	}
	void unetiGodisteAutomobila() {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Unesite godište automobila");
			godiste=sc.nextInt();
			sc.close();
		} catch (Exception e) {
			System.out.println("Niste dobro uneli broj");
			unetiGodisteAutomobila();
		}	
	}
	void unetiPotrosnjuAutomobila() {
			try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Unesite potrošnju automobila");
			potrosnja=sc.nextDouble();
			sc.close();
		} catch (Exception e) {
			System.out.println("Niste ispravno uneli potrošnju");
			unetiPotrosnjuAutomobila();
		}	
	}
	public String toString() {
		return "Automobil [naziv=" + naziv + ", proizvodjac=" + proizvodjac + ", godiste=" + godiste + ", potrosnja="
				+ potrosnja + "]";
	}	
}

