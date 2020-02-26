package ico.fes.interior_resi;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Imanol
 */
public class Cuartos {
    private int ventanas;
    private int puertas;
    private boolean camas;

    public Cuartos() {
    }

    public Cuartos(int ventanas, int puertas, boolean camas) {
        this.ventanas = ventanas;
        this.puertas = puertas;
        this.camas = camas;
    }

    public int getVentanas() {
        return ventanas;
    }

    public void setVentanas(int ventanas) {
        this.ventanas = ventanas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public boolean isCamas() {
        return camas;
    }

    public void setCamas(boolean camas) {
        this.camas = camas;
    }
    
    public void abrirVentanas(){
        System.out.println("Abriendo ventanas...");
    }
    
    public void abrirPuertas(){
        System.out.println("Abriendo puertas...");
    }
}
