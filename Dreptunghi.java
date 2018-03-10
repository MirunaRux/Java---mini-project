package poligon;

public class Dreptunghi extends Poligon {
	
	int dimLaturi[];

	public Dreptunghi(int nrLaturi, String nume, int dimLaturi[]) {
		
		super(nrLaturi, nume);
		this.dimLaturi = new int[nrLaturi];
		System.arraycopy(dimLaturi, 0, this.dimLaturi, 0, nrLaturi);
	}

	@Override
	protected double Aria() {
		
		double aria = 1;
		
		for(int i = 0; i <= 1; i++)
			aria *= dimLaturi[i];
		
		return aria;
	}

	@Override
	protected int Perimetru() {

		int perimetru = 0;
		
		for(int i : dimLaturi)
			perimetru += dimLaturi[i];
		
		return perimetru;
	}

	@Override
	protected void Afisare() {
				
			System.out.println("Nume poligon : " + nume);
			System.out.println("Aria : " + Aria());
			System.out.println("Perimetrul : " + Perimetru());
	}
	
}
