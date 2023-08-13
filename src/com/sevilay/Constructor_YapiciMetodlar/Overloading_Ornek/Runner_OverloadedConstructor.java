package com.sevilay.Constructor_YapiciMetodlar.Overloading_Ornek;

import com.sevilay.Constructor_YapiciMetodlar.Overloading_Ornek.entity.Stajyer;
import com.sevilay.Constructor_YapiciMetodlar.Overloading_Ornek.entity.Yonetici;
import com.sevilay.Constructor_YapiciMetodlar.Overloading_Ornek.repository.PersonelRepository;

public class Runner_OverloadedConstructor {

	public static void main(String[] args) {
//Cevap 2.2--> 
		/**
		 * save methodunu Yonetici ve Stajyer kaydetmek için kullandım. aynı methodu iki
		 * farklı kayıt işlemi için kullandığımda save methodu overload edilmiş oldu.
		 */
		PersonelRepository repository = new PersonelRepository();
		Yonetici yonetici = new Yonetici("Muhammet", "Yönetici");
		repository.save(yonetici);
		Stajyer stajyer = new Stajyer("Sevilay", "Stajyer");
		repository.save(stajyer);

	}

}
