import java.lang.Math.*;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner tara= new Scanner(System.in);
        System.out.println("lütfen üçgenin kenar uzunluklarını giriniz");
        double akenar= tara.nextDouble();
        double bkenar=tara.nextDouble();
        double hipo=Math.sqrt(Math.pow(akenar,2)+ Math.pow(bkenar,2));
        System.out.println("üçgenin hipotenüsü: "+(int)hipo);
        double cev=hipo+akenar+bkenar;
        double alan=Math.sqrt(cev*(cev-akenar)*(cev-bkenar)*(cev-hipo));
        System.out.println("üçgenin çevresi: "+(float)cev);
        System.out.println("üçgenin alanı: "+ (float)alan);
    }
}
