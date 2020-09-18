/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio01_Anderson;

/**
 *
 * @author paulo
 */

import Exercicio01_Anderson.Aluno;

public class Main {
   public static void main(String[] args){
       Vetor<Aluno> vetor= new Vetor<Aluno>(2);
       
       Aluno a = new Aluno("ANA", 30);
       Aluno a2 = new Aluno("MARIA", 20);
       Aluno a3 = new Aluno("Claudiu", 18);
       Aluno a4 = new Aluno("Carlos", 19);
       Aluno a5 = new Aluno("paulo", 26);   
       
       vetor.adicionaPosicao(a, 1);
       vetor.adicionaFim(a2);
       vetor.adicionaFim(a3);
       
    
       System.out.println(vetor.tamanho());
       
       for (int i = 1; i < vetor.tamanho(); i++){
           System.out.println(vetor.recuperar(i).getNome());
       }
       System.out.println("-".repeat(100));
       vetor.adicionaInicio(a4);
       for (int i = 0; i < vetor.tamanho(); i++){
           System.out.println(vetor.recuperar(i).getNome());
       }
       System.out.println("-".repeat(100));
       vetor.removerFim();
       vetor.removerInicio();
       for (int i = 0; i < vetor.tamanho(); i++) {
            System.out.println(vetor.recuperar(i).getNome());
        }
       
       
       
   }
}
