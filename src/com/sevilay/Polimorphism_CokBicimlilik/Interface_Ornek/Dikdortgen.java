package com.sevilay.Polimorphism_CokBicimlilik.Interface_Ornek;

public class Dikdortgen implements IAlanHesaplama {

	private double uzunKenar;
	private double kisaKenar;

	public Dikdortgen(double uzunKenar, double kisaKenar) {
		super();
		this.uzunKenar = uzunKenar;
		this.kisaKenar = kisaKenar;
	}

	@Override
	public double alanHesapla() {
		double alan = uzunKenar * kisaKenar;
		return alan;
	}

}
