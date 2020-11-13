package br.com.mariani.main.controle;

import br.com.mariani.modelo.Camarote;
import br.com.mariani.modelo.Normal;
import br.com.mariani.modelo.Vip;

/**
 *
 * @author maryucha
 */
public class ControleEntradas {

   public void controle(){
       
       Normal normal = new Normal();
       Vip vip = new Vip();
       Camarote cam = new Camarote();
       
       System.out.println("------------TABELA DE PREÇO--------------"
                         +"\n Entrada Normal R$"+normal.getVlrNormal()
                         +"\n Entrada Vip R$"+vip.getVlrVip()
                         +"\n Entrada Camarote R$"+cam.getVlrCamarore());
       
   }
    
}
