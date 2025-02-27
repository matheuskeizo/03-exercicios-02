package exercicio03;

public class Ponto {
    int x;
    int y;

    public double calculaDist(Ponto p) {
        double distPont = 0;
        distPont = Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));
        return distPont;
    }

    public double distOrig() {
        Ponto origem = new Ponto();
        return calculaDist(origem);
    }

    public String formatPonto() {
        return "(" + x + "," + y + ")";
    }

    public Ponto pontoMaisProx(Ponto p1, Ponto p2) {
        double dp1 = p1.distOrig();
        double dp2 = p2.distOrig();
        if (dp1 < dp2) {
            return p1;
        }
        return p2;
    }

}
