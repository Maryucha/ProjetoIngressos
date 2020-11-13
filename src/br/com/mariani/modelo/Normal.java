package br.com.mariani.modelo;

/**
 *
 * @author maryucha
 */
public class Normal extends Ingresso {

    private double vlrNormal = 100;

    public Normal() {

    }

    public Normal(double vlrNormal, double vlrIngresso) {
        super(vlrIngresso);
        this.vlrNormal = vlrNormal;
    }

    public double getVlrNormal() {
        return vlrNormal + super.getVlrIngresso();
    }

}
