import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double mat, fızık, turkce, kımya, muzık, ort, dersNotları;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Matematik Notunuzu Giriniz: ");
        mat = scanner.nextInt();
        System.out.print("Fizik Notunuzu Giriniz: ");
        fızık = scanner.nextInt();
        System.out.print("Türkçe Notunuzu Giriniz: ");
        turkce = scanner.nextInt();
        System.out.print("Kimya Notunuzu Giriniz: ");
        kımya = scanner.nextInt();
        System.out.print("Müzik Notunuzu Giriniz: ");
        muzık = scanner.nextInt();
        if (mat >= 0 && mat <= 100 && fızık >= 0 && fızık <= 100 && turkce >= 0 && turkce <= 100 && kımya >= 0 && kımya <= 100 && muzık >= 0 && muzık <= 100) {

            ort = (mat + fızık + turkce + kımya + muzık) / 5;

            if (ort < 55) {
                System.out.println("Sınıfta Kaldınız.");
            } else {
                System.out.println("Sınıfı geçtiniz.");
            }
            System.out.println("Ortalamanız: " + ort);
        } else System.out.println("Geçersiz Not Girişi Var, Kontrol Ediniz!");
    }
}