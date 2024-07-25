package one.digitalinnovation.gof.singleton;

/**
 * Singleton "Apressado"
 * @author pedronovaes1
 */
public class SinglentonEager {

    private static SinglentonEager instance = new SinglentonEager(); //uma instância dele mesmo

    //garantir que ninguém instâcia ele, colocando ele privado
    private SinglentonEager() {
        super();
    }
    //ela já está instância e não precisa mais
    public static SinglentonEager getInstance() {
        return instance;
    }
}
