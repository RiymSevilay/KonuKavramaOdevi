package com.sevilay.Encapsulation_Kapsülleme.Soru1_2_3;

public class Cevaplar {

	/**
	 * 3- Java Encapsulation (Kapsülleme)
	 * 
	 * Kod örneklerim Runner_Encapsulation, Cevaplar ve Encapsulation sınıflarımın içindedir.
	 * 
	 * 
	 * 
	 * Soru 1: Kapsüllemenin (encapsulation) neden önemli olduğunu açıklayın ve
	 * Java'da nasıl uygulanabileceğine dair bir örnek verin.
	 *  
	 * Cevap 1: 
	 * - Kapsülleme sistemimizin güvenli ve korunaklı olabilmesi için
	 * önemlidir. 
	 * - Bir değişkenin özelliklerinin dışarıdan erişilmesini sınırlamak
	 * için kullanılır.
	 * - Amaç sistemdeki bilgilerin daha güvenli, korunaklı ve
	 * erişimlerinin kontrollü olmasını sağlamaktır.
	 * 
	 * Herkesin erişmesini istemediğimiz bir sistemimiz olsun. Bu sistemdeki
	 * değişkenlerimizi private'a çekiyoruz. Bu şekilde onlara dışarıdan erişimi
	 * kapatılmış ve onları koruma altına alınmış oluyoruz. Daha sonra erişime
	 * kapatılan değişkenlerin, erişimlerini kontrollü hale getirmek için get ve
	 * set'leri kullanıyoruz. 
	 * 
	 * Set--> sistemde değişiklik yapmak isteyenlerin
	 * bilgilerini kaydediyor, daha sonra sistemde neleri değiştireceklerini
	 * kaydediyor ve aslında sistemde değişiklik yapmak isteyen kişi, bu bilgilerin değiştirilmesi için talepte bulunuyor. 
	 * Get--> Set'te değişkenlere erişmek isteyen kişilerin erişim izni ya da yetkileri
	 * olup olmaıdğını kontrol ettikten sonra Set'te istenilen bilgileri alıyor ve
	 * görüntüleyebilmemiz için bize veriyor.
	 * 
	 * 
	 * 
	 * Soru 2: Java'da "private", "public", ve "protected" anahtar kelimelerinin ne
	 * anlama geldiğini açıklayın ve kullanımları hakkında örnekler sunun.
	 * 
	 * Cevap 2:
	 * private:   sınıfın kendi içi dışında bütün erişimlere kapalıdır. 
	 * protected: sadece paket içinde erişime açıktır. 
	 * public:    her yerden erişime açıktır.
	 * 
	 * 
	 * 
	 * Soru 3: Bir sınıfta getter ve setter metodlarının ne amaçla kullanıldığını ve bunların nasıl 
     * tanımlanacağını bir örnek ile açıklayın.
	 * 
	 * Cevap 3: 
	 * Set--> değişkene erişmek ve buradaki bilgileri değiştirip değişkene yeni bir
	 * değer atamak için kullanılır. 
	 * Get--> set'te istenilen bilgileri almak ve okumak için kullanılır.
	 * 
	 * 
	 */

/** Soru 3.2 - Örnek */
	public String marka;
	protected String telefon;
	private int fiyat;


}
