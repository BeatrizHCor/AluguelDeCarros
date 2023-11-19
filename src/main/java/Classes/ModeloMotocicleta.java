/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author beatr
 */
public enum ModeloMotocicleta {
    cg("CG 125"), t("Twister"), n("Ninja");
    private final String modelo;
    
    ModeloMotocicleta(String modelo){
        this.modelo = modelo;
    }
    
    public String getModelo(){
        return this.modelo;
    }
}
