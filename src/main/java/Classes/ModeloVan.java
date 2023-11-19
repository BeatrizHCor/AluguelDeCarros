/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author beatr
 */
public enum ModeloVan {
    k("Kombi"), s("Sprinter"), a("Authentic");
    private final String modelo;
    
    ModeloVan(String modelo){
        this.modelo = modelo;
    }
    public String getModelo(){
        return this.modelo;
    }
}
