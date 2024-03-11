import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double birinciKenar ;
        double ikinciKenar;
        double ucuncuKenar;
      Scanner inp=new Scanner(System.in);

      System.out.println("Birinci kenarı giriniz:");
        birinciKenar=inp.nextDouble();
        System.out.println("İkinci kenarı giriniz:");
        ikinciKenar=inp.nextDouble();
        System.out.println("Üçüncü kenarı giriniz:");
        ucuncuKenar=inp.nextDouble();
        double u=(birinciKenar+ikinciKenar+ucuncuKenar)/2;
        double alan = 0;
        alan=u*(u-birinciKenar)*(u-ikinciKenar)*(u-ucuncuKenar);
        System.out.println("Alan:"+alan);
        }
    }
