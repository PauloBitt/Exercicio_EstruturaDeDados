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
        
import java.util.Iterator;
public class Iterador<T> implements Iterator{
    
    T[] itens;
    int posicao = 0;
    
    public Iterador(T[] itens){
        this.itens = itens;
    }
    
    public boolean hasNext(){
        if(posicao < 0 || posicao >= itens.length){
            return false;
        } else {
            return true;
        }
    }
        public Object next(){
            Object item = itens[posicao];
            posicao++;
            return item;
        }
    }
    

