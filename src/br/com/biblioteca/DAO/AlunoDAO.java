/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.biblioteca.DAO;

import br.com.biblioteca.model.Aluno;
import java.util.ArrayList;

/**
 *
 * @author rf
 */
public interface AlunoDAO {
    
    public void adicionarAluno(Aluno aluno);
    public void removerAluno(Aluno aluno);
    public int quantidadeAlunos();
    public void listarAlunos();
    public boolean verificarVazio();
    public Aluno getAluno(int index);
    public Aluno getAlunoMatricula(int matricula);
    public void removerVariosAlunos(ArrayList alunos);
    public Aluno buscarAluno(String usuario, String senha);
    public boolean alunoJaCadastrado(String usuario, int matricula);
    public boolean alunoJaCadastrado(String usuario, int matricula, Aluno aluno);
}
