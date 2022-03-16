package Dersler.odevler;

import java.util.ArrayList;
import java.util.List;

public class asal_sayi {
    public static void main(String[] args) {
        List<Integer> asallar=new ArrayList<Integer>();
        List<Integer> sayilar=new ArrayList<Integer>();

        for(int i=1;i<=100;i++) {
            for(int j=1;j<=i;j++) {
                if(i%j==0) {
                    sayilar.add(i);
                    
                }

            }
            if (sayilar.size()<3) {
                asallar.add(i);
                System.out.println(i);
            }
            sayilar.clear();
        }
    }
}
