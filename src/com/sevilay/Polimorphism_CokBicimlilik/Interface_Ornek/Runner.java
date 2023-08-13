package com.sevilay.Polimorphism_CokBicimlilik.Interface_Ornek;

//Cevap:5.1 ve 5.2 ->
public class Runner {

	public static void main(String[] args) {

		IAlanHesaplama daire = new Daire(5.0, 3.14);
		IAlanHesaplama dikdortgen = new Dikdortgen(5.0, 6.2);

		System.out.println("Daire'nin Alanı: " + daire.alanHesapla());
		System.out.println("Dikdörtgenin Alanı: " + dikdortgen.alanHesapla());

	}

}
