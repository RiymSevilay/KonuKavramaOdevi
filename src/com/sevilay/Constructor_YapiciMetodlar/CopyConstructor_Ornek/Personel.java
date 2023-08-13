package com.sevilay.Constructor_YapiciMetodlar.CopyConstructor_Ornek;

public class Personel {

	private String ad;
	private int yas;

//sınıfın constructor'ı
	public Personel(String ad, int yas) {
		this.ad = ad;
		this.yas = yas;
	}

//copy constructor
	public Personel(Personel personel) {
		this.ad = personel.ad;
		this.yas = personel.yas;

	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

}
