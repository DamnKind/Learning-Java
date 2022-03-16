package Dersler.odevler;
import java.util.Arrays;
import java.util.Scanner;

public class kalininceSes {
    public static void main(String[] args) {
        String [] kalinSes = {"A","I","O","U"};
        String [] inceSes = {"E","İ","Ö","Ü"};
        try (Scanner tara = new Scanner(System.in)) {
            System.out.println("Harf Giriniz.");
            String harf = tara.nextLine();
            if(Arrays.asList(kalinSes).contains(harf.toUpperCase())) {
                System.out.println("Harf kalın seslidir.");
            }
            else if(Arrays.asList(inceSes).contains(harf.toUpperCase())) {
                System.out.println("Harf ince seslidir");
            }
            else {
                System.out.println("Geçersiz harf girdiniz.");
            }
        }

    }
}
