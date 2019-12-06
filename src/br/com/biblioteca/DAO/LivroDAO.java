/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.biblioteca.DAO;

import br.com.biblioteca.model.Livro;

/**
 *
 * @author rf
 */
public interface LivroDAO {
    public void adicionarLivro(Livro livro);
    public void removerLivro(Livro livro);
    public int quantidadeLivro();
    public Livro getLivro(int index);
    public boolean livroJaCadastrado(String isbn);
    public boolean livroJaCadastrado(String isbn, Livro livro);
    public Livro getLivroIsbn(String isbn);
    
}
