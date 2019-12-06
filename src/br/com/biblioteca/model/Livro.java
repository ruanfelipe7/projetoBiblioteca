/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.biblioteca.model;

import java.awt.Image;
import javax.swing.Icon;

/**
 *
 * @author rf
 */
public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private String descricao;
    private int quantidade;
    private int quantidadeDisponivel;
    private Icon imagemLivro;
    private String nomeImagem;
    

    public Livro(String titulo, String autor, String isbn, String descricao, int quantidade, Icon imagemLivro, String nomeImagem) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.imagemLivro = imagemLivro;
        this.quantidadeDisponivel = quantidade - 1;
        this.nomeImagem = nomeImagem;
    }

    public Livro() {
    
    }
    
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Icon getImagemLivro() {
        return imagemLivro;
    }

    public void setImagemLivro(Icon imagemLivro) {
        this.imagemLivro = imagemLivro;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setDisponivel(int quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public String getNomeImagem() {
        return nomeImagem;
    }

    public void setNomeImagem(String nomeImagem) {
        this.nomeImagem = nomeImagem;
    }
    
    
    
}
