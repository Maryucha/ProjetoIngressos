package br.com.mariani.modelo;

/**
 *
 * @author maryucha
 */
public class Vip extends Ingresso{

    private double vlrVip=200;

    public Vip() {
        
    }

    public Vip(double vlrVip, double vlrIngresso) {
        super(vlrIngresso);
        this.vlrVip = vlrVip;
    }

    public double getVlrVip() {
        return vlrVip+super.getVlrIngresso();
    }
    
}
