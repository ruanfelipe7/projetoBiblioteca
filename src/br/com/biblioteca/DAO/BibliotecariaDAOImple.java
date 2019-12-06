/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.biblioteca.DAO;

import br.com.biblioteca.model.Aluno;
import br.com.biblioteca.model.Bibliotecaria;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rf
 */
public class BibliotecariaDAOImple implements BibliotecariaDAO{
    private List<Bibliotecaria> bibliotecarias;

    public BibliotecariaDAOImple() {
        this.bibliotecarias = new ArrayList<Bibliotecaria>();
    }
    
    
    
    @Override
    public void adicionarBibliotecaria(Bibliotecaria bibliotecaria) {
        this.bibliotecarias.add(bibliotecaria);
    }

    @Override
    public void removerBibliotecaria(Bibliotecaria bibliotecaria) {
        this.bibliotecarias.remove(bibliotecaria);
    }

    @Override
    public int quantidadeBibliotecaria() {
        return this.bibliotecarias.size();
    }

    @Override
    public void listarBibliotecaria() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Bibliotecaria getBibliotecaria(int index) {
        return this.bibliotecarias.get(index);
    }

    @Override
    public Bibliotecaria buscarBibliotecaria(String usuario, String senha) {
        Bibliotecaria bibliotecaria = new Bibliotecaria();
        for(int i = 0; i < bibliotecarias.size(); i++){
            bibliotecaria = bibliotecarias.get(i);
            if(bibliotecaria.getUsuario().equals(usuario) && bibliotecaria.getSenha().equals(senha)){
                return bibliotecaria;
            }
        }
        return null;
    }
    
    @Override
    public boolean bibliotecariaJaCadastrada(String usuario, String cpf) {
        Bibliotecaria bibliotecaria = new Bibliotecaria();
        for(int i = 0; i < bibliotecarias.size(); i++){
            bibliotecaria = bibliotecarias.get(i);
            if(bibliotecaria.getUsuario().equals(usuario) || bibliotecaria.getCpf()== cpf){
                return true;
            }
        }
        return false;
    }
    
    
    @Override
    public boolean bibliotecariaJaCadastrada(String usuario, String cpf, Bibliotecaria bibliotecaria) {
        Bibliotecaria bibliotecaria1 = new Bibliotecaria();
        for(int i = 0; i < bibliotecarias.size(); i++){
            bibliotecaria1 = bibliotecarias.get(i);
            if(!bibliotecaria1.equals(bibliotecaria)){    
                if(bibliotecaria1.getUsuario().equals(usuario) || bibliotecaria1.getCpf()== cpf){
                    return true;
                }
            }   
        }
        return false;
    }
    
    @Override
    public Bibliotecaria getBibliotecariaCPF(String cpf) {
        Bibliotecaria bibliotecaria = new Bibliotecaria();
        for(int i = 0; i < bibliotecarias.size(); i++){
            bibliotecaria = bibliotecarias.get(i);
            if(bibliotecaria.getCpf().equals(cpf)){
                return bibliotecaria;
            }
        }
        return null;
    }
    
}
