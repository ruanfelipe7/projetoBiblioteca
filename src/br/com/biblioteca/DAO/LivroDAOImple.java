/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.biblioteca.DAO;

import br.com.biblioteca.model.Aluno;
import br.com.biblioteca.model.Livro;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author rf
 */
public class LivroDAOImple implements LivroDAO{
    
    private List<Livro> livros;
    
    public LivroDAOImple(){
        this.livros = new ArrayList<Livro>();
    }
        
    @Override
    public void adicionarLivro(Livro livro) {
        if(this.livros.contains(livro)){
            JOptionPane.showMessageDialog(null, "Livro já Cadastrado", "Erro ao realizar o cadastro", JOptionPane.ERROR_MESSAGE);
        }else{
            this.livros.add(livro);
        }
    }

    @Override
    public void removerLivro(Livro livro) {
        this.livros.remove(livro);
    }

    @Override
    public int quantidadeLivro() {
        return this.livros.size();
    }

    @Override
    public Livro getLivro(int index) {
        return this.livros.get(index);
    }

    @Override
    public boolean livroJaCadastrado(String isbn) {
        Livro livro = new Livro();
        for(int i = 0; i < livros.size(); i++){
            livro = livros.get(i);
            if(livro.getIsbn().equals(isbn)){
                return true;
            }
        }
        return false;
    }
    
    @Override
    public boolean livroJaCadastrado(String isbn, Livro livro) {
        Livro livro1 = new Livro();
        for(int i = 0; i < livros.size(); i++){
            livro1 = livros.get(i);
            if(!livro1.equals(livro)){
                if(livro1.getIsbn().equals(isbn)){
                    return true;
                }
            }
         }
        return false;
    }

    @Override
    public Livro getLivroIsbn(String isbn) {
        Livro livro = new Livro();
        for(int i = 0; i < livros.size(); i++){
            livro = livros.get(i);
            if(livro.getIsbn().equals(isbn)){
                return livro;
            }
        }
        return null;
    }
    
}
