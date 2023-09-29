package fabrica;

public class ExemploUso {
    public static void main(String[] args) {
        ListaAbstrata<String> lista1 = ListaFactory.criarLista("ArrayList");
        lista1.adicionar("Elemento 1");
        lista1.adicionar("Elemento 2");
        lista1.imprimir();

        ListaAbstrata<Integer> lista2 = ListaFactory.criarLista("LinkedList");
        lista2.adicionar(1);
        lista2.adicionar(2);
        lista2.imprimir();

        ListaAbstrata<Double> lista3 = ListaFactory.criarLista("Vector");
        lista3.adicionar(3.14);
        lista3.adicionar(2.71);
        lista3.imprimir();
    }
}
