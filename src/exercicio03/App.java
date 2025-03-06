package exercicio03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        DecimalFormat fM = new DecimalFormat("0.00");
        Ponto p1 = new Ponto();
        Ponto p2 = new Ponto();

        System.out.println("Informe o ponto :");
        p1.x = e.nextInt();
        p1.y = e.nextInt();
        System.out.println();
        System.out.println("Informe o ponto 2:");
        p2.x = e.nextInt();
        p2.y = e.nextInt();
        System.out.println();
        System.out.println("A distancia do p1 para p2:"+fM.format(p1.calculaDist(p2)));
        System.out.println("A distancia do p2 para p1:"+fM.format(p2.calculaDist(p1)));
        System.out.println();
        System.out.println("A distancia dos pontos para origem:"+fM.format(p1.distOrig()));
        System.out.println("A distancia dos pontos para origem:"+fM.format(p2.distOrig()));
        System.out.println();
        Ponto aux=p1.pontoMaisProx(p1,p2);
        System.out.println("Ponto mais próximo da origem:"+(aux.formatPonto()));
    }
}
