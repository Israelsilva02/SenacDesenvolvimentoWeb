package exercicio1P3;

public class Main {
    public static void main(String[] args) {
        CalculadoraSalario calculadora = new CalculadoraSalario();

        
        calculadora.setBonusStrategy(new GerenciaBonus());
        double salarioGerencia = calculadora.calcularSalarioComBonus(5000);
        System.out.println("Salário da Gerência com bônus: " + salarioGerencia);


        calculadora.setBonusStrategy(new DesenvolvimentoBonus());
        double salarioDesenvolvimento = calculadora.calcularSalarioComBonus(4500);
        System.out.println("Salário do Desenvolvimento com bônus: " + salarioDesenvolvimento);

       
        calculadora.setBonusStrategy(new SuporteBonus());
        double salarioSuporte = calculadora.calcularSalarioComBonus(4000);
        System.out.println("Salário do Suporte com bônus: " + salarioSuporte);

        
        calculadora.setBonusStrategy(new OutrosDepartamentosBonus());
        double salarioOutrosDepartamentos = calculadora.calcularSalarioComBonus(3500);
        System.out.println("Salário de outros departamentos com bônus: " + salarioOutrosDepartamentos);
    }
}
