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
public class Terrestre extends Vehículo{
    private String num_registro,serie;
    private Date fecha_registro;

    public Terrestre(String num_registro, String serie, Date fecha_registro, String marca, String modelo, String color, String precio) {
        super(marca, modelo, color, precio);
        this.num_registro = num_registro;
        this.serie = serie;
        this.fecha_registro = fecha_registro;
    }

    public String getNum_registro() {
        return num_registro;
    }

    public void setNum_registro(String num_registro) {
        this.num_registro = num_registro;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }
    
    @Override
    public void encender(){} 
    @Override
   public void detenerse(){}
    @Override
   public void acelerar(){}
    @Override
   public void frenar(){}
    
   public void arrancar(){}
}
