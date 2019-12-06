/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.biblioteca.main;

import br.com.biblioteca.DAO.AlunoDAOImple;
import br.com.biblioteca.DAO.BibliotecariaDAOImple;
import br.com.biblioteca.DAO.EmprestimoDAOImple;
import br.com.biblioteca.DAO.LivroDAOImple;
import static br.com.biblioteca.main.Main.bibliotecarias;
import br.com.biblioteca.model.Aluno;
import br.com.biblioteca.model.Bibliotecaria;
import br.com.biblioteca.view.TelaLogin;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author rf
 */
public class Main {
    public static AlunoDAOImple alunos = new AlunoDAOImple();
     public static LivroDAOImple livros = new LivroDAOImple();
     public static BibliotecariaDAOImple bibliotecarias = new BibliotecariaDAOImple();
     public static EmprestimoDAOImple emprestimos = new EmprestimoDAOImple();
     public static String usuarioSessao;
     public static String nomeSessao;
     public static String contaSessao;
     public static String cpfSessao;
     public static int matriculaSessao;
     
     public static int idEmprestimo = 1; 
     
     
    public static void main(String[] args) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimento = LocalDate.parse("01/01/2000", formato);   
        Bibliotecaria b1 = new Bibliotecaria("admin", "000.000.000-00", "(00) 00000-0000", dataNascimento, "bi", "123", "0000000000-0");
        Aluno a1 = new Aluno("EC", 123456, "Natan", "000.000.000-00", "(00) 00000-0000", dataNascimento, "al", "123");
        bibliotecarias.adicionarBibliotecaria(b1);
        alunos.adicionarAluno(a1);
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        TelaLogin telalogin = new TelaLogin();
        telalogin.setVisible(true);
       
    }
}
