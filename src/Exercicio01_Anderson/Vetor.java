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
    
    //Adicionar elemento no Inicio
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
    
    //Adicionar elemento em Posição indicada
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
    
    //Adicionar elemento no fim
    public void adicionaFim(T elemento){
        if (tamanho() >= vetor.length-1){
        redimensionar(vetor);
    }
        
    Iterator iter = new Iterador(vetor);
    int i = 0;
    int count = tamanho();
    
    while (iter.hasNext()){
        if(!existeDado(i) && count == 0){
                vetor[i] = elemento;
                qntElementos++;
                break;
            }else if (existeDado(i)){
            count--;
        }
        i++;
    }
   }
    
    //Verificar se existe dado
    public boolean existeDado(int posicao){
        return vetor[posicao] != null;
    }
    
    //Retorna o tamanho do array
    private int tamanho(){
        return this.qntElementos;
    }
    
    //Retorna o valor na posição 
    public T recuperar(int posicao){
        if ((posicao < 0 && posicao > tamanho()) || (!existeDado(posicao))){
            throw new ArrayIndexOutOfBoundsException("Posição Invalida");
        }
        return vetor[posicao];
    }
    
    //Redimensiona(Dobra o tamanho)
    public void redimensionar(T[] vetor){
        T[] newVetor = (T[]) new Object[tamanho() * 2];
        for (int i = 0; i <= tamanho(); i++){
            newVetor[i] = vetor[i];
        }
        this.vetor = newVetor;
    }
    
    //Esvazia o vetor
    public void limpar(){
        if(!vazio(vetor)){
            Iterator iter = new Iterador(vetor);
            int i = 0;
            while (iter.hasNext()){
                if (i > vetor.length - 1){
                    break;
                } else {
                    vetor[i] = null;
                }
            }
            qntElementos = 0;
        }
    }
    
    //Verificar se o vetor esta vazio
    public boolean vazio(T[] vetor){
        return tamanho() == 0;
    }
    
}
