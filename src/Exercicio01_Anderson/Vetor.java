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
    
    public void adicionaInicio(T elemento){
        if (tamanho() >= vetor.length-1){
        redimensionar(vetor);
    }
    Iterator iter = new Iterador(vetor);
    int i = 0;
    T empurrar1 = vetor[0];
    T empurrar2 = empurrar1;
    
    while (iter.hasNext()){
        if(i < tamanho() && vetor[i] != null){
            if (vetor[i + 1] == null){
                empurrar2 = vetor[i + 1];
                vetor[i + 2] = empurrar1;
                break;
            }
            empurrar2 = vetor[i + 1];
            vetor[i + 1] = empurrar1;
            empurrar1 = empurrar2;
        } else{
            break;
        }
        i++;
    }
    vetor[0] = elemento;
    qntElementos++;
    
   }
    
    public void adicionaPosicao(T elemento, int pos){
        if (tamanho() >= vetor.length-1){
        redimensionar(vetor);
    }
    if ((pos < 0 && pos > vetor.length)){
        throw new ArrayIndexOutOfBoundsException("Posição Invalida");
    }
    Iterator iter = new Iterador(vetor);
    int i = 0;
    int count = 0;
    T empurrar1 = vetor[0];
    T empurrar2 = empurrar1;
    
    if (!existeDado(pos)){
        vetor[pos] = elemento;
        qntElementos++;
    } else if (existeDado(pos)){
        while (iter.hasNext()){
            if(count >= pos && count <= tamanho()){
                if (vetor[i + 1] == null){
                    empurrar2 = vetor[i + 1];
                    vetor[i + 1] = empurrar1;
                    break;
                }
                i++;
                count++;
            }
            vetor[pos] = elemento;
            qntElementos++;
        }
    }
    
    while (iter.hasNext()){
        if(i < tamanho() && vetor[i] != null){
            if (vetor[i + 1] == null){
                empurrar2 = vetor[i + 1];
                vetor[i + 2] = empurrar1;
                break;
            }
            empurrar2 = vetor[i + 1];
            vetor[i + 1] = empurrar1;
            empurrar1 = empurrar2;
        } else{
            break;
        }
        i++;
    }
    vetor[0] = elemento;
    qntElementos++;
    
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
    
    public void redimensionar(T[] vetor){
        T[] newVetor = (T[]) new Object[tamanho() * 2];
        for (int i = 0; i <= tamanho(); i++){
            newVetor[i] = vetor[i];
        }
        this.vetor = newVetor;
    }
    
    
//    public void removerFim(){
//        for(int i = 0; i < vetor.length; i++){
//            if (vetor[i] == i){
//                
//            }
//        }
//    }
    

    
    
}
