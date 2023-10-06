package strategy;


public class cobranca1 implements Imposto {
    private static final double TAXA = 0.10;

    @Override
    public double calcular(double orcamento) {
        return orcamento * TAXA;
    }
}
