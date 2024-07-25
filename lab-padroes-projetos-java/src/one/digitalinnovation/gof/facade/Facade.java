package one.digitalinnovation.gof.facade;

import one.digitalinnovation.gof.subsistema1.crma.CrmService;
import one.digitalinnovation.gof.subsistema2.CepAPI;


public class Facade {
    public void migrarCliente(String nome, String cep){
        String cidade = CepAPI.getInstacia().recuperarCidade(cep);
        String estado = CepAPI.getInstacia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
