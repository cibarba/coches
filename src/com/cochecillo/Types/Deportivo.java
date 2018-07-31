/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cochecillo.Types;

import com.cochecillo.Coche;

/**
 *
 * @author cibarba
 */
public class Deportivo extends Coche {
    
    private boolean roadster;
    private boolean motor;
    private boolean puertasAlas;
    
    public Deportivo(){}
    
    public Deportivo(String marca , int velocidad , boolean roadster, boolean motor, boolean puertasAlas){
        super(marca , velocidad);
        this.roadster = roadster;
        this.motor = motor;
        this.puertasAlas = puertasAlas;
    }

    /**
     * @return the tipo
     */
    public boolean isRoadster() {
        return roadster;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setRoadster(boolean roadster) {
        this.roadster = roadster;
    }

    /**
     * @return the motor
     */
    public boolean isMotor() {
        return motor;
    }

    /**
     * @param motor the motor to set
     */
    public void setMotor(boolean motor) {
        this.motor = motor;
    }

    /**
     * @return the puertasAlas
     */
    public boolean isPuertasAlas() {
        return puertasAlas;
    }

    /**
     * @param puertasAlas the puertasAlas to set
     */
    public void setPuertasAlas(boolean puertasAlas) {
        this.puertasAlas = puertasAlas;
    }
    
    
    
}
