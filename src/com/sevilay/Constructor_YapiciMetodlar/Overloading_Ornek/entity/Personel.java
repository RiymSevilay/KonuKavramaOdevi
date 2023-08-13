package com.sevilay.Constructor_YapiciMetodlar.Overloading_Ornek.entity;

import java.util.Date;

public class Personel {

	public String ad;
	public String id;
	public String unvan;

	public Personel() {
		super();

	}

	// Cevap:2.3 -> Copy Constructor örneği,
	public Date baslamaTarihi;

	public Personel(Personel personel) {
		this.baslamaTarihi = new Date(personel.baslamaTarihi.getTime());
	}
}
