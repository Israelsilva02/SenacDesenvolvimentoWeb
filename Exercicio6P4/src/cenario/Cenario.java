package cenario;

public class Cenario {
    private static Cenario cenario = null;

    private Cenario() {
    }

    public static Cenario getCenario() {
        if (cenario == null)
            cenario = new Cenario();

        return cenario;
    }

    public void configuracoes() {
        System.out.println("Configurações aplicadas com sucesso!");
    }

    public static void main(String[] args) {
        Cenario cenario = Cenario.getCenario();
        cenario.configuracoes();
    }
}

