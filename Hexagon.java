package poligon;

public class Hexagon extends Poligon {
	
	double apotema;
	int latura;

	public Hexagon(int nrLaturi, String nume, double apotema, int latura) {
		
		super(nrLaturi, nume);
		this.apotema = apotema;
		this.latura = latura;
	}

	@Override
	protected double Aria() {
		
		return 3 * (double)latura * apotema;
	}

	@Override
	protected int Perimetru() {
		
		return 6 * latura;
	}

	@Override
	protected void Afisare() {
		
		System.out.println("Nume poligon : " + nume);
		System.out.println("Aria : " + Aria());
		System.out.println("Perimetrul : " + Perimetru());
	}

}
