package com.sevilay.Encapsulation_Kapsülleme;

public class Encapsulation {
//Cevap 3.1: -->
	private String ad;
	private String id;
	private String marka;
	private int fiyat;

	public void setFiyat(int yeniFiyat, int id) {
		fiyat = 7500;
		if (id == 7) {
			System.out.println("Ürünün başlangıçtaki fiyatı: " + fiyat);
			fiyat = yeniFiyat;
			System.out.println("Ürünün değiştirildikten sonraki fiyatı: " + yeniFiyat);
			System.out.println("Değiştiren kişinin id'si: " + id);
		} else
			System.out.println("Yetkisiz Erişim!");
	}

//Cevap 3.3 --> getter ve setter kullanımı
	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public int getFiyat() {
		return fiyat;
	}

}
