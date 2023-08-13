package com.sevilay.Abstract_Soyutlama.Soru1_2_3;

public class Cevaplar {

	/**
	 * Kod örneklerim Abstarct_Soyutlama paketinin içerisindedir.
	 * 
	 * 5- Java Abstract (Soyutlama)
	 * 
	 * 
	 * Soru 1: Soyut sınıfların (abstract classes) ve soyut metodların (abstract
	 * methods) ne olduğunu açıklayın. Bir soyut sınıf tanımlayın ve bu sınıftan
	 * türetilen bir alt sınıf oluşturun.
	 * 
	 * Cevap 1:
	 * 
	 * Soyut sınıf: hem normal sınıf hemde interface sınıf gbi davranmasını
	 * istediğimiz yapılar olduğunda soyut sınıf kullanırız. 
	 * Mesela; 
	 * -> miras almak istiyoruz, 
	 * -> değişken tanımlamak istiyoruz, 
	 * -> belli kalıp methodlar yazmak istiyoruz ya da bazı methodların yazılmasını istemiyoruz, gbi durumlar var
	 * olduğunda kullanmamız gereken yapı Soyut Sınıf (Abstract Class)'tır. 
	 * Yanii;
	 * Abstarct Sınıflarını, gereksiz ayrıntıları göz ardı ederek bir nesnenin
	 * yalnızca gerekli ve istenilen özelliklerini belirleme işlevi olarak da
	 * nitelendirilebiliriz.
	 * 
	 * 
	 * 
	 * Soru 2: Bir sınıfın içinde soyut bir metod olduğunda neden sınıfın da soyut
	 * olması gerektiğini açıklayın.
	 * 
	 * Cevap 2:
	 * 
	 * Çünkü; 
	 * --> Soyut methodlar yalnızca soyut sınıflar içerinde tanımlanabilir.
	 * --> Soyut olmayan bir sınıfın içerisinde soyut methodlar tanımlamak mümkün
	 * değildir.
	 * 
	 * --> Ayrıca soyut sınıfın içinde yazılan soyut methodların gövdeleri yoktur,
	 * bu da soyut sınıfının bir özelliğidir.
	 * 
	 * --> Soyut sınıfın içinde yazılan methodların, soyut sınıfını miras alan
	 * sınıfların içinde kullanılabilmeleri için override edilmeleri gerekir.
	 * 
	 * 
	 * 
	 * Soru 3: 
	 * Soyut sınıflar ile interfaceler arasındaki farkları açıklayın ve her
	 * iki durum için de örnekler verin.
	 * 
	 * Cevap 3:
	 * 
	 * Interface'lere genel olarak sözleşmeler demiştik. 
	 * --> Abstarct sınıflarda; hem değişken tanımlayıp hemde soyut methodlar ve soyut olmayan methodlar
	 * yazabilirken, bunları interface sınıflarda yapamayız.
	 * 
	 * --> Bir sınıf sadece bir Abstarct sınıftan miras olarak tanımlanabilir ancak
	 * birçok interface tarafından bildirilebilir.
	 * 
	 * --> Abstarct sınıf içinde soyut ve soyut olmayan methodlar yazılabilirken,
	 * interface sınıfında sadece soyut olmayan methodlar yazılabilir.
	 * 
	 * --> Abstract sınıflar genellikle ortak özellikleri paylaşmak için kullanılırken, 
	 * interface sınıflar belirli davranışları garanti etmek için kullanılır.
	 * 
	 * --> Abstract sınıflar çoklu ortamı desteklemezler, ancak interface sınıflar
	 * çoklu ortamı destekler.
	 *
	 * --> Abstarct sınıfın tüm methodlarının soyut olması gerekir ancak bu şekilde
	 * interface olarak kullanılabilir.
	 * 
	 * 
	 */

}
