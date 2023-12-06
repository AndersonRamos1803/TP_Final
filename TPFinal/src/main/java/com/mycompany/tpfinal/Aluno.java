/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpfinal;

/**
 *
 * @author konsa
 */
public class Aluno {
    private String nome;
    private int idade;
    private float peso, altura;
    private String objetivo;
            
    public Aluno(String nome, int idade, float peso, float altura, String objetivo){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.objetivo = objetivo;
    }
}
