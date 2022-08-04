
package one.digital.innovation.gof.facade;

import one.digital.innovation.gof.subsistemas.cre.CrmService;
import one.digital.innovation.gof.subsistemas2.cep.CepApi;

public class Facade {
    public void migrarCliente (String nome, String cep) {
       
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);
        
        CrmService.gravarCliente(nome, cep, cidade, estado);
        
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(estado);
    }
    
}
