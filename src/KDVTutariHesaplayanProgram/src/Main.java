import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //KDV tutarı hesaplama
        double fiyat;
        double kdvOran = 0.8;
        Scanner inp=new Scanner(System.in);
        System.out.println("KDV'siz değeri giriniz:");
        fiyat=inp.nextDouble();
        if(fiyat<=1000 && fiyat>0){

            kdvOran=1.8;
        }
        else if(fiyat>1000){
            kdvOran=0.8;
        }

        double kdvEklendi=(fiyat)+kdvOran;
        System.out.println("KDV'siz Fiyat=\t"+fiyat);
        System.out.println("KDV'li Fiyat=\t"+kdvEklendi);
        System.out.println("KDV tutarı=\t"+kdvOran);



    }
}