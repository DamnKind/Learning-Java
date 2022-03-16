package Dersler;

/**
 * İlk_hafta
 */
public class ilk_ders {

    public static void main(String[] args) {
        
        String internetSubeButonu="İnternet Şubesi";
        double dolarDun = 8.20;
        int vade = 36;
        boolean dustuMu=true;
        double dolarBugun=8.20;

        System.out.println(internetSubeButonu);

        if(dolarBugun<dolarDun) {
            System.out.println("Dolar Düştü.");
        }
        else if(dolarBugun>dolarDun) {
            System.out.println("Dolar yükseldi.");
        }
        else {
            System.out.println("Dolar Değişmedi.");
        }

        String[] krediler = {"Hızlı Kredi","Mutlu emekli kredisi","Konut kredisi","Çiftçi kredisi","Meb kredisi",};
        
        ///foreach
        //for(String kredi : krediler) {
        //    System.out.println(kredi);
        //}
        for(int i=0; i<krediler.length;i++) {
            System.out.println(krediler[i]);
        }
        

    }
}    