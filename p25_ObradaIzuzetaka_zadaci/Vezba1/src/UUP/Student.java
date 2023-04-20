package UUP;

public class Student {
	
	String ime;
	String prezime;
	String adresa;
	int brojIndeksa;
	
	public Student(String ime, String prezime, String adresa, int indeks) throws Izuzetak {
		this.ime = ime;
		this.prezime = prezime;
		this.adresa = adresa;
		
		if(indeks >0 && indeks <100)
			this.brojIndeksa = indeks;
		else 
			throw new Izuzetak(brojIndeksa);
	}
	
	public String Ispis() {
		return "Student [ime=" + ime + ", prezime=" + prezime + ", adresa=" + adresa + ", brojIndeksa=" + brojIndeksa
				+ "]";
	}
	

}
