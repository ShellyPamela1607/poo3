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
public class Automovil extends Terrestre{
    private String placa,llantas,ventana,asientos;
    private int num_puertas,num_ventanas,descuento;

    public Automovil(String placa, String llantas, String ventana, String asientos, int num_puertas, int num_ventanas, int descuento, String num_registro, String serie, Date fecha_registro, String marca, String modelo, String color, String precio) {
        super(num_registro, serie, fecha_registro, marca, modelo, color, precio);
        this.placa = placa;
        this.llantas = llantas;
        this.ventana = ventana;
        this.asientos = asientos;
        this.num_puertas = num_puertas;
        this.num_ventanas = num_ventanas;
        this.descuento = descuento;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getLlantas() {
        return llantas;
    }

    public void setLlantas(String llantas) {
        this.llantas = llantas;
    }

    public String getVentana() {
        return ventana;
    }

    public void setVentana(String ventana) {
        this.ventana = ventana;
    }

    public String getAsientos() {
        return asientos;
    }

    public void setAsientos(String asientos) {
        this.asientos = asientos;
    }

    public int getNum_puertas() {
        return num_puertas;
    }

    public void setNum_puertas(int num_puertas) {
        this.num_puertas = num_puertas;
    }

    public int getNum_ventanas() {
        return num_ventanas;
    }

    public void setNum_ventanas(int num_ventanas) {
        this.num_ventanas = num_ventanas;
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
