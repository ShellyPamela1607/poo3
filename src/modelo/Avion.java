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
public class Avion extends Aereo {
     private String puerta,estilo,pasajeros,tripulacion,aerolinea,matricula;

    public Avion(String puerta, String estilo, String pasajeros, String tripulacion, String aerolinea, String matricula, String num_registro, String serie, String ubicacion, Date fecha_registro, String marca, String modelo, String color, String precio) {
        super(num_registro, serie, ubicacion, fecha_registro, marca, modelo, color, precio);
        this.puerta = puerta;
        this.estilo = estilo;
        this.pasajeros = pasajeros;
        this.tripulacion = tripulacion;
        this.aerolinea = aerolinea;
        this.matricula = matricula;
    }

    public String getPuerta() {
        return puerta;
    }

    public void setPuerta(String puerta) {
        this.puerta = puerta;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(String pasajeros) {
        this.pasajeros = pasajeros;
    }

    public String getTripulacion() {
        return tripulacion;
    }

    public void setTripulacion(String tripulacion) {
        this.tripulacion = tripulacion;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
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
