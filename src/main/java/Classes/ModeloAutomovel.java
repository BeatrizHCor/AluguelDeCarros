/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author beatr
 */
public enum ModeloAutomovel {
    c("Celta"), k("Kwid"), u("Uno"), g("gol");
    
    private final String modelo;
    
    ModeloAutomovel(String modelo){
        this.modelo = modelo;
    }
    
    public String getModelo(){
        return this.modelo;
    }
}
