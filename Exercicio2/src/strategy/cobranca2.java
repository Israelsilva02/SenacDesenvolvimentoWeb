package strategy;

public class cobranca2 implements Imposto {
    private static final double TAXA = 0.15;

    @Override
    public double calcular(double orcamento) {
        return orcamento * TAXA;
    }
}