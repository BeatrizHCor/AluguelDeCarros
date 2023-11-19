/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.Calendar;

/**
 *
 * @author beatr
 */
public class Van implements VeiculoI {
     private int ano;
        private String placa;
        private Estado estado;
        private Categoria categoria;
        private double valorDeVenda;
        private Locacao locacao;
        private Marca marca;
        private ModeloVan modelo;
        
        public Van(int ano, String placa, Categoria categoria, double valorDeVenda, Marca marca, ModeloVan modelo){
            this.ano = ano;
            this.placa = placa;
            this.estado = Estado.n;
            this.categoria = categoria;
            this.marca = marca;
            this.valorDeVenda = valorDeVenda;
            this.locacao = null;
            this.modelo = modelo;
        }
        
        @Override
        public Estado getEstado(){
            return this.estado;
        }
        
        @Override
        public int getAno(){
            return this.ano;
        }
        
        @Override
        public String getPlaca(){
            return this.placa;
        }
        
        @Override
        public Locacao getLocacao(){
            return this.locacao;
        }
        
        @Override
        public Categoria getCategoria(){
            return this.categoria;
        }
        
        @Override
        public double getValorParaVenda(){
            return this.valorDeVenda;
        }
        
        @Override
        public double getValorDiariaLocacao(){
            switch(this.categoria.getAtual()){
                default -> {
                    return 200.00;
                }
                case "Intermediário" -> {
                    return 400.00;
                }
                case "Luxo" -> {
                    return 600.00;
                }
                
            }
        }

    @Override
    public void locar(int dias, Calendar data, Cliente cliente) {
       double valor = this.getValorDiariaLocacao()*dias;
       this.locacao = new Locacao(cliente, this, data, dias, valor);
       this.estado = Estado.l;
    }

    @Override
    public void vender() {
        this.estado = Estado.v;
    }

    @Override
    public void devolver() {
       this.estado = Estado.d;
    }

    @Override
    public Marca getMarca() {
        return this.marca;
    }
                
}
