/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio02_Anderson_ListaEncadeada;

/**
 *
 * @author paulo
 */
public class Main {
    public static void main(String[] args) {
	 Aluno a1 = new Aluno("Anderson", 40);
            Aluno a2 = new Aluno("Brenno", 19);
            Aluno a3 = new Aluno("Francisco", 19);
            Aluno a4 = new Aluno("VinyJ", 20);

            ListaEncadeada lista = new ListaEncadeada();

           lista.adicionaInicio(a1);
           lista.adicionaInicio(a2);
           lista.adicionaInicio(a3);

           a1 = (Aluno) lista.Recupera(0);
           a2 = (Aluno) lista.Recupera(1);
           a3 = (Aluno) lista.Recupera(2);
           System.out.println(lista.tamanho());
           
           System.out.println(a1.getNome());
           System.out.println(a2.getNome());
           System.out.println(a3.getNome());
           
           System.out.println("-".repeat(100));
           
           lista.removeInicio();
           
           a1 = (Aluno) lista.Recupera(0);
           a2 = (Aluno) lista.Recupera(1);
           System.out.println(a1.getNome());
           System.out.println(a2.getNome());
           
           
           System.out.println("-".repeat(100));
           lista.adicionaFim(a4);
           a1 = (Aluno) lista.Recupera(0);
           a2 = (Aluno) lista.Recupera(1);
           a4 = (Aluno) lista.Recupera(2);
           System.out.println(a1.getNome());
           System.out.println(a2.getNome());
           System.out.println(a4.getNome());
}
}


