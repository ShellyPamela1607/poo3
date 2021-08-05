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
public class Helicoptero extends Aereo{
     private String puerta,asientos,helices,ruedas,matricula,uso;

    public Helicoptero(String puerta, String asientos, String helices, String ruedas, String matricula, String uso, String num_registro, String serie, String ubicacion, Date fecha_registro, String marca, String modelo, String color, String precio) {
        super(num_registro, serie, ubicacion, fecha_registro, marca, modelo, color, precio);
        this.puerta = puerta;
        this.asientos = asientos;
        this.helices = helices;
        this.ruedas = ruedas;
        this.matricula = matricula;
        this.uso = uso;
    }

    public String getPuerta() {
        return puerta;
    }

    public void setPuerta(String puerta) {
        this.puerta = puerta;
    }

    public String getAsientos() {
        return asientos;
    }

    public void setAsientos(String asientos) {
        this.asientos = asientos;
    }

    public String getHelices() {
        return helices;
    }

    public void setHelices(String helices) {
        this.helices = helices;
    }

    public String getRuedas() {
        return ruedas;
    }

    public void setRuedas(String ruedas) {
        this.ruedas = ruedas;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
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
   public void volar(){}
   public void agregar(){}
   public void modificar(){}
   public void eliminar(){}
}
