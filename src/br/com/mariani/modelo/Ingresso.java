package br.com.mariani.modelo;

/**
 *
 * @author maryucha
 */
public abstract class Ingresso {
    private double vlrIngresso=50;
    
    public Ingresso(){
        
    }
    
    public Ingresso(double vlrIngresso) {
        this.vlrIngresso = vlrIngresso;
    }
    
    public double getVlrIngresso(){
        
        return vlrIngresso;
    }    

    public void setVlrIngresso(double vlrIngresso) {
        this.vlrIngresso = vlrIngresso;
    }
    
    
}
