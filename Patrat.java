package poligon;

public class Patrat extends Poligon {
	
	int latura;

	public Patrat(int nrLaturi, String nume, int latura) {
		
		super(nrLaturi, nume);
		this.latura = latura;
	}

	@Override
	protected double Aria() {
		
		return (double)latura * (double)latura;
	}

	@Override
	protected int Perimetru() {
		
		return latura * latura;
	}

	@Override
	protected void Afisare() {
		
		System.out.println("Nume poligon : " + nume);
		System.out.println("Aria : " + Aria());
		System.out.println("Perimetrul : " + Perimetru());
	}
	
}
