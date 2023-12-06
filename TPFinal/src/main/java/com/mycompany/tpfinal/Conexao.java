/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpfinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author konsa
 */
public class Conexao {
    private Connection myConn = null;
    private Statement myStmt = null;
    private ResultSet myRs = null;
    private String usuario = "root";
    private String senha = "root";
    
    public Conexao(){
        try {
        	myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/TPFinal", usuario, senha);            
            myStmt = myConn.createStatement();
        } catch (SQLException e) {
            erro(e, "Conn");
        }
    }
    
    public void fecha(){
        try {
            if (myRs != null)
                myRs.close();

            if (myStmt != null) 
                myStmt.close();

            if (myConn != null)
                myConn.close();
                                   
        } catch (SQLException e) {
            erro(e, "fecha");
        }
        
    }   
    
    public void insere (String nome, int idade, float peso, float altura, String objetivo){        
        try {
            myStmt.executeUpdate("insert into alunos (nome, idade, peso, altura, objetivo) values('" + nome +"', " + idade +", " + peso + ", " + altura + ", '" + objetivo + "');");
        } catch (SQLException e) {
            erro(e, "insere");
        }
        
        JOptionPane.showMessageDialog(null,"Aluno adicionado com sucesso", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void erro(SQLException e, String classe){
        JOptionPane.showMessageDialog(null,classe +"\n" + e,"Erro", JOptionPane.ERROR_MESSAGE);
    }
}
