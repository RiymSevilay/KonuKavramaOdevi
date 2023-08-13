package com.sevilay.Encapsulation_Kapsülleme;

import com.sevilay.Encapsulation_Kapsülleme.Soru1_2_3.Cevaplar;

public class Runner_Encapsulation {

	public static void main(String[] args) {

		Encapsulation encapsulation = new Encapsulation();

		encapsulation.setMarka("Smeg");
		encapsulation.setFiyat(10_000, 7);

		System.out.println(encapsulation.getMarka() + "\n" + encapsulation.getFiyat() + "TL");

		
//Cevap 2 -->		
		Cevaplar soru2 = new Cevaplar();

		soru2.marka = "Smeg";
		// soru2.fiyat = 10000;  // private kendi sınıfı içinde erişime açıktır, 
		                        //bu bilgi başka bir sınıfta olduğu için erişilmiyor.
		// soru2.telefon = "5552221133";   // protected sadece paket içinde erişime açıktır 
		                                  //bu bilgi bu paketin içinde olmadığı için erişilmiyor.

	}

}
