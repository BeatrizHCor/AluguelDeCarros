/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author beatr
 */
public class Cliente {
    private String nome;
    private String sobreNome;
    private String CPF;
    private String RG;
    private String Endereco;
    
    public Cliente(String nome, String sobreNome, String CPF, String RG, String Endereco ){
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.CPF = CPF;
        this.RG = RG;
        this.Endereco = Endereco;
    };
    
    public String getNome(){
        return this.nome + " " + this.sobreNome;
    };
    
    public String getCPF(){
        return this.CPF;
    };
    
    public String getRG(){
        return this.RG;
    };
    
    public String getEndereco(){
      return this.Endereco;
    };
    
    public void changeNome(String nome){
        this.nome = nome;
    };
    public void changeSobreNome(String sobreNome){
        this.sobreNome = sobreNome;
    };
    public void changeRG(String RG){
        this.RG = RG;
    };
    public void changeEndereco(String Endereco){
        this.Endereco = Endereco;
    };
    public void changeCPF(String CPF){
        this.CPF = CPF;
    };
    
    
}
