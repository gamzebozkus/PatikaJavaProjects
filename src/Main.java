import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    //-----------Not Ortalaması Hesaplayan Program--------
        //Değişkenleri oluştur
        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner inp=new Scanner(System.in);

        //kullanıcıdan değerleri al
        System.out.print("Matematik Notunuz: ");
        mat=inp.nextInt();
        System.out.print("Fizik Notunuz: ");
        fizik=inp.nextInt();
        System.out.print("Kimya Notunuz: ");
        kimya=inp.nextInt();
        System.out.print("Türkçe Notunuz: ");
        turkce=inp.nextInt();
        System.out.print("Tarih Notunuz: ");
        tarih=inp.nextInt();
        System.out.print("Muzik Notunuz: ");
        muzik=inp.nextInt();

        int toplam=(mat+fizik+kimya+turkce+tarih+muzik);
        double sonuc=toplam/6.0;
        System.out.println("Ortalamanız: "+sonuc);

    }
    }
