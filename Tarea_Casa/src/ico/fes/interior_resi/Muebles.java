/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.interior_resi;

/**
 *
 * @author Imanol
 */
public class Muebles {   
    private String marca;
    private float tamañoLargo;
    private float tamañoAncho;

    public Muebles() {
    }

    public Muebles(String marca, float tamañoLargo, float tamañoAncho) {
        this.marca = marca;
        this.tamañoLargo = tamañoLargo;
        this.tamañoAncho = tamañoAncho;
    }

    public float getTamañoAncho() {
        return tamañoAncho;
    }

    public void setTamañoAncho(float tamañoAncho) {
        this.tamañoAncho = tamañoAncho;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getTamañoLargo() {
        return tamañoLargo;
    }

    public void setTamañoLargo(float tamañoLargo) {
        this.tamañoLargo = tamañoLargo;
    }
    
    public void guardarCosas(){
        System.out.println("Guardando...");
    }
    
    public void sacarCosas(){
        System.out.println("Sacando...");
    }
    
}
