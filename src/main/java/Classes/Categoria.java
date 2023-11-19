/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author beatr
 */
public enum Categoria {
     p("Popular"), i("Intermediário"), l("Luxo");
    private final String categoria;
    
    Categoria(String categoria){
        this.categoria = categoria;
    };
    
    public String getAtual(){
        return this.categoria;
    }
}
