/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cochecillo;

/**
 *
 * @author cibarba
 */
public class Motor {
    private String cilindraje;
    private double litros;
    private boolean filtroAire;
    
    public void setCilindraje(String cilindraje){
        this.cilindraje = cilindraje;
    }
    
    public String getCilindraje(){
        return cilindraje;
    }
    
    public void setLitros(double litros){
        this.litros = litros;
    }
    
    public double getLitros(){
        return litros;
    }
    
    public void setFiltroAire(boolean filtroAire){
        this.filtroAire = filtroAire;
    }
    
    public boolean isFiltroAire(){
        return filtroAire;
    }
}
