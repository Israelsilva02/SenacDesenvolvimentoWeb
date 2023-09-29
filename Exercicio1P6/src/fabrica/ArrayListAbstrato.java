package fabrica;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;


class ArrayListAbstrato<T> implements ListaAbstrata<T> {
    private ArrayList<T> lista = new ArrayList<>();

    @Override
    public void adicionar(T elemento) {
        lista.add(elemento);
    }

    @Override
    public void remover(T elemento) {
        lista.remove(elemento);
    }

    @Override
    public void imprimir() {
        System.out.println("ArrayList: " + lista);
    }
}


class LinkedListAbstrato<T> implements ListaAbstrata<T> {
    private LinkedList<T> lista = new LinkedList<>();

    @Override
    public void adicionar(T elemento) {
        lista.add(elemento);
    }

    @Override
    public void remover(T elemento) {
        lista.remove(elemento);
    }

    @Override
    public void imprimir() {
        System.out.println("LinkedList: " + lista);
    }
}


class VectorAbstrato<T> implements ListaAbstrata<T> {
    private Vector<T> lista = new Vector<>();

    @Override
    public void adicionar(T elemento) {
        lista.add(elemento);
    }

    @Override
    public void remover(T elemento) {
        lista.remove(elemento);
    }

    @Override
    public void imprimir() {
        System.out.println("Vector: " + lista);
    }
}

