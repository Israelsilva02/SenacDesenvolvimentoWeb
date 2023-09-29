package fabrica;


class ListaFactory {
 public static <T> ListaAbstrata<T> criarLista(String tipo) {
     if (tipo.equalsIgnoreCase("ArrayList")) {
         return new ArrayListAbstrato<>();
     } else if (tipo.equalsIgnoreCase("LinkedList")) {
         return new LinkedListAbstrato<>();
     } else if (tipo.equalsIgnoreCase("Vector")) {
         return new VectorAbstrato<>();
     } else {
         throw new IllegalArgumentException("Tipo de lista não suportado: " + tipo);
     }
 }
}

