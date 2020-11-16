package br.com.mariani.modelo;

import br.com.mariani.controle.TrasCoisas;

/**
 *
 * @author maryucha
 */
public class Normal extends Ingresso implements TrasCoisas{

    private final double vlrNormal = 100;

    public Normal() {

    }

    public Normal(double vlrNormal, double vlrIngresso) {
        super(vlrIngresso);
       
    }

    public double getVlrNormal() {
        return vlrNormal + super.getVlrIngresso();
    }

    @Override
    public void tipoIngresso() {
        String tipoCamarote = "NORMAL";
    }

}
