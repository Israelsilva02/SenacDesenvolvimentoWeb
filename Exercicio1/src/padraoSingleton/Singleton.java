package padraoSingleton;

public class Singleton {

    private static volatile Singleton uniqueInstance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

    public void showMessage() {
        System.out.println("Exemplo Singleton ");
    }

    public static void main(String[] args) {

        Singleton instance1 = Singleton.getInstance();
        instance1.showMessage();

        Singleton instance2 = Singleton.getInstance();

      
        if (instance1 == instance2) {
            System.out.println("instancia 1 e instancia 2 elas são a mesma instância.");
        } else {
            System.out.println("instancia 1 e instancia 2 são instâncias diferentes.");
        }
    }
}
