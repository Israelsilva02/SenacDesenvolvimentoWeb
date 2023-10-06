package Composite;

import java.util.List;

public class Pedido {
    private String nomeCliente;
    private List<Componente> lista;
    private int numeroPedido;

    public Pedido(String nomeCliente, List<Componente> lista, int numeroPedido) {
        this.nomeCliente = nomeCliente;
        this.lista = lista;
        this.numeroPedido = numeroPedido;
    }

    public void mostrarDetalhesDoPedido() {
        System.out.println("Número do Pedido: " + numeroPedido);
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Itens do Pedido:");
        double totalCompra = 0;
        for (Componente componente : lista) {
            totalCompra += componente.calcularPreco();
            System.out.println("- " + componente);
        }
        System.out.println("Total da Compra: R$" + totalCompra);
    }
}

