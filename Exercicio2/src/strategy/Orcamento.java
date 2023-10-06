package strategy;

import java.util.List;

public class Orcamento {
    private List<Double> servicosProdutos;

    public Orcamento(List<Double> servicosProdutos) {
        this.servicosProdutos = servicosProdutos;
    }

    public double calcularImposto(Imposto imposto) {
        double total = 0;
        for (double valor : servicosProdutos) {
            total += imposto.calcular(valor);
        }
        return total;
    }

    public static void main(String[] args) {
        List<Double> valores = List.of(5100.0, 2200.0, 9300.0); 
        Orcamento orcamento = new Orcamento(valores);

        Imposto ip1 = new cobranca1();
        Imposto ip2 = new cobranca2();
        Imposto ip3 = new cobranca3();

       
        double imposto1 = orcamento.calcularImposto(ip1);
        double imposto2 = orcamento.calcularImposto(ip2);
        double imposto3 = orcamento.calcularImposto(ip3);

        System.out.println("O valor total do orçamento do imposto 1: " + imposto1);
        System.out.println("O valor total do orçamento do imposto 2: " + imposto2);
        System.out.println("O valor total do orçamento do imposto 3: " + imposto3);
    }
}
