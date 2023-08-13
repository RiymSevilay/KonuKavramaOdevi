package com.sevilay.Polimorphism_CokBicimlilik.DinamikStatikPolimorphism_Ornek;

public class Runner_GeometrikSekiller {

//Dinamik Çok Biçimlilik örneği:

	public static void main(String[] args) {

		GeometrikSekiller sekil1 = new Daire();
		GeometrikSekiller sekil2 = new Kare();

		sekil1.ciz();
		sekil2.ciz();

	}

}
