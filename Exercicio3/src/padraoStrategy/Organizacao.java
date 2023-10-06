package padraoStrategy;

import java.util.Arrays;

public class Organizacao {
    private Ordenacao estrategia;

    public Organizacao(Ordenacao estrategia) {
        this.estrategia = estrategia;
    }

    public void ordenarVetor(int[] vetor) {
        estrategia.ordenar(vetor);
    }

    public static void main(String[] args) {
        int[] vetor = {12, 2, 8, 1, 3};
        
       
        Organizacao ordenadorInsertion = new Organizacao(new Atribuicao());
        ordenadorInsertion.ordenarVetor(vetor.clone());
        System.out.println("Insertion Sort: " + Arrays.toString(vetor));

        Organizacao ordenadorSelection = new  Organizacao(new Selecao());
        ordenadorSelection.ordenarVetor(vetor.clone());
        System.out.println("Selection Sort: " + Arrays.toString(vetor));

        Organizacao ordenadorBubble = new  Organizacao(new Junta());
        ordenadorBubble.ordenarVetor(vetor.clone());
        System.out.println("Bubble Sort: " + Arrays.toString(vetor));
    }
}
