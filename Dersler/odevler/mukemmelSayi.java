package Dersler.odevler;
import java.util.Scanner;

public class mukemmelSayi {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Bir sayı giriniz.");
            int number = Integer.valueOf(scan.nextLine());
            int total = 0;
            for(int i=1;i<number;i++) {
                if(number%i==0) {
                    total+=i;
                }
            }
            if(total==number) {
                System.out.println("Sayı mükemmel sayıdır.");
            }
            else{System.out.println("Sayi mükemmel sayı değildir.");}
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
