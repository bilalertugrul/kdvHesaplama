import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         KDV Tutarı Hesaplayan Program
         Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

         (Not : KDV tutarını 18% olarak alın)

         KDV'siz Fiyat = 10;

         KDV'li Fiyat = 11.8;

         KDV tutarı = 1.8;

         Ödev
         Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
         */

        double taxRate, spend , taxSum;
        boolean condition, condition1;

        Scanner inputSpending = new Scanner(System.in);
        System.out.print("Harcama Giriniz : ");
        spend = inputSpending.nextDouble();

        taxRate = (spend>0) && (spend<=1000) ? 0.18 : 0.8;

        taxSum = spend + (spend*taxRate);

        System.out.println("Harcama : " + spend);
        System.out.println("KDV Oranı : " + taxRate);
        System.out.println("KDV Dahil Fiyat : " + taxSum);







    }
}