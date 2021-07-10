package br.edu.ifpb.web.jsp;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.edu.ifpb.domain.Pessoa;
import br.edu.ifpb.domain.PessoaEmMemoria;
import br.edu.ifpb.domain.Pessoas;

@Named
@SessionScoped
public class ControladorDePessoaReal implements Serializable { 

    private Pessoas pessoaEmMemoria = new PessoaEmMemoria();

   public String listar(){

    return "listagem";
   }

    public List<Pessoa> listPessoa() {
        pessoaEmMemoria.nova(new Pessoa("Maria")); 
        pessoaEmMemoria.nova(new Pessoa("Joao"));
        pessoaEmMemoria.nova(new Pessoa("Joaquin"));
        return pessoaEmMemoria.todas();
    }
}
