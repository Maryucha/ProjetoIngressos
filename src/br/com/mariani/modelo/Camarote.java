package br.com.mariani.modelo;

import br.com.mariani.controle.TrasCoisas;

/**
 *
 * @author maryucha
 */
public class Camarote extends Ingresso implements TrasCoisas{

  private  final double vlrCamarore=500;

    public Camarote() {
        
    }

    public Camarote(double vlrCamarore, double vlrIngresso) {
        super(vlrIngresso);
      
    }

    public double getVlrCamarore() {
        return vlrCamarore+super.getVlrIngresso();
    }

    @Override
    public void tipoIngresso() {
        String tipoCamarote = "CAMAROTE";
    }
  
  
}
