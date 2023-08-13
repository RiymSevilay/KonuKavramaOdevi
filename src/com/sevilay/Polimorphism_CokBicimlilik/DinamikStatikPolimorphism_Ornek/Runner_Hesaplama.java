package com.sevilay.Polimorphism_CokBicimlilik.DinamikStatikPolimorphism_Ornek;

public class Runner_Hesaplama {

//Statik Çok Biçimlilik örneği:

	public static void main(String[] args) {

		Hesaplama hesaplama = new Hesaplama();

		int sonuc1 = hesaplama.toplama(7, 21);
		double sonuc2 = hesaplama.toplama(7.1, 32.8);

		System.out.println("Sonuç 1: " + sonuc1);
		System.out.println("Sonuç 2: " + sonuc2);
	}

}
