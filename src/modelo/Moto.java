/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Shelly Pam
 */
public class Moto extends Terrestre {
    private String placa,estilo,rin;
    private int descuento;

    public Moto(String placa, String estilo, String rin, int descuento, String num_registro, String serie, Date fecha_registro, String marca, String modelo, String color, String precio) {
        super(num_registro, serie, fecha_registro, marca, modelo, color, precio);
        this.placa = placa;
        this.estilo = estilo;
        this.rin = rin;
        this.descuento = descuento;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getRin() {
        return rin;
    }

    public void setRin(String rin) {
        this.rin = rin;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
    @Override
    public void encender(){} 
    @Override
   public void detenerse(){}
    @Override
   public void acelerar(){}
    @Override
   public void frenar(){}
    
    @Override
   public void arrancar(){}
   public void agregar(){}
   public void modificar(){}
   public void eliminar(){}
}
