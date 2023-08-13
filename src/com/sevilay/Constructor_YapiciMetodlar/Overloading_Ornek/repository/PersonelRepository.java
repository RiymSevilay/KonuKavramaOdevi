package com.sevilay.Constructor_YapiciMetodlar.Overloading_Ornek.repository;

import com.sevilay.Constructor_YapiciMetodlar.Overloading_Ornek.entity.Stajyer;
import com.sevilay.Constructor_YapiciMetodlar.Overloading_Ornek.entity.Yonetici;

public class PersonelRepository {

//overload örneği-->

	public void save(Yonetici yonetici) {
		System.out.println("Yönetici " + yonetici.ad + " kaydedildi.");
	}

	public void save(Stajyer stajyer) {
		System.out.println("Stajyer " + stajyer.ad + " kaydedildi.");
	}

	public void update(Yonetici yonetici) {

	}

	public void update(Stajyer stajyer) {

	}

}
