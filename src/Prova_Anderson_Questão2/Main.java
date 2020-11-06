/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prova_Anderson_Questão2;

import Prova_Anderson_Questão1.*;
import Exercicio03_Anderson_ListaDuplamenteEncadeada.*;
import Exercicio02_Anderson_ListaEncadeada.*;

/**
 *
 * @author paulo
 */
public class Main {
    public static void main(String[] args) {
        //Estanciando alunos
	Quarto a1 = new Quarto(1, 2);
        Quarto a2 = new Quarto(3, 2);
        Quarto a3 = new Quarto(2, 2);
        Quarto a4 = new Quarto(2, 1);
        Quarto a5 = new Quarto(3, 1);
        
        //Criando a Lista Encadeada
        ListaEncadeadaProva lista = new ListaEncadeadaProva();

        //Adicionando Alunos no inicio da lista
        lista.adicionaInicio(a1);
        lista.adicionaInicio(a2);
        lista.adicionaInicio(a3);
        lista.adicionaInicio(a4);

        //Printando lista de Alunos
        a1 = (Quarto) lista.Recupera(0);
        a2 = (Quarto) lista.Recupera(1);
        a3 = (Quarto) lista.Recupera(2);
        a4 = (Quarto) lista.Recupera(3);
        System.out.println(lista.tamanho());
           
        System.out.println(a1.getAndar());
        System.out.println(a2.getAndar());
        System.out.println(a3.getAndar());
        System.out.println(a4.getAndar());
           
        System.out.println("-".repeat(100));
        
        //Removendo Aluno que esta no inicio
        lista.organizaQuartos();
        
        
        
}
}


