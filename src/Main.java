
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // Klavyeden okuma yapmak için Scanner nesnesini oluştur.
        Scanner reader = new Scanner(System.in);

        System.out.print("Bir Sayı Girin: ");

        // nextInt() metodu ile tam sayı türünde değer okuması yapılır.
        int num = reader.nextInt();

        int adet = 0,toplam=0;

        while(num != 0)
        {
            toplam=(num%10)+toplam;
            num /= 10;
            ++adet;
        }

        System.out.println("Basamak Toplamı: " + toplam);
        System.out.println("kaç basamaklı: "+adet);
    }
}