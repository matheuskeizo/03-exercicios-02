package exercicio01;

public class Jogador {
        String nome;
        double[] pontos = new double[3];

        public double calculaPontosTotal(){
            double total=0;
            for (double i : pontos) {
                total+=i;
            }
            return total;
        }
}
