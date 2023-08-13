package com.sevilay.Constructor_YapiciMetodlar.CopyConstructor_Ornek;

public class Runner_CopyConstructor {
//Cevap:2.3 -->
	public static void main(String[] args) {

		Personel personel1 = new Personel("Sevilay", 30);
		Personel personel2 = new Personel(personel1);// copy constructor kullanarak kopya oluşturma

		System.out.println("Personel 1:" + personel1.getAd() + "," + personel1.getYas());
		System.out.println("Personel 2:" + personel2.getAd() + "," + personel2.getYas());

	}

}
