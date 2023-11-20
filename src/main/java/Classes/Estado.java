/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author beatr
 */
public enum Estado {
    d("Disponivel"), v("Vendido"), l("Locado"), n("Novo");
    private final String atual;
    
    Estado(String atual){
        this.atual = atual;
    };
    
    public String getAtual(){
        return this.atual;
    }
}
