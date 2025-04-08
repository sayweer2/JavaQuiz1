package quiz3;

import java.util.*;

public class Quiz3 {
	public static void main(String[]args) {
		
		double saatlikUcret;
		int calismaSaati;
		float vergiOrani;
		char vardiyaTipi; //sadece A veya B olacak sekilde ayarlanmali.
		
		try (Scanner okuyucu = new Scanner(System.in)){
			while(true) {
				
				try {
					while(true)
					{
						System.out.println("lutfen calisanin saatlik ucretini giriniz.");
						String sU = okuyucu.nextLine().trim();
						if(sU.isEmpty())
							System.out.println("calisanin saatlik ucreti icin eksik tuslama yaptiniz kontrol edip tekrar deneyin lutfen.");
						else
						{
							saatlikUcret = Double.parseDouble(sU.replace(",","."));
							System.out.printf("saatlik ucret girisi basarili.\nsaatlik ucret = %.2f\n",saatlikUcret);
							break;
						}
					}
					
					while(true) {
						System.out.println("lutfen calisanin haftalik kac saat calistigini giriniz = ");
						String cS = okuyucu.nextLine().trim();
						if(cS.isEmpty())
							System.out.println("calisanin haftlik calisma suresi icin eksik tuslama yaptiniz kontrol edip tekrar deneyin.");
						else
						{
							calismaSaati = Integer.parseInt(cS);
							if(calismaSaati < 0  || calismaSaati > 7*24)
								System.out.println("calisma saatini negatif veya olamaycak kadar fazla tusladiniz lutfen kontrol edip tekrar deneyin.");
							else
								System.out.printf("calisma saati girisi basarili.\ncalisma saati = %d\n",calismaSaati);
								break;
						}
						
					}
					
					while(true) {
						System.out.println("lutfen vergi oranini float bir bicimde giriniz.");
						String vO = okuyucu.nextLine().trim();
						
						if(vO.isEmpty())
							System.out.println("bir vergi orani girmediniz lutfen kontrol edip tekrar deneyiniz.");
						else
						{
							vergiOrani = Float.parseFloat(vO);
							if(vergiOrani > 1 || vergiOrani < 0)
								System.out.println("hatali bir vergi girisi yaptiniz lutfen kontrol ederek tekrar deneyiniz.");
							else
								System.out.printf("vergi orani girisi basarili.\nvergi orani = %.3f\n",vergiOrani);
								break;
						}
						
					}
					
					while (true) {
						System.out.println("Vardiya turu A veya B olacak sekilde lutfen bir secim yapiniz = ");
						String vT = okuyucu.nextLine().trim();
						
						if(vT.isEmpty())
							System.out.println("bir vardiya turu girmediniz lutfen kontrol edip tekrar deneyiniz");
						else
						{
							if(vT.length()>1)
							{
								
								vardiyaTipi = vT.toUpperCase().charAt(0);
								if(vardiyaTipi == 'A' || vardiyaTipi == 'B')
								{
									System.out.println("tek bir karakter girmeniz gerekirken fazla karakter girdiniz girmis oldugunuz metnin ilk karakteri default olarak vardiya turu olarak ataniyor.");
									System.out.println("eger bu durumu kabul ediyorsaniz = 1 e ,tekrar tuslama yapmak istiyorsaniz herhangi bir tusa basiniz.");
									String tekrarMı = okuyucu.nextLine();
									if(tekrarMı.charAt(0) == '1' && tekrarMı.length() == 1)
									{
										System.out.printf("vardiya tipi girisi basarili.\nVardiya tipi = %c\n",vardiyaTipi);
										break;
									}
									else
									{
										System.out.println("isteginiz uzerine tekrar vardiya girisi yapmak icin yonlendiriliyorsunuz.");
									}
									
								}
							}
							else
							{
								vardiyaTipi = vT.toUpperCase().charAt(0);
								if(vardiyaTipi == 'A' || vardiyaTipi == 'B')
								{
									System.out.printf("vardiya tipi girisi basarili.\nVardiya tipi = %c\n",vardiyaTipi);
									break;
								}
									
								else {
									System.out.println("girmis oldugunuz karakter A veya B olmadigindan dolayi bilgilerinizi kontrol edip tekrar deneyiniz.");
								}
							}
						}
					
					}
					break;
				
					
				}catch(NumberFormatException e){
					System.out.println("hatali bir giris yaptiniz lutfen kontrol edip tekrar deneyiniz.");
				}
				
				
			}
		}
		double brutUcret = saatlikUcret * calismaSaati;
		double vergiTutari = brutUcret * vergiOrani;
		double netMaas = brutUcret - vergiTutari;
		
		System.out.println("---Maas Bilgileri---");
		System.out.printf("Vardiya tipi = %c\nSaatlik ucret = %.2f\nHaftalik calisma saati = %d\nBrut maas = %.3f\nVergi orani = %.3f\nVergi tutari = %.3f\nNet maas = %.3f",vardiyaTipi,saatlikUcret,calismaSaati,brutUcret,vergiOrani,vergiTutari,netMaas);
	}

}
