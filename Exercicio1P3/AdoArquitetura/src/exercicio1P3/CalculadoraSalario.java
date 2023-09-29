package exercicio1P3;


class CalculadoraSalario {
 private BonusStrategy bonusStrategy;

 
 public void setBonusStrategy(BonusStrategy bonusStrategy) {
     this.bonusStrategy = bonusStrategy;
 }

 
 public double calcularSalarioComBonus(double salarioBase) {
     if (bonusStrategy == null) {
         throw new IllegalStateException("Estratégia de bônus não definida.");
     }
     return bonusStrategy.calcularSalarioComBonus(salarioBase);
 }
}
