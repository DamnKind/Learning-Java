package Dersler.odevler;

public class en_buyuk_sayi {
    public static void main(String[] args) {
        int ilkSayi = 55;
        int ikinciSayi = 15;
        int ucuncuSayı = 40;
        int enBuyukSayi=0;
        if(ilkSayi>ikinciSayi) {
            enBuyukSayi = ilkSayi;
        }
        else if(ikinciSayi>ilkSayi) {
            enBuyukSayi = ikinciSayi;
        }
        if(ucuncuSayı>enBuyukSayi) {
            enBuyukSayi = ucuncuSayı;
        }
        else if (enBuyukSayi>ucuncuSayı) {
            
        }
        System.out.println("En büyük Sayı: "+enBuyukSayi);
    }
}
