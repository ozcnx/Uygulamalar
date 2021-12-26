package Day_1215;

import java.util.ArrayList;
import java.util.Scanner;

public class C01 {

	public static void main(String[] args) {
		/*
		 
		 Methotlar s�rekli kullandigimiz fonksiyonlari , isleri , islemleri bizim adimimiza yapan robotlar gibidir. Bizi kod kalabaligindan kurtarirlar. 
		 Metodlar sayesinde biz islevsel bir kodu bir kez yazariz. Daha sonra ona ne zaman ihtiyacimiz olsa cagiririz, o da o isi bizim icin yapar. 
		 Metodlara normalde fonksiyonlar deniyor ama Java'daki adi Method. Metodlari bir sablona ya da kaliba benzetebiliriz, farkli zamanlardan bizim 
		 icin ayni kaliba uygun isi tekrar tekrar yaparlar. Kisaca s�rekli kullandigimiz �zellikleri metodlar altinda yapariz.
		 
		 Aslinda metodlarla yapbildigimiz isleri Main Methot altinda da yapbiliriz, ama bu durumda bu fonksiyonumuzu sadece ayni Class icerisinde 
		 ulasilabilr ve diger Classlar bu fonksiyonu g�remezler ve kullanmazlar. Halbuki biz ne zaman ve nereden olursa o fonksiyona ulasmak ve kullanmak isteriz, 
		 c�nk� bu bizim islerimizi kolaylastirir ve hizlandirir. Ayni isleri tekrar tekrar yapmaktan kurtarir.
		 
		 	public 				static 			void 			myFirstMethod()				{}
			Access Modifier 				return Type			methot ismi				Method Body
		
		 Simdi burada bir Methodu olusturan keywordlara bir bakalim. 
		 Bunlardan ilki Acces Modifier; bu, kimler bu methodu kullanabilir, kimler kullanamaz demektir. Bu Methoda kimler ulasabilir, kimler ulasamaz bize
		 bunu g�sterir. Eger Acces modifier Public olarak d�zenlenmisse, bu herkesin o Methoda ulasbilecegi, onu kullanabilecegi ve ondaki verileri 
		 degistirebilcegi anlamina gelir. 
		 
		 Acces modifier Private olarak ayarlanmissa bu o Methoda sadece o Class icersinden ulasilabilecegi anlamina gelir.
		 protected olarak ayarlanirsa da bu defa sadece icinde bulunulan Package'tan ve child Classlardan o methoda ulasilabilir ve kullanilabilir.
		 default olarak ayarlanmissa bu sadece Methodun icinde bulunduu Package'tan methoda ulasilabilir ve kullanilabilir demektir
		 
		 static keywordunun methoda yazmak zorunlu degildir, Mehmet Hoca bu static kelimesini bir kul�be benzetiyor ve bu kul�ptekiler sadece kendileri 
		 gibi olan kul�p �yeleri ile baglanti kuruyor. static yazildigi zaman diger methotlara da static yazilmasi gerekiyor ki bunlar kendi haberlesebilsinler
		 main Methodu olusturan keywordlar degistirilemez, dolayisiyla bizim main methottan cagiracagimiz t�m methotlar da static olmak zorundadir. 
		 
		 Return type olusturalan Method bize birsey mi yazdiracak yoksa sadece bir sonuc mu d�nd�recek bunu s�yler. Kullandigimiz isleme g�re 
		 biz bazi methodlari yazdiriz, bazilarini ise yazdirmayiz.  Biz yaptigimiz her islemi yazdirmak, ekranda g�stermek zorunda degiliz. 
		 Eger sonucu yazdirmak istiyorsak o zaman return type'i void olarak belirlemeliyiz.  Yani Method bize bir sonuc d�nd�rmeyecekse, �rnegin sadece 
		 birsey hesaplayip yazdiracaksa return type void olmak zorundadir. Diger durumda ise return type olarak primative veya non-primative bir data t�r�
		 belirlenbilir(String, int, boolean vs..) Return type bu sekilde voidden baska birsey olarak belirlenmisse bu durumda methodun
		 sonuna return keywordu yazilmalidir. Eger return type olarak String secmissek, method bize sonuc olarak bir String , int secmissek bu defa da 
		 integer bir sonuc d�nd�rmelidir. Kisaca retirn type methodun ne �rettigini ve bize ne d�nd�rd�g�n� belirtir. Mehmet Hoca bunu somutlastirmak icin 
		 bir mangal �rnegi vermisti. Return keywordu yazildiktan sonra bu type uygun bir deger de yazilabilir ama bu her zaman gerekli degildir.
		 
		 
		 
		 Methodun Ismi (myFirstMethod) mutlaka k�c�k harfle baslamalidir. isim birden fazla kelimeden olusacaksa her kelimenin ilk harfi b�y�k olacak 
		 sekilde birlesik yazilir (camel case) 
		 
		 () Parentez isimden sonra parentez kullanilir ve geekiyorsa paentezin icerisine parametre yazilir.
		 {} parantezden sonra s�sl� parantez  acilir ki buna da method body denir ve methot bu s�sk� parentezler icinde olusturulur. 
		 
		 Method nerede olusturulmalidir? 
		 Method Class Bodysinin icinde ama Main method bodyinin disinda olusturulmak zorundadir. main Methodun icinde baska method olusturulamaz. methodun 
		 main Methodun �zerinde ya da altinda olmasi �nemli degildir. �nemli olan main methodun disinda olmasidir. 
		 
		 Bir Class icerisinde birden fazla metod olusturulabilir . Bu durumda calisma sirasi nasil olacaktir?
		 Bildiginiz gibi Java ilk �nce Main Methoda gider ve onu calistirir, main method arbanin motoru gibidir. Diger methotlardaki �ncelik sirasi ise 
		 cagrilma sirasidir. Yani bir methodu olusturmak onu calistirmak icin yeterli degildir. Cagirmadigimiz method calismaz . Buna method call deniyor.
		 method call yapmadigimiz methot calismaz sadece bekler. 
		 
		Method Olusturma
		
			
		Method cagiriken burada parantez icerisine yazdigimiz degerlere Argument deniyor. Bu argumentler ile olusturdugumuz methodtaki parametrelerin
		uyumlu olmasi gerekiyor.Yani argument data t�rleri ile parametrelerindata t�rlerinin ayni olmasi gerekiyor. 
		
		Bi method olustururken Mehmet Hocanin y�ntemine g�re 4 adim takip ediyoruz. 
		
		Birinci adimda method call yapiyoruz. 
		
		toplama(4,5); Bu bir method calldur. 
		
		Ikinci adimda methoda arg�man yazacak miyiz yazmayacak miyiz buna karar verecegiz. 
		
		int sayi1=4;						toplama(sayi1, sayi2) yazmaliyiz
		int sayi2=5;
		
		�c�nc� adimda ise Javadan yardim alarak methodu olustururuz. Bunun icin de yazmis oldugumuz method callun �zerine gelir ve Creat Method i 
		tiklariz, Java bizim icin methodu olustur. 
		
		D�rd�nc� ve son adimda ise olusturdugumuz methodun Access Modifier ve return type'ina karar veriyoruz. Yani public, private vs.. mi ve 
		void mi yoksa bir data t�r� m� olacak bunlari ayarliyoruz. 
		
		Olusturdugumuz bu methoda projemiz icinden hangi classtan olursa olsun ulasabilir ve kullanabiliriz (en azindan protected olmak sartiyla)
		
		
		Methodun hangi sirayla olusturuldugunun �ncelik bakimindan bir �nemi yok, �nce hangi metod cagrilirsa o calisir. 
		
		Yine bizim method call yaparken girdigimiz arg�manlarla , methodun parametlerelerinin ayni olmasina gerek yok. Java isimlere degil 
		degerlere bakar. Ayni da yazilabilir farkli da.
		
		Son olarak Method Overloading konusu var. Bu ayni class icerisinde ayni isimle birden fazla method olusturulabilir mi sousuyla ilgili
		Ayni classta ayni isimle birden fazla method olusturulabiliyor ama bu durumda method call yapildiginda hangisi calisacak sorunu 
		ortaya cikiyor. Eger bir Classta ismi ayni fakat parametlereleri farkli olan metodlar olusturursak buna overloading denir. 
		Java ayni isimle ve ayni parametrelerle birden fazla method olusturlmasina izin vermiyor. Ayni isimle birden fazla method olusturmak 
		istersek bu durumda method signature 'in degistirlmasi gerekir. method signature method ismi, parametre sayisi , data t�r� ve parametre siralamasi 
		demektir. Overloading yapmak istedigimizde method ismi degismeyeceginden parametre sayisi , data t�r� ve parametrelerin sirasi degistirilebilir.
		
		Java ayni isimde birden fazla method g�rd�g�nde  argument ve parametlerelerin uyumuna bakar , en uygun hangisi ise onu calistirir. Javanin siralamasi su sekildedir. 
		
		Java �ncelikle parametre sayilarina bakar bunlar esitse parametre ve arg�manlarin data t�rlerini karsilastirir
		tamamen uyan varsa onu calistirir.
		
		tamamen uyan yoksa kapsayan var mi oana bakar ve onu kullanir. 
		
		yani java birden fazla secenek oldugunda her zaman en optimum olani tercih eder. 
		 
		*/
	
		
	}	



}
