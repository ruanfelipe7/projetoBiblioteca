/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.biblioteca.DAO;


import br.com.biblioteca.model.Bibliotecaria;
import java.util.ArrayList;

/**
 *
 * @author rf
 */
public interface BibliotecariaDAO {
    public void adicionarBibliotecaria(Bibliotecaria bibliotecaria);
    public void removerBibliotecaria(Bibliotecaria bibliotecaria);
    public int quantidadeBibliotecaria();
    public void listarBibliotecaria();
    public Bibliotecaria getBibliotecaria(int index);
    public Bibliotecaria buscarBibliotecaria(String usuario, String senha);
    public boolean bibliotecariaJaCadastrada(String usuario, String cpf);
    public boolean bibliotecariaJaCadastrada(String usuario, String cpf, Bibliotecaria bibliotecaria);
    public Bibliotecaria getBibliotecariaCPF(String cpf);
}
