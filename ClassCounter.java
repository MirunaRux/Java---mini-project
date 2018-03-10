package lab3.numarator;

import java.util.Arrays;

public class ClassCounter {
	private static ClassCounter instance;
	
	private Pair [] perechi = new Pair [0];
	
	public int getCount(String numeClasa) {
		for(int i = 0;i < perechi.length; i++)
			if(perechi[i].getNumeClasa().equals(numeClasa))
				return perechi[i].getNumar();
		
		return 0;
	}
	
	public void instantaNoua(String numeClasa) {
		for(int i = 0;i < perechi.length; i++)
			if(perechi[i].getNumeClasa().equals(numeClasa))
				{
					perechi[i].setNumar(perechi[i].getNumar() + 1);
					return;
				}
		
	    Pair nou = new Pair();
	    nou.setNumeClasa(numeClasa);
	    nou.setNumar(1);
	    
	    perechi = Arrays.copyOf(perechi, perechi.length + 1);
	    
	    perechi[perechi.length - 1] = nou;
	}
	
	private ClassCounter() {
		
	}
	
	public static ClassCounter getInstance() {
		if (instance == null) {
			instance  = new ClassCounter();
		}
		return instance;
	}
}
