package UUP;

public class Motor {
	
String marka;
double kubikaza;

public String getMarka() {
	return marka;
}
public void setMarka(String marka) throws Izuzetak{
	if(marka.isBlank()||marka.isEmpty())
		throw new Izuzetak("Marka ne sme biti nula");
	this.marka = marka;
}
public double getKubikaza() {
	return kubikaza;
}
public void setKubikaza(double kubikaza) throws Izuzetak{
	if(kubikaza>50&&kubikaza<2000)
	this.kubikaza = kubikaza;
	else
	throw new Izuzetak("Kubikaza nije dobra");
	
}
public String Ispisi() {
	return "Motor [marka=" + marka + ", kubikaza=" + kubikaza + "]";
}


	
	
	
	
}
