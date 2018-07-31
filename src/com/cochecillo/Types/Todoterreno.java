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
public class Todoterreno extends Coche {
    
    private boolean llantasAltas;
    private boolean ochoCilindros;
    private double suspensionHeight;
    
    public Todoterreno(){}
    
    public Todoterreno(String marca , int velocidad , boolean llantasAltas, boolean ochoCilindros){
        super(marca, velocidad);
        this.llantasAltas = llantasAltas;
        this.ochoCilindros = ochoCilindros;
    }

    /**
     * @return the llantasAltas
     */
    public void setSuspensionHeight(double suspensionHeight){
        this.suspensionHeight = suspensionHeight;
    }
    
    public double getSuspensionHeight(){
        return suspensionHeight;
    }
    
    
    public boolean isLlantasAltas() {
        return llantasAltas;
    }

    /**
     * @param llantasAltas the llantasAltas to set
     */
    public void setLlantasAltas(boolean llantasAltas) {
        this.llantasAltas = llantasAltas;
    }

    /**
     * @return the ochoCilindros
     */
    public boolean isOchoCilindros() {
        return ochoCilindros;
    }

    /**
     * @param ochoCilindros the ochoCilindros to set
     */
    public void setOchoCilindros(boolean ochoCilindros) {
        this.ochoCilindros = ochoCilindros;
    }
    
    
    
}
