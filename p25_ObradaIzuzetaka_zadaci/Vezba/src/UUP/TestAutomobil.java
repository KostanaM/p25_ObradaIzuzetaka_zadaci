package UUP;

public class TestAutomobil {

	public static void main(String[] args) {
		Automobil a=new Automobil();
		
		a.unetiNazivAutomobila();
		a.unetiProizvodjacaAutomobila();
		a.unetiGodisteAutomobila();
		a.unetiPotrosnjuAutomobila();
		
		System.out.println(a.toString());

	}

}
