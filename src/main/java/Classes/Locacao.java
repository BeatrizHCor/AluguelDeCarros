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
public class Locacao {
        private Cliente cliente;
        private VeiculoI veiculo;
        private Calendar data;
        private int dias;
        private double valor;
        
        public double getValor(){
            return this.valor;
        }
        
        public Locacao(Cliente cliente, VeiculoI veiculo, Calendar data, int dias, double valor){
            this.cliente = cliente;
            this.veiculo = veiculo;
            this.data = data;
            this.dias = dias;
            this.valor = valor;
        }
        
        public Cliente getCliente(){
            return this.cliente;
        }
        public VeiculoI getVeiculo(){
            return this.veiculo;
        }
        public Calendar getData(){
            return this.data;
        }
        public int getDias(){
            return this.dias;
        }
        
}
