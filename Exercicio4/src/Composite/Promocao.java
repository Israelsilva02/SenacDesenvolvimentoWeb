package Composite;

public class Promocao implements Componente {
    private String nome;
    private double preco;
    private double desconto;

    public Promocao(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    @Override
    public double calcularPreco() {
        return preco - (preco * desconto);
    }

    @Override
    public String toString() {
        return nome + " - R$" + preco + " (Desconto: " + (desconto * 100) + "%)";
    }
}