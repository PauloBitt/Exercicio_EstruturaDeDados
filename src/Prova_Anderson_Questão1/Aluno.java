/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prova_Anderson_Questão1;

import Exercicio03_Anderson_ListaDuplamenteEncadeada.*;
import Exercicio02_Anderson_ListaEncadeada.*;

/**
 *
 * @author paulo
 */
public class Aluno {
    private String nome;
    private int idade;

    public Aluno(){
        this.nome ="";
        this.idade=0;
    }

    public Aluno(String nome, int idade){
        this.nome = nome;
        this.idade= idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }
}
