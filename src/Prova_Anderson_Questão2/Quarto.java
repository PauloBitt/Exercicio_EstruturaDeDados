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
public class Quarto {
    private int numero;
    private int andar;

    public Quarto(){
        this.numero = 0;
        this.andar = 0;
    }

    public Quarto(int numero, int andar) {
        this.numero = numero;
        this.andar = andar;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    
}
