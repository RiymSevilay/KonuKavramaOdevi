package com.sevilay.Constructor_YapiciMetodlar.Soru1_2_3;

public class Cevaplar {

	/**
	 * 
	 * 2- Java Constructor (Yapıcı Metodlar)
	 * 
	 * 
	 * Soru 1: Java'da parametre almayan bir constructor'ın (yapıcı metodun) ne
	 * zaman ve nasıl çağrılacağını açıklayın.
	 * 
	 * 
	 * Cevap 1: - Sınıfın adı ile aynı adı taşıyan ve geri dönüş tipi olmayan
	 * methodlardır. 
	 * - Parametre almayan Default Constructor, main sınıfında yeni
	 * nesne yaratıldığı an yazılmasa bile çağrılmış olur. 
	 * - Geri dönüş tipi
	 * olmamasına rağmen geri dönüş değeri vardır, ve bu değer yaratılan nesnenin
	 * referans adresidir. 
	 * - Sadece erişim belirteci ve method adı yazılıp
	 * yaratılabilir.
	 * 
	 * ÖRN: public Köpek() {
	 * 
	 * } ---> şeklinde.
	 * 
	 * 
	 * Soru 2: Aşırı yüklenmiş constructor'larla (overloaded constructors) ilgili
	 * bir örnek verin. Farklı parametre tiplerine sahip en az iki constructor
	 * içermelidir.
	 * 
	 * Cevap 2: Kod örneğim Constructor_YapiciMethodlar paketinin içindedir.
	 * 
	 * -> Aynı işi birden çok varlık için yapan methodlar overloading olur. 
	 * -> Overload methodların aşırı yüklenmesi demektir. 
	 * -> Aynı adlı methodu farklı değişkenlerin işlemlerini yapmak için kullanılabilir. 
	 * --> Yönetici ve Stajyer kaydetme örneği yaptım. 
	 * --> Personel sınıfımdan Yönetici ve Stajyer sınıflarıma miras aldırıp, 
	 * --> bu örnekte Yönetici ve Stajyer için iki parametreli constructor(String ad, String unvan) kullandım. 
	 * --> Runner_Constructor sınıfımda iki parametreli nesnelerimi yarattım, 
	 * kayıt işlemlerini kodladım ve çıktılarını aldım.
	 * 
	 * 
	 * 
	 * Soru 3: Copy constructor'ın ne olduğunu açıklayın ve bir sınıf içinde nasıl
	 * kullanılacağına dair bir örnek kod yazın.
	 * 
	 * Java sınıfındaki bir kopya oluşturucu, aynı Java sınıfındaki başka bir
	 * nesneyi kullanarak bir nesne oluşturan bir oluşturucudur. Birkaç alanı olan
	 * karmaşık bir nesneyi kopyalamak istediğimizde veya var olan bir nesnenin
	 * derin bir kopyasını yapmak istediğimizde bu yardımcı olur.
	 * 
	 * 
	 */

}