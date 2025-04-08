package quiz2;

import java.util.Scanner;

public class quiz2 {

	public static void main(String[]args) {
		
		Scanner okuyucu = new Scanner(System.in);

		String isim;
		String soyAd;
		
		while(true) {
		System.out.println("lutfen isminizi dogru bir sekilde giriniz : ");
		isim = okuyucu.nextLine().trim();
		
		System.out.println("lutfen soy isminizi dogru bir sekilde giriniz :");
		soyAd = okuyucu.nextLine().trim();
		
		if(isim.isEmpty() || soyAd.isEmpty())
			System.out.println("isim veya soyad alanini bos biraktiniz kontrol ederek tekrar deneyiniz.");
		else
			break;
			
		}
		
		
		System.out.printf("Tam isminiz = %s %s\n",isim ,soyAd); //printf ve println kullanimina aciklik getirmek istiyorum. Normal bildigimiz farklarinin disinda java dilinde println metodunda %s %d gibi tur belirteclerini kullanamiyoruz bunlari kullanacagimiz zaman printf tercih etmemiz gerekiyor bunun disindaki farklari alt satira gecip gecmemeleri.
		System.out.printf("isim ve soyisminizin uzunlugu = %d\n" ,isim.length()+soyAd.length());
		System.out.printf("Buyuk harflerle isminiz = %s\n",isim.toUpperCase());
		System.out.printf("Buyuk harflerle soyisminiz = %s\n" ,soyAd.toUpperCase());
		
		if(isim.length() == soyAd.length())
			System.out.println("isim ve soyisminizin uzunluklari esittir.");
		else
		{
			System.out.println("isim ve soyisminizin uzunluklari esit degil");
			
			if(isim.length() < soyAd.length())
				System.out.println("soyadiniz isminizden uzun.");
			else
				System.out.println("isminiz soyadinizdan uzun");
		}
		
		okuyucu.close();
			
	}
}
