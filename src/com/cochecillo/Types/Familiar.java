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
public class Familiar extends Coche {
    
    private boolean puertaCorrediza;
    private int asientos;
    private int trunkSize;
    
    public Familiar(){}
    
    public Familiar (String marca , int velocidad , boolean puertaCorrediza , int asientos){
        super(marca , velocidad);
        this.puertaCorrediza = puertaCorrediza;
        this.asientos = asientos;
    }

    /**
     * @return the puertaCorrediza
     */
    
    public void setTrunkSize(int trunkSize){
        this.trunkSize = trunkSize;
    }
    
    public int getTrunkSize(){
        return trunkSize;
    }
    
    public boolean isPuertaCorrediza() {
        return puertaCorrediza;
    }

    /**
     * @param puertaCorrediza the puertaCorrediza to set
     */
    public void setPuertaCorrediza(boolean puertaCorrediza) {
        this.puertaCorrediza = puertaCorrediza;
    }

    /**
     * @return the asientos
     */
    public int getAsientos() {
        return asientos;
    }

    /**
     * @param asientos the asientos to set
     */
    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }
    
    
    
}
