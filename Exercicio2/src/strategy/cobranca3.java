package strategy;

public class cobranca3 implements Imposto {
    private static final double TAXA = 0.25;

    @Override
    public double calcular(double orcamento) {
        return orcamento * TAXA;
    }
}