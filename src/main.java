
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("*******************************************************************************************");
        System.out.println("Fibonacci Sayı Dizisi...");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.print("Lütfen Fibonacci Dizisinin Kaç elemanını görmek istiyorsanız yazınız :");
        int değer = scanner.nextInt();
            int gecicieleman = 0;
            int kalicieleman = 1;
            System.out.print(gecicieleman+" "+kalicieleman+" ");
        for (int i = 3; i <= değer; i++) {
            int toplam = gecicieleman + kalicieleman;
            System.out.print(toplam+" ");
            gecicieleman = kalicieleman;
            kalicieleman = toplam;
        }
        System.out.println("");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("*******************************************************************************************");
    }
}
