/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.biblioteca.model;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author rf
 */
public class Emprestimo {
    private Aluno aluno;
    private Livro livro;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private boolean renovacao;
    private int id;
    private boolean emprestimoTerminado;

    public Emprestimo(Aluno aluno, Livro livro, LocalDate dataEmprestimo, LocalDate dataDevolucao, boolean renovacao, int id, boolean emprestimoTerminado) {
        this.aluno = aluno;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.renovacao = renovacao;
        this.id = id;
        this.emprestimoTerminado = emprestimoTerminado;
    }

    public Emprestimo(){
        
    }
    
    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public boolean getRenovacao() {
        return renovacao;
    }

    public void setRenovacao(boolean renovacao) {
        this.renovacao = renovacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isEmprestimoTerminado() {
        return emprestimoTerminado;
    }

    public void setEmprestimoTerminado(boolean emprestimoTerminado) {
        this.emprestimoTerminado = emprestimoTerminado;
    }
    
    
}
