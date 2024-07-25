package one.digitalinnovation.gof.singleton;

/**
 * Singleton "Lazy Holder"
 *
 * @author pedronovaes1
 */
public class SingletonLazyHolder {

    private static class Holder{
        public static SingletonLazyHolder instance = new SingletonLazyHolder();
    }
    //garantir que ninguém instâcia ele, colocando ele privado
    private SingletonLazyHolder() {
        super();
    }
    //o método coloca ela de maneira pública
    public static SingletonLazyHolder getInstance() {
        return Holder.instance;
    }
}
