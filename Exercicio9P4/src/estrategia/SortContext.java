package estrategia;


class SortContext {
 private SortStrategy sortStrategy;


 public void setSortStrategy(SortStrategy sortStrategy) {
     this.sortStrategy = sortStrategy;
 }

 
 public void sortArray(int[] array) {
     if (sortStrategy == null) {
         throw new IllegalStateException("Estratégia de ordenação não definida.");
     }
     sortStrategy.sort(array);
 }
}

