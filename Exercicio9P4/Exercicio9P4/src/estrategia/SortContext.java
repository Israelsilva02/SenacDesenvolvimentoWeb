package estrategia;

//Classe contexto que utiliza a estratégia de ordenação
class SortContext {
 private SortStrategy sortStrategy;

 // Método para definir a estratégia em tempo de execução
 public void setSortStrategy(SortStrategy sortStrategy) {
     this.sortStrategy = sortStrategy;
 }

 // Método para ordenar o array com base na estratégia definida
 public void sortArray(int[] array) {
     if (sortStrategy == null) {
         throw new IllegalStateException("Estratégia de ordenação não definida.");
     }
     sortStrategy.sort(array);
 }
}

