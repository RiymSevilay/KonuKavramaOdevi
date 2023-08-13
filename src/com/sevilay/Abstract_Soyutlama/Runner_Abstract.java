package com.sevilay.Abstract_Soyutlama;

import com.sevilay.Abstract_Soyutlama.entity.Hayvanlar;

public class Runner_Abstract {

	public static void main(String[] args) {

		Hayvanlar hayvan = new Hayvanlar();

		hayvan.tur = "Kurt";
		hayvan.cins = "Malinois";
		hayvan.ad = "Pars";

		hayvan.hayvaninOzellikleriniYazdir();
		System.out.println("Hayvanın türü: " + hayvan.getTur() + "\nHayvanın cinsi: " + hayvan.getCins());
	}

}
