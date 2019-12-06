/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.biblioteca.DAO;

import br.com.biblioteca.model.Aluno;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author rf
 */
public class AlunoDAOImple implements AlunoDAO{
    private List<Aluno> alunos;
    
    public AlunoDAOImple(){
        this.alunos = new ArrayList<Aluno>();
    }
    
    @Override
    public void adicionarAluno(Aluno aluno) {
        if(this.alunos.contains(aluno)){
            JOptionPane.showMessageDialog(null, "Aluno já Cadastrado", "Erro ao realizar o cadastro", JOptionPane.ERROR_MESSAGE);
        }else{
            this.alunos.add(aluno);
        }
        
    }

    @Override
    public void removerAluno(Aluno aluno) {
         this.alunos.remove(aluno);
    }

    @Override
    public int quantidadeAlunos() {
        return this.alunos.size();
    }

    @Override
    public void listarAlunos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean verificarVazio() {
        return this.alunos.isEmpty();
    }

    @Override
    public Aluno getAluno(int index) {
      return this.alunos.get(index);
    }


    @Override
    public void removerVariosAlunos(ArrayList alunos) {
        this.alunos.removeAll(alunos);
    }

    @Override
    public Aluno buscarAluno(String usuario, String senha) {
        Aluno aluno = new Aluno();
        for(int i = 0; i < alunos.size(); i++){
            aluno = alunos.get(i);
            if(aluno.getUsuario().equals(usuario) && aluno.getSenha().equals(senha)){
                return aluno;
            }
        }
        return null;
    }

    @Override
    public boolean alunoJaCadastrado(String usuario, int matricula) {
        Aluno aluno = new Aluno();
        for(int i = 0; i < alunos.size(); i++){
            aluno = alunos.get(i);
            if(aluno.getUsuario().equals(usuario) || aluno.getMatricula() == matricula){
                return true;
            }
        }
        return false;
    }
    
    @Override
    public boolean alunoJaCadastrado(String usuario, int matricula, Aluno aluno) {
        Aluno aluno1 = new Aluno();
        for(int i = 0; i < alunos.size(); i++){
            aluno1 = alunos.get(i);
            if(!aluno1.equals(aluno)){
                if(aluno1.getUsuario().equals(usuario) || aluno1.getMatricula() == matricula){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Aluno getAlunoMatricula(int matricula) {
        Aluno aluno = new Aluno();
        for(int i = 0; i < alunos.size(); i++){
            aluno = alunos.get(i);
            if(aluno.getMatricula() == matricula){
                return aluno;
            }
        }
        return null;
    }
    
}
