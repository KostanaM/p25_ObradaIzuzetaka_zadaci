package UUP;

public class Casopis {

String naslov;
String izdavac;
int brojCasopisa;
double cena;

public String getNaslov() {
	return naslov;
}
public void setNaslov(String naslov) throws Izuzetak {
	if(naslov.isBlank()||naslov.isEmpty())
		throw new Izuzetak("Ne sme biti nula");
	this.naslov = naslov;
}
public String getIzdavac() {
	return izdavac;
}
public void setIzdavac(String izdavac) throws Izuzetak{
	if(izdavac.isBlank()||izdavac.isEmpty())
		throw new Izuzetak("Ne sme biti nula");
	this.izdavac = izdavac;
}
public int getBrojCasopisa() {
	return brojCasopisa;
}
public void setBrojCasopisa(int brojCasopisa) throws Izuzetak{
	this.brojCasopisa = brojCasopisa;
}
public double getCena() {
	return cena;
}
public void setCena(double cena)throws Izuzetak {
	if(cena<=0)
		throw new Izuzetak("Ne sme biti nula");
	this.cena = cena;
}

public String toString() {
	return "Casopis [naslov=" + naslov + ", izdavac=" + izdavac + ", brojCasopisa=" + brojCasopisa + ", cena=" + cena
			+ "]";
}




	
	
}
