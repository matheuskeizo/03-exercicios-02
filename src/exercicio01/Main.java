package exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        Jogador j = new Jogador();

        System.out.print("Informe o nome do jogador :");
        j.nome=e.nextLine();
        for (int i = 0; i < j.pontos.length; i++) {
            System.out.print("Score "+(i+1)+": ");
            j.pontos[i]=e.nextDouble();
        }

        System.out.println(" ");
        System.out.println("Nome do jogador: "+j.nome);
        System.out.println("Score total: "+j.calculaPontosTotal());
    }

}
