/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author beatr
 */
public enum Marca {
    VW("Volkswagem"), GM("General Motos"), FI("Fiat"), Re("Renault");
    private final String marca;
    
    Marca(String marca){
        this.marca = marca;
    };
    
    public String getAtual(){
        return this.marca;
    }
}

