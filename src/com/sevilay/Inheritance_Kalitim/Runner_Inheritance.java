package com.sevilay.Inheritance_Kalitim;

import com.sevilay.Inheritance_Kalitim.entity.Garson;
import com.sevilay.Inheritance_Kalitim.entity.Yonetici;

public class Runner_Inheritance {

	public static void main(String[] args) {

//Cevap 1.1 -->
		Garson garson = new Garson();
		Yonetici yonetici = new Yonetici();

		garson.ad = "Mehmet";
		garson.soyad = "Kök";
		garson.unvan = "Garson";

		yonetici.ad = "Merve";
		yonetici.soyad = "Toprak";
		yonetici.unvan = "Yönetici";

		System.out.println(garson.getUnvan() + " " + garson.getAd());
		System.out.println(yonetici.unvan + ":" + yonetici.ad + " " + yonetici.soyad);

	}

}
