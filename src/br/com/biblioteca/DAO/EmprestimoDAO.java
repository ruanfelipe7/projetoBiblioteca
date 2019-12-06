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

/**
 *
 * @author rf
 */
public interface EmprestimoDAO {
    public void adicionarEmprestimo(Emprestimo emprestimo);
    public void renovarEmprestimo(Emprestimo emprestimo);
    public void removerEmprestimo(Emprestimo emprestimo);
    public int quantidadeEmprestimo();
    public void listarEmprestimo();
    public Emprestimo getEmprestimo(int index);
    public Emprestimo getEmprestimoID(int id);
    
}
