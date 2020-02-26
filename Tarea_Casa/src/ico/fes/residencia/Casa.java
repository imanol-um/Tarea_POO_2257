/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.residencia;

import ico.fes.interior_resi.Chimeneas;
import ico.fes.interior_resi.Cuartos;
import ico.fes.interior_resi.Muebles;

/**
 *
 * @author Imanol
 */
public class Casa {
   private Cuartos cuartos;
   private Muebles muebles;
   private Chimeneas chimeneas;

    public Casa() {
    }

    public Casa(Cuartos cuartos, Muebles muebles, Chimeneas chimeneas) {
        this.cuartos = cuartos;
        this.muebles = muebles;
        this.chimeneas = chimeneas;
    }

    public Chimeneas getChimeneas() {
        return chimeneas;
    }

    public void setChimeneas(Chimeneas chimeneas) {
        this.chimeneas = chimeneas;
    }

    public Cuartos getCuartos() {
        return cuartos;
    }

    public void setCuartos(Cuartos cuartos) {
        this.cuartos = cuartos;
    }

    public Muebles getMuebles() {
        return muebles;
    }

    public void setMuebles(Muebles muebles) {
        this.muebles = muebles;
    }
   
    public void remodelarCuartos(){
        System.out.println("Moviendo cosas...");
    }
    
    public void cambiarColorDeCasa(){
        System.out.println("Pintando Casa...");
    }
   
}
