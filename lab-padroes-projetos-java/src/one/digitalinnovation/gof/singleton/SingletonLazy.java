package one.digitalinnovation.gof.singleton;

/**
 * Singleton "Preguiçoso"
 * @author pedronovaes1
 */
public class SingletonLazy {

    private static SingletonLazy instance; //uma instância dele mesmo

    //garantir que ninguém instâcia ele, colocando ele privado
    private SingletonLazy() {
        super();
    }
    //o método coloca ela de maneira pública
    public static SingletonLazy getInstance() {
        if(instance == null){
            instance = new SingletonLazy();
        }
        return instance;
    }
}
