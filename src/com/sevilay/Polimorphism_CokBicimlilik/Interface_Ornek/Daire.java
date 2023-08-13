package com.sevilay.Polimorphism_CokBicimlilik.Interface_Ornek;

public class Daire implements IAlanHesaplama {

	private double yaricap;
	private static double pI = 3.14;

	public Daire(double yaricap, double pI) {

		this.yaricap = yaricap;
		this.pI = pI;
	}

	@Override
	public double alanHesapla() {
		double alan = pI * yaricap * yaricap;
		return alan;
	}

}
