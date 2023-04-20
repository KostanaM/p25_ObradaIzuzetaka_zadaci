package UUP;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) throws InputMismatchException {
		String ime;
		String prezime;
		String adresa;

		
	Student s[]=new Student[10];
	Scanner sc=new Scanner(System.in);

	System.out.println("Unesite broj studenata");
	int n=sc.nextInt();
	
	try {
	
		for (int i=1; i<=n; i++) {	
		System.out.println("Unesite ime " + i +  " studenta");	
		ime=sc.next();
		
		System.out.println("Unesite prezime " + i +  " studenta");	
		prezime=sc.next();
		
		System.out.println("Unesite adresu " + i +  " studenta");
		adresa=sc.next();
		
		System.out.println("Unesite broj Indeksa " + i +  " studenta");
		int indeks=sc.nextInt();
		
		s[i] = new Student(ime, prezime, adresa, indeks);
		}
		for (int i=1; i<=n; i++) 
			System.out.println(s[i].Ispis());
		
		} catch (Izuzetak e) {
		System.out.println(e.getMessage());
		System.out.println("Indeks studenta za koji se desio izuzetak je " + e.getIndeksStudenta());
		}
	
	}

}
