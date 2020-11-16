package br.com.mariani.modelo;

import br.com.mariani.controle.TrasCoisas;

/**
 *
 * @author maryucha
 */
public class Vip extends Ingresso implements TrasCoisas{

    private final double vlrVip=200;

    public Vip() {
        
    }

    public Vip(double vlrVip, double vlrIngresso) {
        super(vlrIngresso);
        
    }

    public double getVlrVip() {
        return vlrVip+super.getVlrIngresso();
    }

    @Override
    public void tipoIngresso() {
       String tipoCamarote = "VIP";
    }
    
}
