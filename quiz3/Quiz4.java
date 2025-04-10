package quiz3;

import javax.swing.JOptionPane;

import java.util.*;

public class Quiz4 {
	
	public static void main(String[]args) {
		
		double saatlikUcret;
		int calismaSaati;
		float vergiOrani;
		char vardiyaTipi;
		
		
		while(true) {
			try {
				saatlikUcret = Double.parseDouble(JOptionPane.showInputDialog("calisanin saatlik ucretini giriniz double bir sekilde giriniz = ").trim());
				
				if(saatlikUcret > 0)
					break;
				else
					JOptionPane.showMessageDialog(null, "lutfen bilgileri kontrol edip tekrar deneyiniz negatif ya da 0 Tl bir ucret olamaz");
			}catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null , "girmis oldugunuz bilgileri kontrol ederek tekrar deneyiniz. Hatali giris.");
			}
			
			
		}
		while(true) {
			try {
				calismaSaati = Integer.parseInt(JOptionPane.showInputDialog("lutfen haftalik calisma saatini giriniz = ").trim());
				
				if(calismaSaati >= 0)
					break;
				else
					JOptionPane.showMessageDialog(null, "negatif calisma saati olamaz. kontrol edip tekrar deneyiniz");
			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Hata lutfen bilgileri kontrol edip tekrar denyiniz.");
			}
		}
		while(true) {
			try {
				vergiOrani = Float.parseFloat(JOptionPane.showInputDialog("lutfen vergi oranini float bir bicimde giriniz = ").trim());
				
				if(vergiOrani < 1 && vergiOrani >= 0)
					break;
				else
					JOptionPane.showMessageDialog(null, "lutfen bilgilerinizi kontrol edip gecerli bir deger giriniz");
			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "bilgilerinizi kontrol edip tekrar deneyiniz.");
			}
		}
		while(true) {
				vardiyaTipi = JOptionPane.showInputDialog("lutfen vardiya tipini (A veya B olacak sekilde) giriniz.").trim().toUpperCase().charAt(0);
			
				if(vardiyaTipi == 'A' || vardiyaTipi == 'B')
					break;
				else
					JOptionPane.showMessageDialog(null, "lutfen var olan(A veya B) vardiyalardan seciniz.");
			
		}
		
		double brutMaas = saatlikUcret * calismaSaati ;
		double vergiTutari = brutMaas * vergiOrani ;
		double netMaas = brutMaas - vergiTutari ;
		
		String maasBilgisi = "---Maas Bilgisi---\n"
				+"Vardiya Tibi = " + vardiyaTipi + 
				"\nSaatlik Ucret = " +
				saatlikUcret +
				"\nHaftalık Calisma Saati  = " +
				calismaSaati +
				"\nBrut Maas = " +
				brutMaas +
				"\nVergi Orani = " +
				vergiOrani +
				"\nVergi Tutari = " +
				vergiTutari + 
				"\nNet Maas = " +
				netMaas;
		JOptionPane.showMessageDialog(null ,maasBilgisi);
		
	}

}
