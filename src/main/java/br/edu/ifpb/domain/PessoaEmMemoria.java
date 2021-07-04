package br.edu.ifpb.domain;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class PessoaEmMemoria implements Pessoas{

    private List<Pessoa> pessoas = new LinkedList<Pessoa>();

    @Override
    public void nova(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    @Override
    public List<Pessoa> todas() {
        return pessoas;
    }

    @Override
    public void excluir(Pessoa pessoa) {
        pessoas.remove(pessoa);
    }

    @Override
    public void atualizar(Pessoa pessoa) {
        Pessoa pessoaAntiga = this.localizarPessoaComId(pessoa.getId());
        this.excluir(pessoaAntiga);
        this.nova(pessoa);
    }

    @Override
    public Pessoa localizarPessoaComId(long id) {
        for (Pessoa p : pessoas){
            if(p.getId() == id ){
                return p;
            }
        }
        return null;
    }

    @Override
    public List<Dependente> todosOsDepentendes() {
        List<Dependente> dependentes = new LinkedList<>();

        for (Pessoa p : pessoas){
            if (p.getDependente() != null) {
                dependentes.add(p.getDependente());
            }
        }

        return dependentes;
    }

    @Override
    public Dependente localizarDependenteComId(String uuid) {
        for (Pessoa p : pessoas){
            if (p.getDependente().getUuid().equals(uuid)){
                return p.getDependente();
            }
        }
        return null;
    }

    @Override
    public void novo(Dependente dependente) {

    }
}
