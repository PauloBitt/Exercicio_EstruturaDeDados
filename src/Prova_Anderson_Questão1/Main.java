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
public class Main {
    public static void main(String[] args) {
        //Estanciando alunos
	Aluno a1 = new Aluno("Anderson", 40);
        Aluno a2 = new Aluno("Brenno", 19);
        Aluno a3 = new Aluno("Francisco", 19);
        Aluno a4 = new Aluno("VinyJ", 20);
        Aluno a5 = new Aluno("Danilo", 19);
        Aluno a6 = new Aluno("Paulo", 19);
        
        //Criando a Lista Encadeada
        ListaDuplaProva lista = new ListaDuplaProva();

        //Adicionando Alunos no inicio da lista
        lista.adicionaInicio(a1);
        lista.adicionaInicio(a2);
        lista.adicionaInicio(a3);
        lista.adicionaInicio(a4);
        lista.adicionaInicio(a5);
        lista.adicionaInicio(a6);

        //Printando lista de Alunos
        a1 = (Aluno) lista.Recupera(0);
        a2 = (Aluno) lista.Recupera(1);
        a3 = (Aluno) lista.Recupera(2);
        a4 = (Aluno) lista.Recupera(3);
        a5 = (Aluno) lista.Recupera(4);
        a6 = (Aluno) lista.Recupera(5);
        System.out.println(lista.tamanho());
           
        System.out.println(a1.getNome());
        System.out.println(a2.getNome());
        System.out.println(a3.getNome());
        System.out.println(a4.getNome());
        System.out.println(a5.getNome());
        System.out.println(a6.getNome());
           
        System.out.println("-".repeat(100));
        
        //Removendo Aluno que esta no inicio
        lista.trocarPosicao(4);
        
        a1 = (Aluno) lista.Recupera(0);
        a2 = (Aluno) lista.Recupera(1);
        a3 = (Aluno) lista.Recupera(2);
        a4 = (Aluno) lista.Recupera(3);
        a5 = (Aluno) lista.Recupera(4);
        a6 = (Aluno) lista.Recupera(5);
        System.out.println(lista.tamanho());
           
        System.out.println(a1.getNome());
        System.out.println(a2.getNome());
        System.out.println(a3.getNome());
        System.out.println(a4.getNome());
        System.out.println(a5.getNome());
        System.out.println(a6.getNome());
           
        System.out.println("-".repeat(100));
        
        
}
}


