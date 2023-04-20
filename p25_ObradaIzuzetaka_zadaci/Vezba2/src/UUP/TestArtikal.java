package UUP;

import java.util.Scanner;

public class TestArtikal {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Unesite artikal");
	String naziv=sc.nextLine();
	System.out.println("Unesite proizvodjaca");
	String proizvodjac=sc.nextLine();
	System.out.println("Unesite barkod");
	String barkod=sc.nextLine();
	System.out.println("Unesite cenu");
	double cena=sc.nextDouble();
	
	Artikal a=new Artikal();
	try {
		a.setNaziv(naziv);
		a.setProizvodjac(proizvodjac);
		a.setBarkod(barkod);
		a.setCena(cena);
		
		System.out.println(a.toString());
	} catch (Izuzetak e) {
		System.out.println("Greška!" + e.getMessage());
	}
	
	}

}
