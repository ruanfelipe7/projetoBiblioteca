/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.biblioteca.model;

import java.time.LocalDate;

/**
 *
 * @author rf
 */
public class Aluno extends Pessoa{
    private String curso;
    private int matricula;
    private int quantidadeLivrosAlugados;

    
    
    public Aluno(String curso, int matricula, String nome, String cpf, String telefone, LocalDate dataNascimento, String usuario, String senha) {
        super(nome, cpf, telefone, dataNascimento, usuario, senha);
        this.curso = curso;
        this.matricula = matricula;
        this.quantidadeLivrosAlugados = 0;
    }
    
    public Aluno(){
        
    }    
    
    public String getCurso() {
        return curso;
    }

    public int getMatricula() {
        return matricula;
    }
    
    public int getQuantidadeLivrosAlugados() {
        return quantidadeLivrosAlugados;
    }

    public void setQuantidadeLivrosAlugados(int quantidadeLivrosAlugados) {
        this.quantidadeLivrosAlugados = quantidadeLivrosAlugados;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
}
