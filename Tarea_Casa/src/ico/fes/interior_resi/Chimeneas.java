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
public class Chimeneas {
    private String material;
    private boolean electrica;
    private float tamaño;

    public Chimeneas() {
    }

    public Chimeneas(String material, boolean electrica, float tamaño) {
        this.material = material;
        this.electrica = electrica;
        this.tamaño = tamaño;
    }

    public float getTamaño() {
        return tamaño;
    }

    public void setTamaño(float tamaño) {
        this.tamaño = tamaño;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isElectrica() {
        return electrica;
    }

    public void setElectrica(boolean electrica) {
        this.electrica = electrica;
    }
    
    public void encender(){
        System.out.println("Encendiendo...");
    }
    
    public void apagar(){
        System.out.println("Apagando...");
    }
}
