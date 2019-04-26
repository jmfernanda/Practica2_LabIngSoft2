/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.Date;

/**
 *
 * @author INGESIS
 */
public class ViajeFamiliar extends Viaje {
 /**
 * Cantidad de integrantes de la familia
 */
    private int familia;
    //Constructor getters and setters

    public ViajeFamiliar(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada,int familia) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
        this.familia = familia;
    }

    public int getFamilia() {
        return familia;
    }

    public void setFamilia(int familia) {
        this.familia = familia;
    }    
    
    //Otros métodos
    
    @Override
    public String descripcion() {
    return "Viaje para disfrutar con toda tu familia";
    }
    @Override
    public String cualquierMetodo2() {
    return "Método implementado en la clase hija viaje familiar";
    }
}
