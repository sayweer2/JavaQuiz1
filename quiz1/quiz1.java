	package quiz1;
	import java.util.Scanner;
	public class quiz1 {

	        public static void main(String[]args)
	        {

	            final double PI_SAYISI = 3.14; // burada daha dogru sonuclara ulasmak icin Math.PI kullanmak daha mantikli olacaktir...
	            int yariCap = 0;

	            Scanner scanner = new Scanner(System.in);

	            while(true) {
	                System.out.println("lutfen alani ve cevresinin hesaplanmasini istediginiz dairenin yari capini giriniz = ");
	                String r = scanner.nextLine();

	                try {
	                    yariCap = Integer.parseInt(r);
	                    if(yariCap <= 0)
	                    {
	                    	System.out.printf("girmis oldugunuz deger negatif bir sayidir ve bu durum mumkun degildir lutfen gecerli bir deger girerek tekrar deneyiniz\n");
	                    }
	                    else
	                    {
	                    System.out.printf("yaricap bilgisi basariyla alindi yaricap = %d\n",yariCap);
	                    break;
	                    }
	                }catch(NumberFormatException e) {

	                    System.out.println("maaelsef yanlis formatta giris denemesi yaptiniz tekrar deneyiniz.");
	                }
	            }

	            double cevre = 2 * PI_SAYISI * yariCap;
	            double alan = PI_SAYISI * Math.pow(yariCap, 2);

	            System.out.printf("yaricapi = %d olan dairenin\ncevresi = %.2f\nalani = %.2f\n",yariCap ,cevre ,alan);
	        }
	

}
