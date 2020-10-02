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



public class ListaEncadeada<T> {
    
    private Celula primeira;
    
    private Celula ultima;
    
    private int totalDeElementos;
    
    
    public ListaEncadeada(){
        this.primeira = null;
        this.ultima = null;
        this.totalDeElementos = 0;
    }
    
    //Adicionar no Inicio da lista
    public void adicionaInicio(T elemento){//Funcionando
        Celula nova = new Celula(elemento);
        //Se a lista for vazia 
        if( this.totalDeElementos == 0){
            ultima = nova;
            primeira = nova;
            this.totalDeElementos++;
        } else{
            nova.setProxima(primeira);
            primeira = nova;
            this.totalDeElementos ++;
        }
    }
    
    public void removeInicio(){//Funcionando
        Celula nova = new Celula();
        if( this.totalDeElementos == 0){
            throw new ArrayIndexOutOfBoundsException("Lista está vazia!");
        } else if (this.totalDeElementos == 1){
            limparLista();
            totalDeElementos--;
        } else {
            nova = primeira.getProxima();
            primeira.setProxima(null);
            primeira = nova;
            totalDeElementos--;
        }
        
        
    }
    
    public void adicionaFim(T elemento){//Funcionando
        Celula nova = new Celula(elemento);
        if ( tamanho() == 0){
            this.adicionaInicio(elemento);
            primeira = nova;
            ultima = nova;
            totalDeElementos++;
        } else{
            nova.setProxima(null);
            ultima.setProxima(nova);
            ultima = nova;
            totalDeElementos++;
        }
    }
    
//    public void adicionaPosicao(int pos, Lista elemento){
//        Iterador iter = new Iterador();
//        if ( tamanho() == 0){
//            this.adicionaInicio(elemento);
//        } 
//        if ( pos < 0 || pos > tamanho()){
//            System.out.println("Posição invalida");
//        }
//        
//        else{
//            for( int i = 0; i < tamanho() - 1; i++){
//                atual = atual.getProxima();
//            }
//        }
//    }
    
    
    public int tamanho(){
        return this.totalDeElementos;
    }
    
    public T Recupera(int posicao) {
        
        if (tamanho() == 0) {
            
            System.out.println("A lista está vazia!!");
            return null;
            
        } else if (posicao < 0 || posicao >= tamanho()) {
            
            System.out.println("A Posição " + posicao + " é Inválida!");
            return null;
            
        } else {
            
            Iterador it = new Iterador(this.primeira);
            int i = 0;
            while (it.hasNext()) {
                if (i != posicao) {
                    it.next();
                    i++;
                } else {
                    break;
                }
            }
            
            return (T) it.getAtual().getElemento();
        }
    }
    
    public void limparLista(){
        if (this.totalDeElementos == 0){
            throw new ArrayIndexOutOfBoundsException("Lista já está vazia!");
        } else{
            primeira = null;
            ultima = null;
        }
    }

    
}
