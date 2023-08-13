package com.sevilay.Abstract_Soyutlama.entity;

public abstract class SoyutSinif_Ornek {

	public String ad;
	public String tur;
	public String cins;

	public void hayvaninOzellikleriniYazdir() {

	}

	abstract String hayvaninOzellikleri();

	public String getTur() {
		return tur;
	}

	public String getCins() {
		return cins;
	}

}
