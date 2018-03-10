package lab2.date;

import java.util.Arrays;

public class Cumparaturi {
	private ProdusCumparat [] produse;
	
	public void cumpara(String numeProdus, int cantitate) {
		if(produse != null) {
			for(int i = 0;i < produse.length; i++)
				if(produse[i].getNume().equals(numeProdus)) {
					produse[i].setCantitate(produse[i].getCantitate() + cantitate);	
					
					return ;
				}
				produse = Arrays.copyOf(produse, produse.length + 1);
				
				produse[produse.length - 1] = new ProdusCumparat();
				
				produse[produse.length - 1].setNume(numeProdus);
				
				produse[produse.length - 1].setCantitate(cantitate);
		}
	    else{
	    	produse = new ProdusCumparat[1];
	    	
	    	produse[produse.length - 1] = new ProdusCumparat();
			
			produse[produse.length - 1].setNume(numeProdus);
			
			produse[produse.length - 1].setCantitate(cantitate);
	    }
	}
}
