package it.polito.tdp.artsmia.model;

import java.util.Comparator;

public class Adiacenza implements Comparator<Adiacenza>{
	private Artist a1;
	private Artist a2;
	private int peso;
	
	
	public Adiacenza(Artist a1, Artist a2, int peso) {
		
		this.a1 = a1;
		this.a2 = a2;
		this.peso = peso;
	}


	public Artist getA1() {
		return a1;
	}


	public void setA1(Artist a1) {
		this.a1 = a1;
	}


	public Artist getA2() {
		return a2;
	}


	public void setA2(Artist a2) {
		this.a2 = a2;
	}


	public int getPeso() {
		return peso;
	}


	public void setPeso(int peso) {
		this.peso = peso;
	}


	@Override
	public String toString() {
		return a1 + " - " + a2 + "|" + peso + "|";
	}


	@Override
	public int compare(Adiacenza o1, Adiacenza o2) {
		// TODO Auto-generated method stub
		return -(o1.getPeso()-o2.getPeso());
	}
	
	

}
