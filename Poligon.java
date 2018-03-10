package poligon;

public abstract class Poligon {
	
	protected int nrLaturi;
	protected String nume;
	
	Poligon(int nrLaturi, String nume){
		
		this.nrLaturi = nrLaturi;
		this.nume = nume;
	}
	
	protected abstract double Aria();
	protected abstract int Perimetru();
	protected abstract void Afisare();

}
