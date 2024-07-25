package one.digitalinnovation.gof.subsistema2;

public class CepAPI {

    private static CepAPI instacia =  new CepAPI();

    private CepAPI(){
        super();
    }

    public static CepAPI getInstacia(){
        return instacia;
    }

    public String recuperarCidade(String cidade){
        return "Salvador";
    }

    public String recuperarEstado(String cep){
        return "São Paulo";
    }
}
