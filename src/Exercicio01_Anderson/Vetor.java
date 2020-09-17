/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Exercicio01_Anderson;

import java.util.*;

/**
 *
 * @author paulo
 */
public class Vetor<T> {
    
    
    //Vetor Generico
    private T[] vetor;
    
    //Variavel da quantidades de elementos
    private int qntElementos = 0;
    
    //
    public Vetor(){
        this.vetor = vetor;
    }
    
    //Construtor específico da Classe Vetor
    public Vetor(int tamanho){
        
        //Novo Vetor Génerico
        vetor = (T[]) new Object[tamanho];
        
        this.qntElementos = tamanho;
        
    }
    
    public boolean existeDado(int posicao){
        return vetor[posicao] != null;
    }
    
    private int tamanho(){
        return this.qntElementos;
    }
    
    public T recuperar(int posicao){
        if ((posicao < 0 && posicao > tamanho()) || (!existeDado(posicao))){
            throw new ArrayIndexOutOfBoundsException("Posição Invalida");
        }
        return vetor[posicao];
    }
    
    public void redimensionar(){
        if(this.qntElementos == vetor.length){
            Vetor[] newArray = new Vetor[vetor.length * 2];
            for(int i=0; i < vetor.length; i++){
                newArray[i] = (Vetor)this.vetor[i];
                System.out.println(newArray[i]);
            }
            for (int h = 0; h < newArray.length; h++){
                this.vetor[h] = (T) newArray[h];
            }
        }
    }
    
    public void adicionar(T elemento){
        if(tamanho() == vetor.length){
            System.out.println("Redimencionando" + " " + tamanho());
            redimensionar();
        }
    }
    
    public void removerFim(){
        for(int i = 0; i < vetor.length; i++){
            if (vetor[i] == i){
                
            }
        }
    }
    
    public void adicionaPos(T elemento, int posicao){
        if (tamanho() >= vetor.length-1){
        redimensionar(vetor);
    }
   }
    
    Iterador it = new Iterador(vetor);
    
}
