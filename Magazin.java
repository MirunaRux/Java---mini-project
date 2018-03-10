package lab2;

import java.util.Arrays;
import java.util.Scanner;

import lab2.date.Client;
import lab2.date.Cumparaturi;

public class Magazin {
	private Client [] clienti;
	private Cumparaturi [] produseCumparate;
	
	int gasesteClient(String nume) {
		for(int i = 0;i < clienti.length; i++)
			if(clienti[i].getNume().equals(nume))
				return i;
		
		return -1;
	}
	
	Client userNou(String nume) {
		clienti = Arrays.copyOf(clienti, clienti.length + 1);
		
		Client cl = new Client();
		cl.getNume();
		cl.setNume(nume);
		
		clienti[clienti.length - 1] = cl;
		
		produseCumparate = Arrays.copyOf(produseCumparate, produseCumparate.length + 1);
		
		produseCumparate[produseCumparate.length - 1] = new Cumparaturi();
		
		return cl;
	}
	
	void clientCumpara(String nume, String numeProdus, int cantitate) {
		int poz = gasesteClient(nume);
		
		if(poz == -1) {
			userNou(nume);
			poz = clienti.length - 1;
		}
		
		produseCumparate[poz].cumpara(numeProdus, cantitate);
	}
	
	public static void main(String [] args) {
		Scanner scann = new Scanner(System.in);
		System.out.println(scann.nextInt()+scann.nextInt());
	}
}
