package Composite;

import java.util.ArrayList;
import java.util.List;

public class LojaVirtual {
    public static void main(String[] args) {
        List<Componente> itensDoPedido = new ArrayList<>();
        itensDoPedido.add(new Produto("Produto 1", 50.0));
        itensDoPedido.add(new Produto("Produto 2", 30.0));
        itensDoPedido.add(new Promocao("Promoção 1", 25.0, 0.1));

        Pedido pedido = new Pedido("Cliente 1", itensDoPedido, 12345);
        pedido.mostrarDetalhesDoPedido();
    }
}
