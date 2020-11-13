package br.com.mariani.modelo;

/**
 *
 * @author maryucha
 */
public class Camarote extends Ingresso{

  private double vlrCamarore=500;

    public Camarote() {
        
    }

    public Camarote(double vlrCamarore, double vlrIngresso) {
        super(vlrIngresso);
        this.vlrCamarore = vlrCamarore;
    }

    public double getVlrCamarore() {
        return vlrCamarore+super.getVlrIngresso();
    }
  
  

  
}
