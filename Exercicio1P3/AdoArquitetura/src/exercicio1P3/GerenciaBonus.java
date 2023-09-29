package exercicio1P3;


class GerenciaBonus implements BonusStrategy {
 private static final double BONUS_PERCENTAGE = 0.06;

 @Override
 public double calcularSalarioComBonus(double salarioBase) {
     return salarioBase * (1 + BONUS_PERCENTAGE);
 }
}


class DesenvolvimentoBonus implements BonusStrategy {
 private static final double BONUS_PERCENTAGE = 0.05;

 @Override
 public double calcularSalarioComBonus(double salarioBase) {
     return salarioBase * (1 + BONUS_PERCENTAGE);
 }
}

class SuporteBonus implements BonusStrategy {
 private static final double BONUS_PERCENTAGE = 0.04;

 @Override
 public double calcularSalarioComBonus(double salarioBase) {
     return salarioBase * (1 + BONUS_PERCENTAGE);
 }
}

class OutrosDepartamentosBonus implements BonusStrategy {
 private static final double BONUS_PERCENTAGE = 0.03;

 @Override
 public double calcularSalarioComBonus(double salarioBase) {
     return salarioBase * (1 + BONUS_PERCENTAGE);
 }
}
