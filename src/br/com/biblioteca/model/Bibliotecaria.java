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
public class Bibliotecaria extends Pessoa{
    private String rg;

    public Bibliotecaria(String nome, String cpf, String telefone, LocalDate dataNascimento, String usuario, String senha, String rg) {
        super(nome, cpf, telefone, dataNascimento, usuario, senha);
        this.rg = rg;
    }

    
    public Bibliotecaria() {
    
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    

    
}
