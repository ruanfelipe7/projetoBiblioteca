/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.biblioteca.DAO;

import br.com.biblioteca.model.Aluno;
import br.com.biblioteca.model.Emprestimo;
import br.com.biblioteca.model.Livro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rf
 */
public class EmprestimoDAOImple implements EmprestimoDAO{
    private List<Emprestimo>  emprestimos;
    
    public EmprestimoDAOImple(){
        this.emprestimos = new ArrayList<Emprestimo>();
    }
    
    @Override
    public void adicionarEmprestimo(Emprestimo emprestimo) {
        this.emprestimos.add(emprestimo);
    }

    @Override
    public void renovarEmprestimo(Emprestimo emprestimo) {
        //TODO: IMPLEMENTAR
    }

    @Override
    public void removerEmprestimo(Emprestimo emprestimo) {
        this.emprestimos.remove(emprestimo);
    }

    @Override
    public void listarEmprestimo() {
        //TODO: IMPLEMENTAR
    }

    @Override
    public Emprestimo getEmprestimo(int index) {
        return this.emprestimos.get(index);
    }

    @Override
    public int quantidadeEmprestimo() {
        return emprestimos.size();
    }

    @Override
    public Emprestimo getEmprestimoID(int id) {
        Emprestimo emprestimo = new Emprestimo();
        for(int i = 0; i < emprestimos.size(); i++){
            emprestimo = emprestimos.get(i);
            if(emprestimo.getId() == id){
                return emprestimo;
            }    
        }
        return null;
    }
    
    
    
}
