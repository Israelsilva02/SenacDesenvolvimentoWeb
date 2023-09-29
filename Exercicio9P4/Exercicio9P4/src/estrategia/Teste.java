package estrategia;

import java.util.Arrays;

public class Teste {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};
        SortContext context = new SortContext();

    
        context.setSortStrategy(new InsertionSort());
        context.sortArray(array.clone());
        System.out.println("Ordenação por Inserção: " + Arrays.toString(array));

    
        context.setSortStrategy(new SelectionSort());
        context.sortArray(array.clone());
        System.out.println("Ordenação por Seleção: " + Arrays.toString(array));

       
        context.setSortStrategy(new BubbleSort());
        context.sortArray(array.clone());
        System.out.println("Ordenação por Bolha: " + Arrays.toString(array));
    }
}

