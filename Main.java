package poligon;

public class Main {

	public static void main(String[] args) {
	  
		int dimLaturiDreptunghi[] = {2, 3, 2, 3};
		
		Patrat patrat = new Patrat(4, "Patrat", 5);
		
		Dreptunghi drept = new Dreptunghi(4, "Dreptunghi", dimLaturiDreptunghi);
		
		Hexagon hexa = new Hexagon(6, "Hexagon", 4, 5);
		
		patrat.Afisare();
		
		drept.Afisare();
		
		hexa.Afisare();
	}

}
