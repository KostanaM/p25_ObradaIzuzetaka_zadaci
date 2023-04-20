package UUP;

public class Artikal {

	String naziv;
	String proizvodjac;
	String barkod;
	double cena;
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) throws Izuzetak{
		if(naziv.isBlank()|| naziv.isEmpty())
			throw new Izuzetak("Ne sme biti nula");
		this.naziv = naziv;
	}
	public String getProizvodjac() {
		return proizvodjac;
	}
	public void setProizvodjac(String proizvodjac)throws Izuzetak{
		if(proizvodjac.isBlank()|| proizvodjac.isEmpty())
			throw new Izuzetak("Ne sme biti nula");
		this.proizvodjac = proizvodjac;
	}
	public String getBarkod() {
		return barkod;
	}
	public void setBarkod(String barkod) throws Izuzetak{
		if(barkod.isBlank()|| barkod.isEmpty())
			throw new Izuzetak("Ne sme biti nula");
		this.barkod = barkod;
	}
	public double getCena() {
		return cena;
	}
	public void setCena(double cena) throws Izuzetak{
		if(cena <= 0)
			throw new Izuzetak("Ne sme biti nula");
		this.cena = cena;
	}
	@Override
	public String toString() {
		return "Artikal [naziv=" + naziv + ", proizvodjac=" + proizvodjac + ", barkod=" + barkod + ", cena=" + cena
				+ "]";
	}
	
	
	
}
