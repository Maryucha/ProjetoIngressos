package br.com.mariani.main;

import br.com.mariani.main.controle.ControleEntradas;

/**
 *
 * @author maryucha
 */
public class Principal {

    public static void main(String[] args) {
        
        ControleEntradas controle = new  ControleEntradas();
        controle.controle();
    }
}
